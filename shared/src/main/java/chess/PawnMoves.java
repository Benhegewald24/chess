package chess;

import java.util.ArrayList;

public class PawnMoves //need to implement Promotions as well as En Passant?
{
    public ArrayList<ChessMove> moveCalculator(ChessBoard board, ChessPosition myPosition)
    {
        ArrayList<ChessMove> moves = new ArrayList<>();
        return moves;
    }

    public void move(ChessBoard board, ChessPosition myPosition, ArrayList<ChessMove> moves)
    {
        int rrow2 = myPosition.getRow();
        int ccol2 = myPosition.getColumn();

        if (rrow2 == 2 && board.getPiece(myPosition).getTeamColor() == ChessGame.TeamColor.WHITE) //move 2 spaces from White starting position
        {
            rrow2 += 2;
            ChessPosition pos = new ChessPosition(rrow2, ccol2);

            int another_rrow2 = myPosition.getRow();
            int another_ccol2 = myPosition.getColumn();
            another_rrow2++;
            ChessPosition another_pos = new ChessPosition(another_rrow2, another_ccol2);

            if (board.getPiece(pos) == null && board.getPiece(another_pos) == null)
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow2, ccol2), null);
                moves.add(p1);
            }
        }

        int rrow3 = myPosition.getRow();
        int ccol3 = myPosition.getColumn();

        if (board.getPiece(myPosition).getTeamColor() == ChessGame.TeamColor.WHITE) //move straight forward 1 space for White
        {
            rrow3++;

            ChessPosition pos = new ChessPosition(rrow3, ccol3);

            if (rrow3 == 8 && board.getPiece(pos) == null)
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow3, ccol3), ChessPiece.PieceType.KNIGHT);
                moves.add(p1);
                ChessMove p2 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow3, ccol3), ChessPiece.PieceType.QUEEN);
                moves.add(p2);
                ChessMove p3 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow3, ccol3), ChessPiece.PieceType.ROOK);
                moves.add(p3);
                ChessMove p4 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow3, ccol3), ChessPiece.PieceType.BISHOP);
                moves.add(p4);
            }

            if (rrow3 != 8 && board.getPiece(pos) == null)
            {
            ChessMove p0 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow3, ccol3), null);
            moves.add(p0);
            }
        }

        int rrow4 = myPosition.getRow();
        int ccol4 = myPosition.getColumn();

        if (board.getPiece(myPosition).getTeamColor() == ChessGame.TeamColor.WHITE && ccol4 >= 2) //Capture to the left for White
        {
            rrow4++;
            ccol4--;

            ChessPosition pos = new ChessPosition(rrow4, ccol4);

            if (rrow4 == 8 && board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
            ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow4, ccol4), ChessPiece.PieceType.KNIGHT);
            moves.add(p1);
            ChessMove p2 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow4, ccol4), ChessPiece.PieceType.QUEEN);
            moves.add(p2);
            ChessMove p3 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow4, ccol4), ChessPiece.PieceType.ROOK);
            moves.add(p3);
            ChessMove p4 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow4, ccol4), ChessPiece.PieceType.BISHOP);
            moves.add(p4);
            }

            if (rrow4 != 8 && board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p0 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow4, ccol4), null);
                moves.add(p0);
            }
        }

        int rrow5 = myPosition.getRow();
        int ccol5 = myPosition.getColumn();

        if (board.getPiece(myPosition).getTeamColor() == ChessGame.TeamColor.WHITE && ccol5 <= 7) //Capture to the right for White
        {
            rrow5++;
            ccol5++;

            ChessPosition pos = new ChessPosition(rrow5, ccol5);

            if (rrow5 == 8 && board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
        {
            ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow5, ccol5), ChessPiece.PieceType.KNIGHT);
            moves.add(p1);
            ChessMove p2 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow5, ccol5), ChessPiece.PieceType.QUEEN);
            moves.add(p2);
            ChessMove p3 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow5, ccol5), ChessPiece.PieceType.ROOK);
            moves.add(p3);
            ChessMove p4 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow5, ccol5), ChessPiece.PieceType.BISHOP);
            moves.add(p4);
        }

            if (rrow5 != 8 && board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p0 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow5, ccol5), null);
                moves.add(p0);
            }
        }

        int rrow7 = myPosition.getRow();
        int ccol7 = myPosition.getColumn();

        if (rrow7 == 7 && board.getPiece(myPosition).getTeamColor() == ChessGame.TeamColor.BLACK) //For black pawn on starting rank, moving 2 spaces forward
        {
            rrow7 -= 2;
            ChessPosition pos = new ChessPosition(rrow7, ccol7);

            int another_rrow7 = myPosition.getRow();
            int another_ccol7 = myPosition.getColumn();
            another_rrow7--;
            ChessPosition another_pos = new ChessPosition(another_rrow7, another_ccol7);

            if (board.getPiece(pos) == null && board.getPiece(another_pos) == null)
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow7, ccol7), null);
                moves.add(p1);
            }
        }

        int rrow8 = myPosition.getRow();
        int ccol8 = myPosition.getColumn();

        if (board.getPiece(myPosition).getTeamColor() == ChessGame.TeamColor.BLACK) //move straight forward 1 space for Black
        {
            rrow8--;

            ChessPosition pos = new ChessPosition(rrow8, ccol8);

            if (rrow8 == 1 && board.getPiece(pos) == null)
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow8, ccol8), ChessPiece.PieceType.KNIGHT);
                moves.add(p1);
                ChessMove p2 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow8, ccol8), ChessPiece.PieceType.QUEEN);
                moves.add(p2);
                ChessMove p3 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow8, ccol8), ChessPiece.PieceType.ROOK);
                moves.add(p3);
                ChessMove p4 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow8, ccol8), ChessPiece.PieceType.BISHOP);
                moves.add(p4);

            }
            if (rrow8 != 1 && board.getPiece(pos) == null)
            {
                    ChessMove p0 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow8, ccol8), null);
                    moves.add(p0);
            }
        }

        int rrow10 = myPosition.getRow();
        int ccol10 = myPosition.getColumn();

        if (board.getPiece(myPosition).getTeamColor() == ChessGame.TeamColor.BLACK && ccol10 >= 2) //Capture to the left for Black
        {
            rrow10--;
            ccol10--;

            ChessPosition pos = new ChessPosition(rrow10, ccol10);

            if (rrow10 == 1 && board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow10, ccol10), ChessPiece.PieceType.KNIGHT);
                moves.add(p1);
                ChessMove p2 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow10, ccol10), ChessPiece.PieceType.QUEEN);
                moves.add(p2);
                ChessMove p3 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow10, ccol10), ChessPiece.PieceType.ROOK);
                moves.add(p3);
                ChessMove p4 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow10, ccol10), ChessPiece.PieceType.BISHOP);
                moves.add(p4);
            }

            if (rrow10 != 1 && board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow10, ccol10), null);
                moves.add(p1);
            }
        }

        int rrow11 = myPosition.getRow();
        int ccol11 = myPosition.getColumn();

        if (board.getPiece(myPosition).getTeamColor() == ChessGame.TeamColor.BLACK && ccol11 <= 7) //Capture to the right for Black
        {
            rrow11--;
            ccol11++;

            ChessPosition pos = new ChessPosition(rrow11, ccol11);

            if (rrow11 == 1 && board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow11, ccol11), ChessPiece.PieceType.KNIGHT);
                moves.add(p1);
                ChessMove p2 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow11, ccol11), ChessPiece.PieceType.QUEEN);
                moves.add(p2);
                ChessMove p3 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow11, ccol11), ChessPiece.PieceType.ROOK);
                moves.add(p3);
                ChessMove p4 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow11, ccol11), ChessPiece.PieceType.BISHOP);
                moves.add(p4);
            }

            if (rrow11 != 1 && board.getPiece(pos) != null && (board.getPiece(pos).getTeamColor() != board.getPiece(myPosition).getTeamColor()))
            {
                ChessMove p1 = new ChessMove(new ChessPosition(myPosition.getRow(), myPosition.getColumn()), new ChessPosition(rrow11, ccol11), null);
                moves.add(p1);
            }
        }
    }
}
