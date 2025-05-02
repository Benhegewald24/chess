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

            if (rrow1 <= 6 && ccol1 <= 7) //(r + 2, c + 1)
            {
                rrow1 += 2;
                ccol1++;
                System.out.print("We are in the if statment");
                ChessPosition pos = new ChessPosition(rrow1, ccol1);
                System.out.print("pos has been created");
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

            if (rrow2 <= 7 && ccol2 <= 6) //(r + 1, c + 2)
            {
                rrow2++;
                ccol2 += 2;
                System.out.print("We are in the if statment");
                ChessPosition pos = new ChessPosition(rrow2, ccol2);
                System.out.print("pos has been created");

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

            if (rrow3 >= 2 && ccol3 <= 6) //(r - 1, c + 2)
            {
                rrow3--;
                ccol3 += 2;
                System.out.print("We are in the if statment");
                ChessPosition pos = new ChessPosition(rrow3, ccol3);
                System.out.print("pos has been created");

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

            if (rrow4 >= 3 && ccol4 <= 7) //(r - 2, c + 1)
            {
                rrow4 -= 2;
                ccol4++;
                System.out.print("We are in the if statment");
                ChessPosition pos = new ChessPosition(rrow4, ccol4);
                System.out.print("pos has been created");

                if (board.getPiece(pos) == null) {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow4, ccol4), null);
                    moves.add(p1);
                } else if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor())) {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow4, ccol4), null);
                    moves.add(p1);
                }
            }

            int rrow5 = myPosition.getRow();
            int ccol5 = myPosition.getColumn();

            if (rrow5 >= 3 && ccol5 >= 2) //(r - 2, c - 1)
            {
                rrow5 -= 2;
                ccol5--;
                System.out.print("We are in the if statment");
                ChessPosition pos = new ChessPosition(rrow5, ccol5);
                System.out.print("pos has been created");

                if (board.getPiece(pos) == null) {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow5, ccol5), null);
                    moves.add(p1);
                } else if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor())) {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow5, ccol5), null);
                    moves.add(p1);
                }
            }

            int rrow6 = myPosition.getRow();
            int ccol6 = myPosition.getColumn();

            if (rrow6 >= 2 && ccol6 >= 3) //(r - 1, c - 2)
            {
                rrow6--;
                ccol6 -= 2;
                System.out.print("We are in the if statment");
                ChessPosition pos = new ChessPosition(rrow6, ccol6);
                System.out.print("pos has been created");

                if (board.getPiece(pos) == null) {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow6, ccol6), null);
                    moves.add(p1);
                } else if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor())) {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow6, ccol6), null);
                    moves.add(p1);
                }
            }

            int rrow7 = myPosition.getRow();
            int ccol7 = myPosition.getColumn();

            if (rrow7 <= 7 && ccol7 >= 3) //(r + 1, c - 2)
            {
                rrow7++;
                ccol7 -= 2;
                System.out.print("We are in the if statment");
                ChessPosition pos = new ChessPosition(rrow7, ccol7);
                System.out.print("pos has been created");

                if (board.getPiece(pos) == null) {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow7, ccol7), null);
                    moves.add(p1);
                } else if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor())) {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow7, ccol7), null);
                    moves.add(p1);
                }
            }

            int rrow8 = myPosition.getRow();
            int ccol8 = myPosition.getColumn();

            if (rrow8 <= 6 && ccol8 >= 2) //(r + 2, c - 1)
            {
                rrow8 += 2;
                ccol8--;
                System.out.print("We are in the if statment");
                ChessPosition pos = new ChessPosition(rrow8, ccol8);
                System.out.print("pos has been created");

                if (board.getPiece(pos) == null) {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow8, ccol8), null);
                    moves.add(p1);
                } else if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor())) {
                    ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow8, ccol8), null);
                    moves.add(p1);
                }
            }
            run = false;
        }
    }
}


