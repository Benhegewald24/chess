package chess;

import java.util.ArrayList;

public class KnightMoves
{
    public ArrayList<ChessMove> moveCalculator(ChessBoard board, ChessPosition myPosition)
    {
        ArrayList<ChessMove> moves = new ArrayList<>();
        return moves;
    }

    public void move(ChessBoard board, ChessPosition myPosition, ArrayList<ChessMove> moves)
    {
        boolean run = true;
        while (run)
        {
            int rrow1 = myPosition.getRow();
            int ccol1 = myPosition.getColumn();
            rrow1 += 2;
            ccol1++;

            if (rrow1 <= 8 && ccol1 <= 8) //(r + 2, c + 1)
            {

                System.out.print("We are in the if statment\n");
                ChessPosition pos = new ChessPosition(rrow1, ccol1);
                System.out.print("pos has been created\n");

                if (board.getPiece(pos) == null)
                {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow1, ccol1), null);
                    moves.add(p1);
                }
                else if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
                {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow1, ccol1), null);
                    moves.add(p1);
                }
            }

            int rrow2 = myPosition.getRow();
            int ccol2 = myPosition.getColumn();
            rrow2++;
            ccol2 += 2;

            if (rrow2 <= 8 && ccol2 <= 8) //(r + 1, c + 2)
            {

                System.out.print("We are in the if statment\n");
                ChessPosition pos = new ChessPosition(rrow2, ccol2);
                System.out.print("pos has been created\n");

                if (board.getPiece(pos) == null)
                {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow2, ccol2), null);
                    moves.add(p1);
                }

                else if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
                {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow2, ccol2), null);
                    moves.add(p1);
                }
            }

            int rrow3 = myPosition.getRow();
            int ccol3 = myPosition.getColumn();
            rrow3--;
            ccol3 += 2;

            if (rrow3 >= 1 && ccol3 <= 8) //(r - 1, c + 2)
            {
                System.out.print("We are in the if statment\n");
                ChessPosition pos = new ChessPosition(rrow3, ccol3);
                System.out.print("pos has been created\n");

                if (board.getPiece(pos) == null)
                {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow3, ccol3), null);
                    moves.add(p1);
                }

                else if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
                {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow3, ccol3), null);
                    moves.add(p1);
                }
            }

            int rrow4 = myPosition.getRow();
            int ccol4 = myPosition.getColumn();
            rrow4 -= 2;
            ccol4++;

            if (rrow4 >= 1 && ccol4 <= 8) //(r - 2, c + 1)
            {
                System.out.print("We are in the if statment\n");
                ChessPosition pos = new ChessPosition(rrow4, ccol4);
                System.out.print("pos has been created\n");

                if (board.getPiece(pos) == null)
                {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow4, ccol4), null);
                    moves.add(p1);
                }

                else if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
                {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow4, ccol4), null);
                    moves.add(p1);
                }
            }

            int rrow5 = myPosition.getRow();
            int ccol5 = myPosition.getColumn();
            rrow5 -= 2;
            ccol5--;

            if (rrow5 >= 1 && ccol5 >= 1) //(r - 2, c - 1)
            {
                System.out.print("We are in the if statment\n");
                ChessPosition pos = new ChessPosition(rrow5, ccol5);
                System.out.print("pos has been created\n");

                if (board.getPiece(pos) == null)
                {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow5, ccol5), null);
                    moves.add(p1);
                }

                else if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
                {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow5, ccol5), null);
                    moves.add(p1);
                }
            }

            int rrow6 = myPosition.getRow();
            int ccol6 = myPosition.getColumn();
            rrow6--;
            ccol6 -= 2;

            if (rrow6 >= 1 && ccol6 >= 1) //(r - 1, c - 2)
            {
                System.out.print("We are in the if statment\n");
                ChessPosition pos = new ChessPosition(rrow6, ccol6);
                System.out.print("pos has been created\n");

                if (board.getPiece(pos) == null)
                {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow6, ccol6), null);
                    moves.add(p1);
                }

                else if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
                {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow6, ccol6), null);
                    moves.add(p1);
                }
            }

            int rrow7 = myPosition.getRow();
            int ccol7 = myPosition.getColumn();
            rrow7++;
            ccol7 -= 2;

            if (rrow7 <= 8 && ccol7 >= 1) //(r + 1, c - 2)
            {
                System.out.print("We are in the if statment\n");
                ChessPosition pos = new ChessPosition(rrow7, ccol7);
                System.out.print("pos has been created\n");

                if (board.getPiece(pos) == null)
                {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow7, ccol7), null);
                    moves.add(p1);
                }

                else if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
                {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow7, ccol7), null);
                    moves.add(p1);
                }
            }

            int rrow8 = myPosition.getRow();
            int ccol8 = myPosition.getColumn();
            rrow8 += 2;
            ccol8--;

            if (rrow8 <= 8 && ccol8 >= 1) //(r + 2, c - 1)
            {
                System.out.print("We are in the if statment\n");
                ChessPosition pos = new ChessPosition(rrow8, ccol8);
                System.out.print("pos has been created\n");

                if (board.getPiece(pos) == null)
                {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow8, ccol8), null);
                    moves.add(p1);
                }

                else if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
                {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow8, ccol8), null);
                    moves.add(p1);
                }
            }
            run = false;
        }
    }
}


