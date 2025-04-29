package chess;

/**
 * A chessboard that can hold and rearrange chess pieces.
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessBoard
{
    private ChessPiece [][] squares = new ChessPiece[8][8]; //Field
    //ChessBoard c1 = new ChessBoard();

    public ChessBoard() // Constructor
    {
        //idk
    }

    /**
     * Adds a chess piece to the chessboard
     *
     * @param position where to add the piece to
     * @param piece the piece to add
     */
    public void addPiece(ChessPosition position, ChessPiece piece)
    {
        squares[position.getRow()][position.getColumn()] = piece;
    }

    /**
     * Gets a chess piece on the chessboard
     *
     * @param position The position to get the piece from
     * @return Either the piece at the position, or null if no piece is at that
     * position
     */
    public ChessPiece getPiece(ChessPosition position)
    {
        if (squares[position.getRow()][position.getColumn()] == null)
        {
            return null;
        }
        return squares[position.getRow()][position.getColumn()];
    }

    /**
     * Sets the board to the default starting board
     * (How the game of chess normally starts)
     */
    public void resetBoard()
    {
        throw new RuntimeException("Not implemented");
        //ChessBoard();
        //Also account for removing pieces from the previous game... just make a brand new instance of the ChessBoard class?
    }
}