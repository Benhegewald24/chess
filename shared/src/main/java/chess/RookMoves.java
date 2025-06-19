package chess;

import java.util.ArrayList;

public class RookMoves
{
    public void moves(ChessBoard board, ChessPosition myPosition, ArrayList<ChessMove> moves)
    {
        int rrow1 = myPosition.getRow();
        int ccol1 = myPosition.getColumn();

        while (rrow1 < 8) //N
        {
            rrow1++;
            ChessPosition pos = new ChessPosition(rrow1, ccol1);

            if (board.getPiece(pos) == null)
            {
                ChessMove mo = new ChessMove(myPosition, pos, null);
                moves.add(mo);
            }

            else if (board.getPiece(pos) != null && board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor())
            {
                ChessMove mo = new ChessMove(myPosition, pos, null);
                moves.add(mo);
                break;
            }

            else {break;}
        }

        int rrow2 = myPosition.getRow();
        int ccol2 = myPosition.getColumn();

        while (ccol2 < 8) //E
        {
            ccol2++;
            ChessPosition pos = new ChessPosition(rrow2, ccol2);

            if (board.getPiece(pos) == null)
            {
                ChessMove mo = new ChessMove(myPosition, pos, null);
                moves.add(mo);
            }

            else if (board.getPiece(pos) != null && board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor())
            {
                ChessMove mo = new ChessMove(myPosition, pos, null);
                moves.add(mo);
                break;
            }

            else {break;}
        }

        int rrow3 = myPosition.getRow();
        int ccol3 = myPosition.getColumn();

        while (rrow3 > 1) //S
        {
            rrow3--;
            ChessPosition pos = new ChessPosition(rrow3, ccol3);

            if (board.getPiece(pos) == null)
            {
                ChessMove mo = new ChessMove(myPosition, pos, null);
                moves.add(mo);
            }

            else if (board.getPiece(pos) != null && board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor())
            {
                ChessMove mo = new ChessMove(myPosition, pos, null);
                moves.add(mo);
                break;
            }

            else {break;}
        }

        int rrow4 = myPosition.getRow();
        int ccol4 = myPosition.getColumn();

        while (ccol4 > 1) //W
        {
            ccol4--;
            ChessPosition pos = new ChessPosition(rrow4, ccol4);

            if (board.getPiece(pos) == null)
            {
                ChessMove mo = new ChessMove(myPosition, pos, null);
                moves.add(mo);
            }

            else if (board.getPiece(pos) != null && board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor())
            {
                ChessMove mo = new ChessMove(myPosition, pos, null);
                moves.add(mo);
                break;
            }

            else {break;}
        }
    }
}
