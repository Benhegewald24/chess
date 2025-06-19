package chess;

import java.util.Arrays;
import java.util.Objects;

import static chess.ChessGame.TeamColor.*;
import static chess.ChessPiece.PieceType.*;

/**
 * A chessboard that can hold and rearrange chess pieces.
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessBoard
{
    private ChessPiece [][] squares = new ChessPiece[8][8];
    private ChessPosition position;
    private ChessPiece piece;

    public ChessBoard()
    {
        this.position = position;
        this.piece = piece;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ChessBoard that = (ChessBoard) o;
        return Objects.deepEquals(squares, that.squares) && Objects.equals(position, that.position) && Objects.equals(piece, that.piece);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.deepHashCode(squares), position, piece);
    }

    @Override
    public String toString() {
        return "ChessBoard{" +
                "squares=" + Arrays.toString(squares) +
                ", position=" + position +
                ", piece=" + piece +
                '}';
    }

    /**
     * Adds a chess piece to the chessboard
     *
     * @param position where to add the piece to
     * @param piece    the piece to add
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

        ChessPosition po = new ChessPosition(1,1);
        ChessPiece pi = new ChessPiece(WHITE, ROOK);
        board.addPiece(po, pi);

        ChessPosition po2 = new ChessPosition(1,2);
        ChessPiece pi2 = new ChessPiece(WHITE, KNIGHT);
        board.addPiece(po2, pi2);

        ChessPosition po3 = new ChessPosition(1,3);
        ChessPiece pi3 = new ChessPiece(WHITE, BISHOP);
        board.addPiece(po3, pi3);

        ChessPosition po4 = new ChessPosition(1,4);
        ChessPiece pi4 = new ChessPiece(WHITE, QUEEN);
        board.addPiece(po4, pi4);

        ChessPosition po5 = new ChessPosition(1,5);
        ChessPiece pi5 = new ChessPiece(WHITE, KING);
        board.addPiece(po5, pi5);

        ChessPosition po6 = new ChessPosition(1,6);
        ChessPiece pi6 = new ChessPiece(WHITE, BISHOP);
        board.addPiece(po6, pi6);

        ChessPosition po7 = new ChessPosition(1,7);
        ChessPiece pi7 = new ChessPiece(WHITE, KNIGHT);
        board.addPiece(po7, pi7);

        ChessPosition po8 = new ChessPosition(1,8);
        ChessPiece pi8 = new ChessPiece(WHITE, ROOK);
        board.addPiece(po8, pi8);

        ChessPosition po9 = new ChessPosition(8,1);
        ChessPiece pi9 = new ChessPiece(BLACK, ROOK);
        board.addPiece(po9, pi9);

        ChessPosition po10 = new ChessPosition(8,2);
        ChessPiece pi10 = new ChessPiece(BLACK, KNIGHT);
        board.addPiece(po10, pi10);

        ChessPosition po11 = new ChessPosition(8,3);
        ChessPiece pi11 = new ChessPiece(BLACK, BISHOP);
        board.addPiece(po11, pi11);

        ChessPosition po12 = new ChessPosition(8,4);
        ChessPiece pi12 = new ChessPiece(BLACK, QUEEN);
        board.addPiece(po12, pi12);

        ChessPosition po13 = new ChessPosition(8,5);
        ChessPiece pi13 = new ChessPiece(BLACK, KING);
        board.addPiece(po13, pi13);

        ChessPosition po14 = new ChessPosition(8,6);
        ChessPiece pi14 = new ChessPiece(BLACK, BISHOP);
        board.addPiece(po14, pi14);

        ChessPosition po15 = new ChessPosition(8,7);
        ChessPiece pi15 = new ChessPiece(BLACK, KNIGHT);
        board.addPiece(po15, pi15);

        ChessPosition po16 = new ChessPosition(8,8);
        ChessPiece pi16 = new ChessPiece(BLACK, ROOK);
        board.addPiece(po16, pi16);

        ChessPosition po17 = new ChessPosition(7,1);
        ChessPiece pi17 = new ChessPiece(BLACK, PAWN);
        board.addPiece(po17, pi17);

        ChessPosition po18 = new ChessPosition(7,2);
        ChessPiece pi18 = new ChessPiece(BLACK, PAWN);
        board.addPiece(po18, pi18);

        ChessPosition po19 = new ChessPosition(7,3);
        ChessPiece pi19 = new ChessPiece(BLACK, PAWN);
        board.addPiece(po19, pi19);

        ChessPosition po20 = new ChessPosition(7,4);
        ChessPiece pi20 = new ChessPiece(BLACK, PAWN);
        board.addPiece(po20, pi20);

        ChessPosition po21 = new ChessPosition(7,5);
        ChessPiece pi21 = new ChessPiece(BLACK, PAWN);
        board.addPiece(po21, pi21);

        ChessPosition po22 = new ChessPosition(7,6);
        ChessPiece pi22 = new ChessPiece(BLACK, PAWN);
        board.addPiece(po22, pi22);

        ChessPosition po23 = new ChessPosition(7,7);
        ChessPiece pi23 = new ChessPiece(BLACK, PAWN);
        board.addPiece(po23, pi23);

        ChessPosition po24 = new ChessPosition(7,8);
        ChessPiece pi24 = new ChessPiece(BLACK, PAWN);
        board.addPiece(po24, pi24);

        ChessPosition po25 = new ChessPosition(2,1);
        ChessPiece pi25 = new ChessPiece(WHITE, PAWN);
        board.addPiece(po25, pi25);

        ChessPosition po26 = new ChessPosition(2,2);
        ChessPiece pi26 = new ChessPiece(WHITE, PAWN);
        board.addPiece(po26, pi26);

        ChessPosition po27 = new ChessPosition(2,3);
        ChessPiece pi27 = new ChessPiece(WHITE, PAWN);
        board.addPiece(po27, pi27);

        ChessPosition po28 = new ChessPosition(2,4);
        ChessPiece pi28 = new ChessPiece(WHITE, PAWN);
        board.addPiece(po28, pi28);

        ChessPosition po29 = new ChessPosition(2,5);
        ChessPiece pi29 = new ChessPiece(WHITE, PAWN);
        board.addPiece(po29, pi29);

        ChessPosition po30 = new ChessPosition(2,6);
        ChessPiece pi30 = new ChessPiece(WHITE, PAWN);
        board.addPiece(po30, pi30);

        ChessPosition po31 = new ChessPosition(2,7);
        ChessPiece pi31 = new ChessPiece(WHITE, PAWN);
        board.addPiece(po31, pi31);

        ChessPosition po32 = new ChessPosition(2,8);
        ChessPiece pi32 = new ChessPiece(WHITE, PAWN);
        board.addPiece(po32, pi32);



        this.squares = board.squares;
    }
}
