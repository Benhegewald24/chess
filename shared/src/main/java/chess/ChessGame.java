package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import static chess.ChessPiece.PieceType.KING;
import static chess.ChessPiece.PieceType.PAWN;

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
    public Collection<ChessMove> validMoves(ChessPosition startPosition) throws InvalidMoveException //this method should filter for moves that cannot be made because of check / checkmate
    {
        ArrayList<ChessMove> valid = new ArrayList<>();

        ChessBoard board = getBoard();

        if (board.getPiece(startPosition) == null) // If no piece at startPosition, return null.
        {
            return valid; //at this point valid should still be empty
        }

        ChessPiece pie = board.getPiece(startPosition);
        ArrayList<ChessMove> unfilteredMoves = new ArrayList<>();
        unfilteredMoves = (ArrayList<ChessMove>) pie.pieceMoves(board, startPosition);
        TeamColor color = getTeamTurn();

        for (ChessMove move : unfilteredMoves)
        {
            board.removePiece(move.getStartPosition()); // beginning position is now null
            if (move.getPromotionPiece() == null)
            {
                board.addPiece(move.getEndPosition(), board.getPiece(startPosition)); // end position now has same piece as starting position
            }

            //code below is to handle pawns where the startPosition pieceType != endPosition pieceType. I don't think it works
            else
            {
                board.addPiece(move.getEndPosition(), board.getPiece(move.getEndPosition())); // end position now has same piece as starting position
            }

            if (!isInCheck(color))
            {
                valid.add(move); // after making the move, if the team is not in check then add the move to the filtered "valid" array
            }

            board.addPiece(startPosition, board.getPiece(startPosition)); //undo the move
            board.removePiece(move.getEndPosition()); //undo the move
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
        ChessPiece p1 = board.getPiece(move.getStartPosition());

        if (p1.getTeamColor() != getTeamTurn()) // If given a move for the wrong team (not their turn), throw an InvalidMoveException.
        {
            throw new InvalidMoveException();
        }

        ChessPosition startPosition = move.getStartPosition();
        if (validMoves(startPosition) != null)
        {
            board.removePiece(move.getStartPosition()); // beginning position is now null

            if (move.getPromotionPiece() != null)
            {
                board.addPiece(move.getEndPosition(), board.getPiece(move.getEndPosition())); // end position is now the promoted piece
            }
            board.addPiece(move.getEndPosition(), board.getPiece(startPosition)); // end position now has same piece as starting position
        }
    }

    public void undoMakeMove(ChessMove move)
    {
        board.removePiece(move.getEndPosition());

        if (move.getPromotionPiece() != null)
        {
            ChessPiece peace = new ChessPiece(board.getPiece(move.getStartPosition()).getTeamColor(), PAWN);
            board.addPiece(move.getStartPosition(), peace);
        }

        else
        {
            board.addPiece(move.getStartPosition(), board.getPiece(move.getEndPosition()));
        }
    }

    /**
     * Determines if the given team is in check
     *
     * @param teamColor which team to check for check
     * @return True if the specified team is in check
     */
    public boolean isInCheck(TeamColor teamColor) throws InvalidMoveException
    {
        ChessBoard board = getBoard();

        for (int i = 1; i < 9; i++)
        {
            for (int j = 1; j < 9; j++)
            {
                ChessPosition pos = new ChessPosition(i, j);
                ChessPiece piece = board.getPiece(pos);

                if (piece.getTeamColor() != teamColor)
                    {
                        ArrayList<ChessMove> moveski = new ArrayList<>();
                        ChessGame gm1 = new ChessGame();
                        moveski = (ArrayList<ChessMove>) gm1.validMoves(pos);
                        for (ChessMove move : moveski)
                        {
                            ChessPosition pos2 = new ChessPosition(move.getEndPosition().getRow(), move.getEndPosition().getColumn());

                            if (board.getPiece(pos2).getPieceType() == KING && board.getPiece(pos2).getTeamColor() != teamColor)
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
    public boolean isInCheckmate(TeamColor teamColor) throws InvalidMoveException
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

                    if (piece.getTeamColor() == teamColor)
                    {
                        ArrayList<ChessMove> moveski = new ArrayList<>();
                        ChessGame gm1 = new ChessGame();
                        moveski = (ArrayList<ChessMove>) gm1.validMoves(pos);

                        for (ChessMove move : moveski)
                        {
                            makeMove(move);
                            if (!isInCheck(teamColor))
                            {
                                undoMakeMove(move);
                                return false;
                            }
                            undoMakeMove(move);
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
    public boolean isInStalemate(TeamColor teamColor) throws InvalidMoveException
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

                if (piece.getTeamColor() == teamColor)
                {
                    ArrayList<ChessMove> moveski = new ArrayList<>();
                    ChessGame gm1 = new ChessGame();
                    moveski = (ArrayList<ChessMove>) gm1.validMoves(pos);

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
