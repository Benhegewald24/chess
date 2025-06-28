package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import static chess.ChessPiece.PieceType.KING;

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
            makeMove(move);
            if (!isInCheck(color) && !isInStalemate(color)) //double check stalemate here...
            {
                valid.add(move);
            }
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


        if (move.getPromotionPiece() != null) //pawn promotions
        {
            ChessPiece.PieceType t = move.getPromotionPiece();
            ChessPiece t3 = new ChessPiece(getTeamTurn(), t);

            board.removePiece(move.getStartPosition()); // beginning position is now null
            board.addPiece(move.getEndPosition(), t3); // end position is now the promoted piece
        }

        else //non-pawn promotion
        {
            board.removePiece(move.getStartPosition()); // beginning position is now null
            board.addPiece(move.getEndPosition(), board.getPiece(move.getEndPosition())); // end position is now the promoted piece
        }
    }

    //public ChessPosition findTheKing()

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
        if (!isInCheck(team))
        {
            return false;
        }

        /*

        1. Is the king in check?
        2. Get all possible moves for teamColor
        3. for move : allmoves
            i. make the move
            ii. is in check? no -> false;
            iii. if true
                1. make that move
                    i. double check you aren't in check now in a different way
                    ii. if you are not than you can return false.
                    iii. if you are then continue;
         4. return false;



        3 Options when you are in check:
            i. the king can move (including capture)
            ii. a piece can take the attacker
            iii. a different piece can block the path of the attacker
        */
    return false;
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

//
//        ChessBoard board = getBoard();
//
//        for (int i = 1; i < 9; i++)
//        {
//            for (int j = 1; j < 9; j++)
//            {
//                ChessPosition pos = new ChessPosition(i, j);
//                ChessPiece piece = board.getPiece(pos);
//
//                if (piece.getTeamColor() == teamColor && piece.getPieceType() == KING)
//                {
//                    ChessPosition kingPosition = new ChessPosition(i, j);
//                }
//
//                else if (piece.getTeamColor() != teamColor)
//                {
//                    ArrayList<ChessMove> moveski = new ArrayList<>();
//                    moveski = (ArrayList<ChessMove>) piece.pieceMoves(board, pos);
//                    for (ChessMove move : moveski)
//                    {
//                        ChessPosition pos2 = new ChessPosition(move.getEndPosition().getRow(), move.getEndPosition().getColumn());
//                        if (pos2 == kingPosition)
//                        {
//                            return true;
//                        }
//                    }
//
//                }
//                return false;
//            }
//        }


        /*
            1. For each piece on board
                i. if piece.getcolor = teamcolor
                    i. get piece's moves
                        1. if there are no possible moves, return true.
                        2. else return false.
         */
        return false;
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
