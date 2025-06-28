package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

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
    private int counter = 2;

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
    public TeamColor getTeamTurn() //is this where we toggle the team turn? Do I need an overarching class the says resetboard and start the game and switches the team color after each move?
    {
        if (counter % 2 == 0)
        {
            counter++;
            return TeamColor.WHITE;
        }
        counter++;
        return TeamColor.BLACK;
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

        ChessPosition pos = new ChessPosition(startPosition.getRow(), startPosition.getColumn());
        ChessBoard board = getBoard();

        if (board.getPiece(startPosition) == null) // If no piece at startPosition, return null.
        {
            return valid; //at this point valid should still be empty
        }

        ChessPiece pie = board.getPiece(pos);
        ArrayList<ChessMove> unfilteredMoves = new ArrayList<>();
        unfilteredMoves = (ArrayList<ChessMove>) pie.pieceMoves(board, pos);

        for (ChessMove move : unfilteredMoves)
        {
            TeamColor color = getTeamTurn();
            makeMove(move);
            if (!isInCheckmate(color) && !isInCheck(color) && !isInStalemate(color))
            {
                valid.add(move);
            }
        }

        /*
        Below is hard code to use for testing
        */
//        ChessPosition start_po = new ChessPosition(5,6);
//        ChessPosition end_po = new ChessPosition(5,7);
//        ChessMove mo = new ChessMove(start_po, end_po, null);
//        valid.add(mo);
//
//        ChessPosition start_po2 = new ChessPosition(5,6);
//        ChessPosition end_po2 = new ChessPosition(5,5);
//        ChessMove mo2 = new ChessMove(start_po2, end_po2, null);
//        valid.add(mo2);
//
//        ChessPosition start_po3 = new ChessPosition(5,6);
//        ChessPosition end_po3 = new ChessPosition(5,4);
//        ChessMove mo3 = new ChessMove(start_po3, end_po3, null);
//        valid.add(mo3);
//
//        ChessPosition start_po4 = new ChessPosition(5,6);
//        ChessPosition end_po4 = new ChessPosition(5,3);
//        ChessMove mo4 = new ChessMove(start_po4, end_po4, null);
//        valid.add(mo4);
//
//        ChessPosition start_po5 = new ChessPosition(5,6);
//        ChessPosition end_po5 = new ChessPosition(5,2);
//        ChessMove mo5 = new ChessMove(start_po5, end_po5, null);
//        valid.add(mo5);

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
        //throw new RuntimeException("Not implemented");

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

    /**
     * Determines if the given team is in check
     *
     * @param teamColor which team to check for check
     * @return True if the specified team is in check
     */
    public boolean isInCheck(TeamColor teamColor)
    {
        if (teamColor == TeamColor.WHITE)
        {
            TeamColor t = TeamColor.BLACK;
        }

        else
        {
            TeamColor t = TeamColor.WHITE;
        }

        ChessBoard board = getBoard();

        for (ChessPiece piece : board) //how do I check the moves of every piece?
        {
            if (piece.getTeamColor() != teamColor)
            {

                ArrayList<ChessMove> oppositeColorMoves = new ArrayList<>();

                oppositeColorMoves = (ArrayList<ChessMove>) piece.pieceMoves(board, );

            }
        }

        return false;


        /*
            1) Get other teams attacking moves.
            2) for each piece's moves check the end position. If the end position.getpiece.piecetype = king and the king's color is the opposite then isInCheck is TRUE
         */
    }

    /**
     * Determines if the given team is in checkmate
     *
     * @param teamColor which team to check for checkmate
     * @return True if the specified team is in checkmate
     */
    public boolean isInCheckmate(TeamColor teamColor)
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
            ii. is in check?
            iii. if no
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
        if (isInCheck(teamColor))
        {
            return false;
        }

        /*
            1. For each piece on board
                i. if piece.getcolor = teamcolor
                    i. get piece's moves
                        1. if there are no possible moves, return true.
                        2. else return false.
         */
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
