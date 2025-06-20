package chess;

import java.util.ArrayList;

import static chess.ChessGame.TeamColor.BLACK;
import static chess.ChessGame.TeamColor.WHITE;
import static chess.ChessPiece.PieceType.*;

public class PawnMoves
{
    public void moves(ChessBoard board, ChessPosition myPosition, ArrayList<ChessMove> moves)
    {
        int rrow1 = myPosition.getRow();
        int ccol1 = myPosition.getColumn();

        if (rrow1 == 2 && board.getPiece(myPosition).getTeamColor() == WHITE) //WHITE 2 Step
        {
            rrow1++;
            ChessPosition p1 = new ChessPosition(rrow1, ccol1);

            if (board.getPiece(p1) == null)
            {
                rrow1++;
                ChessPosition pos = new ChessPosition(rrow1, ccol1);

                if (board.getPiece(pos) == null)
                {
                    ChessMove mo = new ChessMove(myPosition, pos, null);
                    moves.add(mo);
                }
            }
        }

        int rrow3 = myPosition.getRow();
        int ccol3 = myPosition.getColumn();

        if (rrow3 < 7 && board.getPiece(myPosition).getTeamColor() == WHITE) //WHITE 1 forward no promotion
        {
            rrow3++;
            ChessPosition pos = new ChessPosition(rrow3, ccol3);

            if (board.getPiece(pos) == null)
            {
                ChessMove mo4 = new ChessMove(myPosition, pos, null);
                moves.add(mo4);
            }
        }

        int rrow5 = myPosition.getRow();
        int ccol5 = myPosition.getColumn();

        if (rrow5 == 7 && board.getPiece(myPosition).getTeamColor() == WHITE) //WHITE 1 forward promotion
        {
            rrow5++;
            ChessPosition pos = new ChessPosition(rrow5, ccol5);

            if (board.getPiece(pos) == null)
            {
                ChessMove mo6 = new ChessMove(myPosition, pos, ROOK);
                moves.add(mo6);
                ChessMove mo7 = new ChessMove(myPosition, pos, KNIGHT);
                moves.add(mo7);
                ChessMove mo8 = new ChessMove(myPosition, pos, BISHOP);
                moves.add(mo8);
                ChessMove mo9 = new ChessMove(myPosition, pos, QUEEN);
                moves.add(mo9);
            }
        }

        int rrow6 = myPosition.getRow();
        int ccol6 = myPosition.getColumn();

        if (ccol6 > 1 && rrow6 < 8 && board.getPiece(myPosition).getTeamColor() == WHITE) //WHITE take left
        {
            rrow6++;
            ccol6--;
            ChessPosition pos = new ChessPosition(rrow6, ccol6);

            if (rrow6 == 8 && board.getPiece(pos) != null && board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor())
            {
                ChessMove mo44 = new ChessMove(myPosition, pos, ROOK);
                moves.add(mo44);
                ChessMove mo45 = new ChessMove(myPosition, pos, KNIGHT);
                moves.add(mo45);
                ChessMove mo46 = new ChessMove(myPosition, pos, BISHOP);
                moves.add(mo46);
                ChessMove mo47 = new ChessMove(myPosition, pos, QUEEN);
                moves.add(mo47);
            }

            if (rrow6 != 8 && board.getPiece(pos) != null && board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor())
            {
                ChessMove mo44 = new ChessMove(myPosition, pos, null);
                moves.add(mo44);
            }
        }

        int rrow7 = myPosition.getRow();
        int ccol7 = myPosition.getColumn();

        if (ccol7 < 8 && rrow7 < 8 && board.getPiece(myPosition).getTeamColor() == WHITE) //WHITE take right
        {
            rrow7++;
            ccol7++;
            ChessPosition pos = new ChessPosition(rrow7, ccol7);

            if (rrow7 == 8 && board.getPiece(pos) != null && board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor())
            {
                ChessMove mo54 = new ChessMove(myPosition, pos, ROOK);
                moves.add(mo54);
                ChessMove mo55 = new ChessMove(myPosition, pos, KNIGHT);
                moves.add(mo55);
                ChessMove mo56 = new ChessMove(myPosition, pos, BISHOP);
                moves.add(mo56);
                ChessMove mo57 = new ChessMove(myPosition, pos, QUEEN);
                moves.add(mo57);
            }

            if (rrow7 != 8 && board.getPiece(pos) != null && board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor())
            {
                ChessMove mo44 = new ChessMove(myPosition, pos, null);
                moves.add(mo44);
            }
        }

        int rrow2 = myPosition.getRow();
        int ccol2 = myPosition.getColumn();


        if (rrow2 == 7 && board.getPiece(myPosition).getTeamColor() == BLACK) //BLACK 2 Step
        {
            rrow2--;
            ChessPosition p2 = new ChessPosition(rrow2, ccol2);

            if (board.getPiece(p2) == null)
            {
                rrow2--;
                ChessPosition pos2 = new ChessPosition(rrow2, ccol2);

                if (board.getPiece(pos2) == null)
                {
                    ChessMove mo2 = new ChessMove(myPosition, pos2, null);
                    moves.add(mo2);
                }
            }
        }

        int rrow9 = myPosition.getRow();
        int ccol9 = myPosition.getColumn();

        if (rrow9 > 2 && board.getPiece(myPosition).getTeamColor() == BLACK) //Black 1 forward no promotion
        {
            rrow9--;
            ChessPosition pos = new ChessPosition(rrow9, ccol9);

            if (board.getPiece(pos) == null)
            {
                ChessMove mo24 = new ChessMove(myPosition, pos, null);
                moves.add(mo24);
            }
        }

        int rrow10 = myPosition.getRow();
        int ccol10 = myPosition.getColumn();

        if (rrow10 == 2 && board.getPiece(myPosition).getTeamColor() == BLACK) //Black 1 forward promotion
        {
            rrow10--;
            ChessPosition p6 = new ChessPosition(rrow10, ccol10);
            ChessMove mo26 = new ChessMove(myPosition, p6, ChessPiece.PieceType.ROOK);
            moves.add(mo26);
            ChessMove mo27 = new ChessMove(myPosition, p6, KNIGHT);
            moves.add(mo27);
            ChessMove mo28 = new ChessMove(myPosition, p6, BISHOP);
            moves.add(mo28);
            ChessMove mo29 = new ChessMove(myPosition, p6, QUEEN);
            moves.add(mo29);
        }

        int rrow11 = myPosition.getRow();
        int ccol11 = myPosition.getColumn();

        if (ccol11 > 1 && rrow11 > 1 && board.getPiece(myPosition).getTeamColor() == BLACK) //BLACK take left
        {
            rrow11--;
            ccol11--;
            ChessPosition pos = new ChessPosition(rrow11, ccol11);

            if (rrow11 == 1 && board.getPiece(pos) != null && board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor())
            {
                ChessMove mo44 = new ChessMove(myPosition, pos, ROOK);
                moves.add(mo44);
                ChessMove mo45 = new ChessMove(myPosition, pos, KNIGHT);
                moves.add(mo45);
                ChessMove mo46 = new ChessMove(myPosition, pos, BISHOP);
                moves.add(mo46);
                ChessMove mo47 = new ChessMove(myPosition, pos, QUEEN);
                moves.add(mo47);
            }

            else if (rrow11 != 1 && board.getPiece(pos) != null && board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor())
            {
                ChessMove mo44 = new ChessMove(myPosition, pos, null);
                moves.add(mo44);
            }
        }

        int rrow12 = myPosition.getRow();
        int ccol12 = myPosition.getColumn();

        if (ccol12 < 8 && rrow12 > 1 && board.getPiece(myPosition).getTeamColor() == BLACK) //BLACK take right
        {
            rrow12--;
            ccol12++;
            ChessPosition pos = new ChessPosition(rrow12, ccol12);

            if (rrow12 == 1 && board.getPiece(pos) != null && board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor())
            {
                ChessMove mo54 = new ChessMove(myPosition, pos, ROOK);
                moves.add(mo54);
                ChessMove mo55 = new ChessMove(myPosition, pos, KNIGHT);
                moves.add(mo55);
                ChessMove mo56 = new ChessMove(myPosition, pos, BISHOP);
                moves.add(mo56);
                ChessMove mo57 = new ChessMove(myPosition, pos, QUEEN);
                moves.add(mo57);
            }

            if (rrow12 != 1 && board.getPiece(pos) != null && board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor())
            {
                ChessMove mo44 = new ChessMove(myPosition, pos, null);
                moves.add(mo44);
            }
        }
    }
}
