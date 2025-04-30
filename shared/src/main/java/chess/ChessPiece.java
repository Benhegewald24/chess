package chess;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Represents a single chess piece
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPiece
{
    private ChessGame.TeamColor teamColor;
    private ChessPiece.PieceType pieceType;

    public ChessPiece(ChessGame.TeamColor pieceColor, ChessPiece.PieceType type) //constructor
    {
        //idk
        //this.pieceColor = pieceColor;
        //this.type = type;
    }

    /**
     * The various different chess piece options
     */
    public enum PieceType
    {
        KING, QUEEN, BISHOP, KNIGHT, ROOK, PAWN
    }

    /**
     * @return Which team this chess piece belongs to
     */
    public ChessGame.TeamColor getTeamColor()
    {
        //if piece == white than it belongs to white team. if piece == black than it belongs to the black team.
        return this.teamColor;
    }

    /**
     * @return which type of chess piece this piece is
     */
    public PieceType getPieceType()
    {
        return this.pieceType;
    }

    /**
     * Calculates all the positions a chess piece can move to
     * Does not take into account moves that are illegal due to leaving the king in
     * danger
     *
     * @return Collection of valid moves
     */
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) //Collection<> is a container for storing a bunch of objects. Includes Sets, ArrayLists, and LinkedLists, etc.
    {
//        if (getPieceType() == PieceType.BISHOP)
//        {
//            while (col < 8 && row < 8)
//            {
                    //ArrayList.add(row + 1, col + 1);
//            }
//        }

        return new ArrayList<>();
    }
}
