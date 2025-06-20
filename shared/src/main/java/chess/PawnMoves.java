package chess;

import java.util.ArrayList;

import static chess.ChessGame.TeamColor.WHITE;
import static chess.ChessPiece.PieceType.*;

public class PawnMoves
{
    public void moves(ChessBoard board, ChessPosition myPosition, ArrayList<ChessMove> moves)
    {
        int rrow1 = myPosition.getRow();
        int ccol1 = myPosition.getColumn();
        ChessPosition p1 = new ChessPosition(rrow1, ccol1);

        if (rrow1 == 2 && board.getPiece(myPosition).getTeamColor() == WHITE) //WHITE 2 Step
        {
            rrow1++;
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
        ChessPosition p3 = new ChessPosition(rrow3, ccol3);

        if (rrow3 != 8 && board.getPiece(myPosition).getTeamColor() == WHITE) //WHITE 1 forward no promotion
        {
            rrow3++;
            ChessPosition pos = new ChessPosition(rrow3, ccol3);
            ChessMove mo4 = new ChessMove(myPosition, pos, null);
            moves.add(mo4);
        }

        int rrow5 = myPosition.getRow();
        int ccol5 = myPosition.getColumn();
        ChessPosition p5 = new ChessPosition(rrow5, ccol5);

        if (rrow5 == 7 && board.getPiece(p5).getTeamColor() == WHITE) //WHITE 1 forward promotion
        {
            rrow5++;
            ChessPosition pos = new ChessPosition(rrow5, ccol5);
            ChessMove mo6 = new ChessMove(myPosition, pos, ROOK);
            moves.add(mo6);
            ChessMove mo7 = new ChessMove(myPosition, pos, KNIGHT);
            moves.add(mo7);
            ChessMove mo8 = new ChessMove(myPosition, pos, BISHOP);
            moves.add(mo8);
            ChessMove mo9 = new ChessMove(myPosition, pos, QUEEN);
            moves.add(mo9);
        }

        int rrow6 = myPosition.getRow();
        int ccol6 = myPosition.getColumn();

        if (ccol6 > 1 && rrow6 <= 7 && board.getPiece(myPosition).getTeamColor() == WHITE) //WHITE take left
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
        ChessPosition p2 = new ChessPosition(rrow2, ccol2);

        if (rrow2 == 7 && board.getPiece(p2).getTeamColor() == ChessGame.TeamColor.BLACK) //BLACK 2 Step
        {
            rrow2--;
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

        int rrow23 = myPosition.getRow();
        int ccol23 = myPosition.getColumn();
        ChessPosition p23 = new ChessPosition(rrow23, ccol23);

        if (rrow23 > 2 && board.getPiece(p23).getTeamColor() == ChessGame.TeamColor.BLACK) //Black 1 forward no promotion
        {
            rrow23--;
            ChessPosition p24 = new ChessPosition(rrow23, ccol23);
            ChessMove mo24 = new ChessMove(myPosition, p24, null);
            moves.add(mo24);
        }

        int rrow25 = myPosition.getRow();
        int ccol25 = myPosition.getColumn();
        ChessPosition p25 = new ChessPosition(rrow25, ccol25);

        if (rrow25 == 2 && board.getPiece(p5).getTeamColor() == ChessGame.TeamColor.BLACK) //Black 1 forward promotion
        {
            rrow25--;
            ChessPosition p6 = new ChessPosition(rrow25, ccol25);
            ChessMove mo26 = new ChessMove(myPosition, p6, ChessPiece.PieceType.ROOK);
            moves.add(mo26);
            ChessMove mo27 = new ChessMove(myPosition, p6, KNIGHT);
            moves.add(mo27);
            ChessMove mo28 = new ChessMove(myPosition, p6, BISHOP);
            moves.add(mo28);
            ChessMove mo29 = new ChessMove(myPosition, p6, QUEEN);
            moves.add(mo29);
        }

        int rrow73 = myPosition.getRow();
        int ccol73 = myPosition.getColumn();
        ChessPosition p73 = new ChessPosition(rrow73, ccol73);

        if (ccol73 > 1 && rrow73 > 1 && board.getPiece(p3).getTeamColor() == ChessGame.TeamColor.BLACK) //BLACK take left
        {
            rrow73--;
            ccol73--;
            ChessPosition pos = new ChessPosition(rrow73, ccol73);

            if (rrow73 == 1 && board.getPiece(pos) != null && board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor())
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

            if (rrow73 != 1 && board.getPiece(pos) != null && board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor())
            {
                ChessMove mo44 = new ChessMove(myPosition, pos, null);
                moves.add(mo44);
            }
        }

        int rrow85 = myPosition.getRow();
        int ccol85 = myPosition.getColumn();
        ChessPosition p85 = new ChessPosition(rrow85, ccol85);

        if (ccol85 < 8 && rrow85 > 1 && board.getPiece(p3).getTeamColor() == ChessGame.TeamColor.BLACK) //BLACK take right
        {
            rrow85--;
            ccol85++;
            ChessPosition pos = new ChessPosition(rrow85, ccol85);

            if (rrow85 == 1 && board.getPiece(pos) != null && board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor())
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

            if (rrow85 != 1 && board.getPiece(pos) != null && board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor())
            {
                ChessMove mo44 = new ChessMove(myPosition, pos, null);
                moves.add(mo44);
            }
        }
    }
}
