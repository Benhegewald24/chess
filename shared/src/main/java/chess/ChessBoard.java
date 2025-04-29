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

    public ChessBoard() //this is the constructor... so it should put all the pieces in place and get the game ready to go?
    {
        //squares.addPiece((1, 1), ChessPiece.PieceType = ROOK);
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