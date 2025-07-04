package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import static chess.ChessPiece.PieceType.*;

/**
 * For a class that can manage a chess game, making moves on a board
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessGame
{
    private TeamColor team;
    private ChessBoard board;

    public ChessGame() {}

    @Override
    public boolean equals(Object o)
    {
        if (o == null || getClass() != o.getClass()) return false;
        ChessGame chessGame = (ChessGame) o;
        return team == chessGame.team && Objects.equals(board, chessGame.board);
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(team, board);
    }
    @Override
    public String toString()
    {
        return "ChessGame{" +
                "team=" + team +
                ", board=" + board +
                '}';
    }

    /**
     * @return Which team's turn it is
     */
    public TeamColor getTeamTurn()
    {
        return this.team;
    }

    /**
     * Set's which teams turn it is
     *
     * @param team the team whose turn it is
     */
    public void setTeamTurn(TeamColor team) //I think this is just here for testing.
    {
        this.team = team;
    }

    /**
     * Enum identifying the 2 possible teams in a chess game
     */
    public enum TeamColor
    {
        WHITE, BLACK
    }

    /**
     * Gets a valid moves for a piece at the given location
     *
     * @param startPosition the piece to get valid moves for
     * @return Set of valid moves for requested piece, or null if no piece at
     * startPosition
     */
    public Collection<ChessMove> validMoves(ChessPosition startPosition) // should filter for moves that can't be made because of check / checkmate
    {
        ArrayList<ChessMove> valid = new ArrayList<>();

        ChessBoard board = getBoard();

        if (board.getPiece(startPosition) == null)
        {
            return valid;
        }

        ChessPiece pie = board.getPiece(startPosition);
        ArrayList<ChessMove> unfilteredMoves = new ArrayList<>();
        unfilteredMoves = (ArrayList<ChessMove>) pie.pieceMoves(board, startPosition);
        TeamColor color = getTeamTurn();

        for (ChessMove move : unfilteredMoves)
        {
            board.removePiece(move.getStartPosition());
            if (move.getPromotionPiece() == null) //not a pawn
            {
                board.addPiece(move.getEndPosition(), board.getPiece(startPosition));
            }

            else
            {
                ChessPiece pie2 = new ChessPiece(pie.getTeamColor(), move.getPromotionPiece());
                board.addPiece(move.getEndPosition(), pie2);
            }

            if (!isInCheck(color))
            {
                valid.add(move); // after making the move, if the team is not in check then add the move to the filtered "valid" array
            }

            board.addPiece(startPosition, board.getPiece(startPosition)); //undo move
            board.removePiece(move.getEndPosition()); //undo move
        }

        return valid;
    }

    /**
     * Makes a move in a chess game
     *
     * @param move chess move to perform
     * @throws InvalidMoveException if move is invalid
     */
    public void makeMove(ChessMove move) throws InvalidMoveException //deals with pawn promotions as well
    {
        if (board == null)
        {
            return;
        }

        ChessPiece p1 = board.getPiece(move.getStartPosition());

        if (p1.getTeamColor() != getTeamTurn()) // If given a move for the wrong team (not their turn), throw an InvalidMoveException.
        {
            throw new InvalidMoveException();
        }

        ChessPosition startPosition = move.getStartPosition();

        if (validMoves(startPosition) != null)
        {
            board.removePiece(move.getStartPosition());

            if (move.getPromotionPiece() != null)
            {
                ChessPiece pie2 = new ChessPiece(p1.getTeamColor(), move.getPromotionPiece());
                board.addPiece(move.getEndPosition(), pie2);
            }

            else
            {
                board.addPiece(move.getEndPosition(), board.getPiece(startPosition));
            }
        }
    }

    public void undoMakeMove(ChessMove move)
    {
        board.removePiece(move.getEndPosition());
        ChessPiece p1 = board.getPiece(move.getStartPosition());

        if (p1 != null && move.getPromotionPiece() != null)
        {
            ChessPiece pie2 = new ChessPiece(p1.getTeamColor(), move.getPromotionPiece());
            board.addPiece(move.getEndPosition(), pie2);
        }

        else
        {
            board.addPiece(move.getStartPosition(), board.getPiece(move.getStartPosition()));
        }
    }

    /**
     * Determines if the given team is in check
     *
     * @param teamColor which team to check for check
     * @return True if the specified team is in check
     */
    public boolean isInCheck(TeamColor teamColor)
    {
        ChessBoard board = getBoard();

        for (int i = 1; i < 9; i++)
        {
            for (int j = 1; j < 9; j++)
            {
                ChessPosition pos = new ChessPosition(i, j);

                if (board == null)
                {
                    break;
                }

                ChessPiece pi = board.getPiece(pos);

                if (pi == null)
                {
                    continue;
                }

                if (pi.getTeamColor() != teamColor)
                {
                    ArrayList<ChessMove> moveski = new ArrayList<>();
                    moveski = (ArrayList<ChessMove>) pi.pieceMoves(board, pos);
                    for (ChessMove move : moveski)
                    {
                        ChessPosition pos2 = new ChessPosition(move.getEndPosition().getRow(), move.getEndPosition().getColumn());
                        ChessPiece pie = board.getPiece(pos2);

                        if (pie != null && pie.getPieceType() == KING && pie.getTeamColor() == teamColor)
                        {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /**
     * Determines if the given team is in checkmate
     *
     * @param teamColor which team to check for checkmate
     * @return True if the specified team is in checkmate
     */
    public boolean isInCheckmate(TeamColor teamColor)
    {
        if (!isInCheck(teamColor))
        {
            return false;
        }

        else
        {
            for (int i = 1; i < 9; i++)
            {
                for (int j = 1; j < 9; j++)
                {
                    ChessPosition pos = new ChessPosition(i, j);
                    ChessPiece piece = board.getPiece(pos);

                    if (piece != null && piece.getTeamColor() != teamColor)
                    {
                        ArrayList<ChessMove> moveski = new ArrayList<>();
                        moveski = (ArrayList<ChessMove>) piece.pieceMoves(board, pos);

                        for (ChessMove move : moveski)
                        {
                            board.removePiece(move.getStartPosition());

                            if (move.getPromotionPiece() == null)
                            {
                                board.addPiece(move.getEndPosition(), board.getPiece(move.getStartPosition()));
                            }

                            else //Exception for pawns
                            {
                                ChessPiece pie = new ChessPiece(piece.getTeamColor(), move.getPromotionPiece());
                                board.addPiece(move.getEndPosition(), pie);
                            }

                            if (!isInCheck(teamColor))
                            {
                                undoMakeMove(move);
                                return false;
                            }

                            else
                            {
                                undoMakeMove(move);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    /**
     * Determines if the given team is in stalemate, which here is defined as having
     * no valid moves
     *
     * @param teamColor which team to check for stalemate
     * @return True if the specified team is in stalemate, otherwise false
     */
    public boolean isInStalemate(TeamColor teamColor)
    {
        if (isInCheck(teamColor) || isInCheckmate(teamColor))
        {
            return false;
        }

        ChessBoard board = getBoard();

        for (int i = 1; i < 9; i++)
        {
            for (int j = 1; j < 9; j++)
            {
                ChessPosition pos = new ChessPosition(i, j);
                ChessPiece piece = board.getPiece(pos);

                if (piece != null && piece.getTeamColor() == teamColor)
                {
                    ArrayList<ChessMove> moveski = new ArrayList<>();
                    moveski = (ArrayList<ChessMove>) piece.pieceMoves(board, pos);

                    if (!moveski.isEmpty())
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     * Sets this game's chessboard with a given board
     *
     * @param board the new board to use
     */
    public void setBoard(ChessBoard board)
    {
        this.board = board;
    }

    /**
     * Gets the current chessboard
     *
     * @return the chessboard
     */
    public ChessBoard getBoard()
    {
        return this.board;
    }
}
