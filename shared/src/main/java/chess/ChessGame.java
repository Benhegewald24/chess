package chess;
import java.util.Collection;

import static chess.ChessPiece.PieceType.*;
import static chess.ChessPiece.PieceType.BISHOP;
import static chess.ChessPiece.PieceType.KING;
import static chess.ChessPiece.PieceType.KNIGHT;
import static chess.ChessPiece.PieceType.PAWN;
import static chess.ChessPiece.PieceType.QUEEN;
import static chess.ChessPiece.PieceType.ROOK;

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

    public ChessGame() {} //Constructor. InteliJ creates this by default.

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
        //throw new RuntimeException("Not implemented");
        //ChessBoard board = new ChessBoard();

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
        ChessPiece pie16 = new ChessPiece(ChessGame.TeamColor.BLACK, PAWN);
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
    }


//        for (int i = 1; i < 9; i++ )
//        {
//            ChessPosition pos[8 + i] = new ChessPosition(2, i);
//            ChessPiece pie[i] = new ChessPiece(ChessGame.TeamColor.WHITE, PAWN);
//            b1.addPiece(pos[i], pie[i]);
//        }

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
