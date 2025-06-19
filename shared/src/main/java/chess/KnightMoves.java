package chess;

import java.util.ArrayList;

public class KnightMoves
{
    public void moves(ChessBoard board, ChessPosition myPosition, ArrayList<ChessMove> moves)
    {
        int rrow1 = myPosition.getRow();
        int ccol1 = myPosition.getColumn();

        if (rrow1 < 7 && ccol1 < 8) //NNE
        {
            rrow1+=2;
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

        if (rrow2 < 8 && ccol2 < 7) //NEE
        {
            rrow2++;
            ccol2+=2;
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

        if (rrow3 > 1 && ccol3 < 7) //SEE
        {
            rrow3--;
            ccol3+=2;
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

        if (rrow4 > 2 && ccol4 < 8) //SSE
        {
            rrow4-=2;
            ccol4++;
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

        if (rrow5 > 2 && ccol5 > 1) //SSW
        {
            rrow5-=2;
            ccol5--;
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

        if (rrow6 > 1 && ccol6 > 2) //SWW
        {
            rrow6--;
            ccol6-=2;
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

        if (rrow7 < 8 && ccol7 > 2) //NWW
        {
            rrow7++;
            ccol7-=2;
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

        if (rrow8 < 7 && ccol8 > 1) //NNW
        {
            rrow8+=2;
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
