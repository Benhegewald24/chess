package chess;

import java.util.ArrayList;

public class QueenMoves
{
    public void moves(ChessBoard board, ChessPosition myPosition, ArrayList<ChessMove> moves)
    {
        int rrow1 = myPosition.getRow();
        int ccol1 = myPosition.getColumn();

        while (rrow1 < 8 && ccol1 < 8) //NE
        {
            rrow1++;
            ccol1++;
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

        while (rrow2 > 1 && ccol2 < 8) //SE
        {
            rrow2--;
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

        while (rrow3 > 1 && ccol3 > 1) //SW
        {
            rrow3--;
            ccol3--;
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

        while (rrow4 < 8 && ccol4 > 1) //NW
        {
            rrow4++;
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

        int rrow5 = myPosition.getRow();
        int ccol5 = myPosition.getColumn();

        while (rrow5 < 8) //N
        {
            rrow5++;
            ChessPosition pos = new ChessPosition(rrow5, ccol5);

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

        int rrow6 = myPosition.getRow();
        int ccol6 = myPosition.getColumn();

        while (ccol6 < 8) //E
        {
            ccol6++;
            ChessPosition pos = new ChessPosition(rrow6, ccol6);

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

        int rrow7 = myPosition.getRow();
        int ccol7 = myPosition.getColumn();

        while (rrow7 > 1) //S
        {
            rrow7--;
            ChessPosition pos = new ChessPosition(rrow7, ccol7);

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

        int rrow8 = myPosition.getRow();
        int ccol8 = myPosition.getColumn();

        while (ccol8 > 1) //W
        {
            ccol8--;
            ChessPosition pos = new ChessPosition(rrow8, ccol8);

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
