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
        rrow1++;

        if (rrow1 < 9) //N
        {
            ChessPosition pos = new ChessPosition(rrow1, ccol1);

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
        rrow2++;
        ccol2++;

        if (rrow2 < 9 && ccol2 < 9) //NE
        {
            ChessPosition pos = new ChessPosition(rrow2, ccol2);

            if (board.getPiece(pos) == null)
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow2, ccol2), null);
                moves.add(p1);
            }

            if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow2, ccol2), null);
                moves.add(p1);
            }
        }

        int rrow3 = myPosition.getRow();
        int ccol3 = myPosition.getColumn();
        ccol3++;

        if (ccol3 < 9) //E
        {
            ChessPosition pos = new ChessPosition(rrow3, ccol3);

            if (board.getPiece(pos) == null)
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow3, ccol3), null);
                moves.add(p1);
            }

            if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow3, ccol3), null);
                moves.add(p1);
            }
        }

        int rrow4 = myPosition.getRow();
        int ccol4 = myPosition.getColumn();
        rrow4--;
        ccol4++;

        if (rrow4 >= 1 && ccol4 < 9) //SE
        {
            ChessPosition pos = new ChessPosition(rrow4, ccol4);

            if (board.getPiece(pos) == null)
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow4, ccol4), null);
                moves.add(p1);
            }

            if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow4, ccol4), null);
                moves.add(p1);
            }
        }

        int rrow5 = myPosition.getRow();
        int ccol5 = myPosition.getColumn();
        rrow5--;

        if (rrow5 >= 1) //S
        {
            ChessPosition pos = new ChessPosition(rrow5, ccol5);

            if (board.getPiece(pos) == null)
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow5, ccol5), null);
                moves.add(p1);
            }

            if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow5, ccol5), null);
                moves.add(p1);
            }
        }

        int rrow6 = myPosition.getRow();
        int ccol6 = myPosition.getColumn();
        rrow6--;
        ccol6--;

        if (rrow6 >= 1 && ccol6 >= 1) //SW
        {
            ChessPosition pos = new ChessPosition(rrow6, ccol6);

            if (board.getPiece(pos) == null)
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow6, ccol6), null);
                moves.add(p1);
            }

            if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow6, ccol6), null);
                moves.add(p1);
            }
        }

        int rrow7 = myPosition.getRow();
        int ccol7 = myPosition.getColumn();
        ccol7--;

        if (ccol7 >= 1) //W
        {
            ChessPosition pos = new ChessPosition(rrow7, ccol7);

            if (board.getPiece(pos) == null)
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow7, ccol7), null);
                moves.add(p1);
            }

            if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow7, ccol7), null);
                moves.add(p1);
            }
        }

        int rrow8 = myPosition.getRow();
        int ccol8 = myPosition.getColumn();
        rrow8++;
        ccol8--;

        if (rrow8 < 9 && ccol8 >= 1) //NW
        {
            ChessPosition pos = new ChessPosition(rrow8, ccol8);

            if (board.getPiece(pos) == null)
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow8, ccol8), null);
                moves.add(p1);
            }

            if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow8, ccol8), null);
                moves.add(p1);
            }
        }
    }
}