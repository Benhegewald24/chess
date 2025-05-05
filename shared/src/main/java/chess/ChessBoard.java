package chess;

import java.util.Arrays;
import java.util.Objects;

import static chess.ChessPiece.PieceType.*;

/**
 * A chessboard that can hold and rearrange chess pieces.
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessBoard
{
    private ChessPiece [][] squares = new ChessPiece[8][8]; //Field

    public ChessBoard() {} // Constructor

    @Override
    public boolean equals(Object o)
    {
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        ChessBoard that = (ChessBoard) o;
        return Objects.deepEquals(squares, that.squares);
    }

    @Override
    public int hashCode()
    {
        return Arrays.deepHashCode(squares);
    }

    @Override
    public String toString()
    {
        return "ChessBoard{" +
                "squares=" + Arrays.toString(squares) +
                '}';
    }

    /**
     * Adds a chess piece to the chessboard
     *
     * @param position where to add the piece to
     * @param piece the piece to add
     */
    public void addPiece(ChessPosition position, ChessPiece piece)
    {
        squares[position.getRow() - 1][position.getColumn() - 1] = piece;
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
        return squares[position.getRow() - 1][position.getColumn() - 1];
    }

    /**
     * Sets the board to the default starting board
     * (How the game of chess normally starts)
     */
    public void resetBoard()
    {
        ChessBoard board = new ChessBoard();

        ChessPosition pos = new ChessPosition(1, 1);
        ChessPiece pie = new ChessPiece(ChessGame.TeamColor.WHITE, ROOK);
        board.addPiece(pos, pie);

        ChessPosition pos2 = new ChessPosition(1, 2);
        ChessPiece pie2 = new ChessPiece(ChessGame.TeamColor.WHITE, KNIGHT);
        board.addPiece(pos2, pie2);

        ChessPosition pos3 = new ChessPosition(1, 3);
        ChessPiece pie3 = new ChessPiece(ChessGame.TeamColor.WHITE, BISHOP);
        board.addPiece(pos3, pie3);

        ChessPosition pos4 = new ChessPosition(1, 4);
        ChessPiece pie4 = new ChessPiece(ChessGame.TeamColor.WHITE, QUEEN);
        board.addPiece(pos4, pie4);

        ChessPosition pos5 = new ChessPosition(1, 5);
        ChessPiece pie5 = new ChessPiece(ChessGame.TeamColor.WHITE, KING);
        board.addPiece(pos5, pie5);

        ChessPosition pos6 = new ChessPosition(1, 6);
        ChessPiece pie6 = new ChessPiece(ChessGame.TeamColor.WHITE, BISHOP);
        board.addPiece(pos6, pie6);

        ChessPosition pos7 = new ChessPosition(1, 7);
        ChessPiece pie7 = new ChessPiece(ChessGame.TeamColor.WHITE, KNIGHT);
        board.addPiece(pos7, pie7);

        ChessPosition pos8 = new ChessPosition(1, 8);
        ChessPiece pie8 = new ChessPiece(ChessGame.TeamColor.WHITE, ROOK);
        board.addPiece(pos8, pie8);

        ChessPosition pos9 = new ChessPosition(2, 1);
        ChessPiece pie9 = new ChessPiece(ChessGame.TeamColor.WHITE, PAWN);
        board.addPiece(pos9, pie9);

        ChessPosition pos10 = new ChessPosition(2, 2);
        ChessPiece pie10 = new ChessPiece(ChessGame.TeamColor.WHITE, PAWN);
        board.addPiece(pos10, pie10);

        ChessPosition pos11 = new ChessPosition(2, 3);
        ChessPiece pie11 = new ChessPiece(ChessGame.TeamColor.WHITE, PAWN);
        board.addPiece(pos11, pie11);

        ChessPosition pos12 = new ChessPosition(2, 4);
        ChessPiece pie12 = new ChessPiece(ChessGame.TeamColor.WHITE, PAWN);
        board.addPiece(pos12, pie12);

        ChessPosition pos13 = new ChessPosition(2, 5);
        ChessPiece pie13 = new ChessPiece(ChessGame.TeamColor.WHITE, PAWN);
        board.addPiece(pos13, pie13);

        ChessPosition pos14 = new ChessPosition(2, 6);
        ChessPiece pie14 = new ChessPiece(ChessGame.TeamColor.WHITE, PAWN);
        board.addPiece(pos14, pie14);

        ChessPosition pos15 = new ChessPosition(2, 7);
        ChessPiece pie15 = new ChessPiece(ChessGame.TeamColor.WHITE, PAWN);
        board.addPiece(pos15, pie15);

        ChessPosition pos16 = new ChessPosition(2, 8);
        ChessPiece pie16 = new ChessPiece(ChessGame.TeamColor.WHITE, PAWN);
        board.addPiece(pos16, pie16);

        ChessPosition pos17 = new ChessPosition(8, 8);
        ChessPiece pie17 = new ChessPiece(ChessGame.TeamColor.BLACK, ROOK);
        board.addPiece(pos17, pie17);

        ChessPosition pos18 = new ChessPosition(8, 7);
        ChessPiece pie18 = new ChessPiece(ChessGame.TeamColor.BLACK, KNIGHT);
        board.addPiece(pos18, pie18);

        ChessPosition pos19 = new ChessPosition(8, 6);
        ChessPiece pie19 = new ChessPiece(ChessGame.TeamColor.BLACK, BISHOP);
        board.addPiece(pos19, pie19);

        ChessPosition pos20 = new ChessPosition(8, 5);
        ChessPiece pie20 = new ChessPiece(ChessGame.TeamColor.BLACK, KING);
        board.addPiece(pos20, pie20);

        ChessPosition pos21 = new ChessPosition(8, 4);
        ChessPiece pie21 = new ChessPiece(ChessGame.TeamColor.BLACK, QUEEN);
        board.addPiece(pos21, pie21);

        ChessPosition pos22 = new ChessPosition(8, 3);
        ChessPiece pie22 = new ChessPiece(ChessGame.TeamColor.BLACK, BISHOP);
        board.addPiece(pos22, pie22);

        ChessPosition pos23 = new ChessPosition(8, 2);
        ChessPiece pie23 = new ChessPiece(ChessGame.TeamColor.BLACK, KNIGHT);
        board.addPiece(pos23, pie23);

        ChessPosition pos24 = new ChessPosition(8, 1);
        ChessPiece pie24 = new ChessPiece(ChessGame.TeamColor.BLACK, ROOK);
        board.addPiece(pos24, pie24);

        ChessPosition pos25 = new ChessPosition(7, 1);
        ChessPiece pie25 = new ChessPiece(ChessGame.TeamColor.BLACK, PAWN);
        board.addPiece(pos25, pie25);

        ChessPosition pos26 = new ChessPosition(7, 2);
        ChessPiece pie26 = new ChessPiece(ChessGame.TeamColor.BLACK, PAWN);
        board.addPiece(pos26, pie26);

        ChessPosition pos27 = new ChessPosition(7, 3);
        ChessPiece pie27 = new ChessPiece(ChessGame.TeamColor.BLACK, PAWN);
        board.addPiece(pos27, pie27);

        ChessPosition pos28 = new ChessPosition(7, 4);
        ChessPiece pie28 = new ChessPiece(ChessGame.TeamColor.BLACK, PAWN);
        board.addPiece(pos28, pie28);

        ChessPosition pos29 = new ChessPosition(7, 5);
        ChessPiece pie29 = new ChessPiece(ChessGame.TeamColor.BLACK, PAWN);
        board.addPiece(pos29, pie29);

        ChessPosition pos30 = new ChessPosition(7, 6);
        ChessPiece pie30 = new ChessPiece(ChessGame.TeamColor.BLACK, PAWN);
        board.addPiece(pos30, pie30);

        ChessPosition pos31 = new ChessPosition(7, 7);
        ChessPiece pie31 = new ChessPiece(ChessGame.TeamColor.BLACK, PAWN);
        board.addPiece(pos31, pie31);

        ChessPosition pos32 = new ChessPosition(7, 8);
        ChessPiece pie32 = new ChessPiece(ChessGame.TeamColor.BLACK, PAWN);
        board.addPiece(pos32, pie32);

        this.squares = board.squares;
    }
}