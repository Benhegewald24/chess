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
    }
}

