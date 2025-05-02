package chess;

import java.util.ArrayList;

public class KingMoves // Do we have to account for not allowing kings to move within a space of one another
{
    public ArrayList<ChessMove> moveCalculator(ChessBoard board, ChessPosition myPosition)
    {
        ArrayList<ChessMove> moves = new ArrayList<>();
        return moves;
    }

    public void move(ChessBoard board, ChessPosition myPosition, ArrayList<ChessMove> moves)
    {
        int rrow1 = myPosition.getRow();
        int ccol1 = myPosition.getColumn();

        if (rrow1 <= 7 && ccol1 <= 7) //NE
        {
            ChessPosition pos = new ChessPosition(rrow1 + 1, ccol1 + 1);

            if (board.getPiece(pos) == null)
            {
            ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow1, ccol1), null);
            moves.add(p1);
            }

            if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow1, ccol1), null);
                moves.add(p1);
            }
        }

        int rrow2 = myPosition.getRow();
        int ccol2 = myPosition.getColumn();

        if (rrow1 <= 7 && ccol1 <= 7) //E
        {
            ChessPosition pos = new ChessPosition(rrow1, ccol1 + 1);

            if (board.getPiece(pos) == null)
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow1, ccol1), null);
                moves.add(p1);
            }

            if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow1, ccol1), null);
                moves.add(p1);
            }
        }



    }
}