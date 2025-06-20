package chess;

import java.util.ArrayList;

public class KingMoves
{
    public void moves(ChessBoard board, ChessPosition myPosition, ArrayList<ChessMove> moves)
    {
        int rrow1 = myPosition.getRow();
        int ccol1 = myPosition.getColumn();

        if (rrow1 < 8 && ccol1 < 8) //NE
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
            }
        }

        int rrow2 = myPosition.getRow();
        int ccol2 = myPosition.getColumn();

        if (rrow2 > 1 && ccol2 < 8) //SE
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
            }
        }

        int rrow3 = myPosition.getRow();
        int ccol3 = myPosition.getColumn();

        if (rrow3 > 1 && ccol3 > 1) //SW
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
            }
        }

        int rrow4 = myPosition.getRow();
        int ccol4 = myPosition.getColumn();

        if (rrow4 < 8 && ccol4 > 1) //NW
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
            }
        }

        int rrow5 = myPosition.getRow();
        int ccol5 = myPosition.getColumn();

        if (rrow5 < 8) //N
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
            }
        }

        int rrow6 = myPosition.getRow();
        int ccol6 = myPosition.getColumn();

        if (ccol6 < 8) //E
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
            }
        }

        int rrow7 = myPosition.getRow();
        int ccol7 = myPosition.getColumn();

        if (rrow7 > 1) //S
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
            }
        }

        int rrow8 = myPosition.getRow();
        int ccol8 = myPosition.getColumn();

        if (ccol8 > 1) //W
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
            }
        }
    }
}
