package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/**
 * Represents a single chess piece
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPiece
{
    private ChessGame.TeamColor teamColor; //Uses dot operator to access Enum from a Class.
    private PieceType pieceType;

    public ChessPiece(ChessGame.TeamColor pieceColor, ChessPiece.PieceType type) //Constructor
    {
        this.teamColor = pieceColor;
        this.pieceType = type;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        ChessPiece that = (ChessPiece) o;
        return teamColor == that.teamColor && pieceType == that.pieceType;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(teamColor, pieceType);
    }

    @Override
    public String toString()
    {
        return "ChessPiece{" +
                "teamColor=" + teamColor +
                ", pieceType=" + pieceType +
                '}';
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
        ArrayList<ChessMove> moves = new ArrayList<>();
        ChessPiece p2 = board.getPiece(myPosition);
        PieceType p3 = p2.getPieceType();

        if (p3 == PieceType.BISHOP)
        {
            BishopMoves b1 = new BishopMoves();
            b1.move(board, myPosition, moves);
        }

        if (p3 == PieceType.ROOK)
        {
            RookMoves r1 = new RookMoves();
            r1.move(board, myPosition, moves);
        }

        if (p3 == PieceType.KING)
        {
            KingMoves k1 = new KingMoves();
            k1.move(board, myPosition, moves);
        }

        if (p3 == PieceType.QUEEN)
        {
            QueenMoves q1 = new QueenMoves();
            q1.move(board, myPosition, moves);
        }

        if (p3 == PieceType.PAWN)
        {
            PawnMoves pa1 = new PawnMoves();
            pa1.move(board, myPosition, moves);
        }

        if (p3 == PieceType.KNIGHT)
        {
            KnightMoves kn1 = new KnightMoves();
            kn1.move(board, myPosition, moves);
        }

        return moves;
    }
}