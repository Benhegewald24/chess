package chess;
import java.util.Collection;

/**
 * For a class that can manage a chess game, making moves on a board
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessGame
{
    private ChessBoard board;
    private TeamColor team;

    public ChessGame() //Constructor
    {

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
    public void setTeamTurn(TeamColor team)
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
    public Collection<ChessMove> validMoves(ChessPosition startPosition)
    {
        throw new RuntimeException("Not implemented");
    }

    /**
     * Makes a move in a chess game
     *
     * @param move chess move to perform
     * @throws InvalidMoveException if move is invalid
     */
    public void makeMove(ChessMove move) throws InvalidMoveException
    {
        throw new RuntimeException("Not implemented");
    }

    /**
     * Determines if the given team is in check
     *
     * @param teamColor which team to check for check
     * @return True if the specified team is in check
     */
    public boolean isInCheck(TeamColor teamColor)
    {
        throw new RuntimeException("Not implemented");
        //King is in check is his position is found within possible move locations of opponents pieces.
    }

    /**
     * Determines if the given team is in checkmate
     *
     * @param teamColor which team to check for checkmate
     * @return True if the specified team is in checkmate
     */
    public boolean isInCheckmate(TeamColor teamColor)
    {
        throw new RuntimeException("Not implemented");
        //If king is inCheck but cannot move out.
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
        throw new RuntimeException("Not implemented");
        //If king is not in check but no possible moves.
    }

    /**
     * Sets this game's chessboard with a given board
     *
     * @param board the new board to use
     */
    public void setBoard(ChessBoard board)
    {
        throw new RuntimeException("Not implemented");
        //c1.addPiece({1, 1}, ChessPiece.PieceType.ROOK);
        //squares[1][1] = ChessPiece.PieceType.ROOK;
        //squares.addPiece((1, 1), squares = PieceType.ROOK);
        //squares.addPiece((1,2), KNIGHT);
        //squares.addPiece((1,3), BISHOP);
        //squares.addPiece((1,4), QUEEN);
        //squares.addPiece((1,5), KING);
        //squares.addPiece((1,6), BISHOP);
        //squares.addPiece((1,7), KNIGHT);
        //squares.addPiece((8, 1), ROOK);
        //squares.addPiece((8,2), KNIGHT);
        //squares.addPiece((8,3), BISHOP);
        //squares.addPiece((8,4), KING);
        //squares.addPiece((8,5), QUEEN);
        //squares.addPiece((8,6), BISHOP);
        //squares.addPiece((8,7), KNIGHT);
        //squares.addPiece((8,8), ROOK);
        //squares.addPiece((2,1), PAWN);
        //squares.addPiece((2,2), PAWN);
        //squares.addPiece((2,3), PAWN);
        //squares.addPiece((2,4), PAWN);
        //squares.addPiece((2,5), PAWN);
        //squares.addPiece((2,6), PAWN);
        //squares.addPiece((2,7), PAWN);
        //squares.addPiece((2,8), PAWN);
        //squares.addPiece((7,1), PAWN);
        //squares.addPiece((7,2), PAWN);
        //squares.addPiece((7,3), PAWN);
        //squares.addPiece((7,4), PAWN);
        //squares.addPiece((7,5), PAWN);
        //squares.addPiece((7,6), PAWN);
        //squares.addPiece((7,7), PAWN);
        //squares.addPiece((7,8), PAWN);
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
