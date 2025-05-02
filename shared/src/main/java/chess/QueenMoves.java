package chess;

import java.util.ArrayList;

public class QueenMoves
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

        while (rrow1 <= 7 && ccol1 <= 7) //move NE (r+1, c+1)
        {
            rrow1++;
            ccol1++;
            ChessPosition pos = new ChessPosition(rrow1, ccol1);

            if (board.getPiece(pos) == null)
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow1, ccol1), null);
                moves.add(p1);
            }

            else if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow1, ccol1), null);
                moves.add(p1);
                break;
            }

            else
            {
                break;
            }
        }

        int rrow2 = myPosition.getRow();
        int ccol2 = myPosition.getColumn();

        while (rrow2 >= 2 && ccol2 <= 7) //move SE (r-1, c+1)
        {
            rrow2--;
            ccol2++;
            ChessPosition pos = new ChessPosition(rrow2, ccol2);

            if (board.getPiece(pos) == null)
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow2, ccol2), null);
                moves.add(p1);
            }

            else if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow2, ccol2), null);
                moves.add(p1);
                break;
            }

            else
            {
                break;
            }
        }

        int rrow3 = myPosition.getRow();
        int ccol3 = myPosition.getColumn();

        while (rrow3 >= 2 && ccol3 >= 2) //move SW (r-1, c-1)
        {
            rrow3--;
            ccol3--;
            ChessPosition pos = new ChessPosition(rrow3, ccol3);

            if (board.getPiece(pos) == null)
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow3, ccol3), null);
                moves.add(p1);
            }

            else if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow3, ccol3), null);
                moves.add(p1);
                break;
            }

            else
            {
                break;
            }
        }

        int rrow4 = myPosition.getRow();
        int ccol4 = myPosition.getColumn();

        while (rrow4 <= 7 && ccol4 >= 2) //move NW (r+1, c-1)
        {
            rrow4++;
            ccol4--;
            ChessPosition pos = new ChessPosition(rrow4, ccol4);

            if (board.getPiece(pos) == null)
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow4, ccol4), null);
                moves.add(p1);
            }

            else if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow4, ccol4), null);
                moves.add(p1);
                break;
            }

            else
            {
                break;
            }
        }
        int rrow5 = myPosition.getRow();
        int ccol5 = myPosition.getColumn();

        while (rrow5 <= 7) //move N (r+1, c)
        {
            rrow5++;

            ChessPosition pos = new ChessPosition(rrow5, ccol5);

            if (board.getPiece(pos) == null)
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow5, ccol5), null);
                moves.add(p1);
            }

            else if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow5, ccol5), null);
                moves.add(p1);
                break;
            }

            else
            {
                break;
            }
        }

        int rrow6 = myPosition.getRow();
        int ccol6 = myPosition.getColumn();

        while (ccol6 <= 7) //move E (r, c+1)
        {
            ccol6++;
            ChessPosition pos = new ChessPosition(rrow6, ccol6);

            if (board.getPiece(pos) == null)
            {
                ChessMove p2 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow6, ccol6), null);
                moves.add(p2);
            }

            else if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p2 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow6, ccol6), null);
                moves.add(p2);
                break;
            }

            else
            {
                break;
            }
        }

        int rrow7 = myPosition.getRow();
        int ccol7 = myPosition.getColumn();

        while (rrow7 >= 2) //move S (r-1, c)
        {
            rrow7--;
            ChessPosition pos = new ChessPosition(rrow7, ccol7);

            if (board.getPiece(pos) == null)
            {
                ChessMove p3 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow7, ccol7), null);
                moves.add(p3);
            }

            else if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p3 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow7, ccol7), null);
                moves.add(p3);
                break;
            }

            else
            {
                break;
            }
        }

        int rrow8 = myPosition.getRow();
        int ccol8 = myPosition.getColumn();

        while (ccol8 >= 2) //move W (r, c-1)
        {
            ccol8--;
            ChessPosition pos = new ChessPosition(rrow8, ccol8);

            if (board.getPiece(pos) == null)
            {
                ChessMove p4 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow8, ccol8), null);
                moves.add(p4);
            }

            else if (board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p4 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow8, ccol8), null);
                moves.add(p4);
                break;
            }

            else
            {
                break;
            }
        }
    }
}

