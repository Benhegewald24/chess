package chess;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Represents a single chess piece
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPiece
{
    private ChessGame.TeamColor teamColor;
    private PieceType pieceType;

    public ChessPiece(ChessGame.TeamColor pieceColor, ChessPiece.PieceType type) //constructor
    {
        //this.pieceColor = pieceColor;
        //this.type = type;
    }

    /**
     * The various different chess piece options
     */
    public enum PieceType
    {
        KING, QUEEN, BISHOP, KNIGHT, ROOK, PAWN
    }

    /**
     * @return Which team this chess piece belongs to
     */
    public ChessGame.TeamColor getTeamColor()
    {
        //if piece == white than it belongs to white team. if piece == black than it belongs to the black team.
        return this.teamColor;
    }

    /**
     * @return which type of chess piece this piece is
     */
    public PieceType getPieceType()
    {
        return this.pieceType;
    }

    /**
     * Calculates all the positions a chess piece can move to
     * Does not take into account moves that are illegal due to leaving the king in
     * danger
     *
     * @return Collection of valid moves
     */
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) //Collection<> is a container for storing a bunch of objects. Includes Sets, ArrayLists, and LinkedLists, etc.
    {
        ArrayList<ChessMove> moves = new ArrayList<>();
        return moves;
    }
}

// pseudo code for bishop movement. I will do it in 4 parts (for the 4 directions it can move)
//public class Bishop extends ChessPiece
//{
//     if piecetype == bishop
// move NE (r+1, c+1)
//    while we are between 1 and 8 on the columns and rows. (nested for loop 1 for columns and 1 for rows)
//    if the space is == null {we can move so add position to moves ArrayList and increment position}
//    if the space is != null && the piece there is different color {we can capture / move so add position}
//    else (break)
// move SE (r+1, c-1)
//    while we are between 1 and 8 on the columns and rows. (nested for loop 1 for columns and 1 for rows)
//    if the space is == null {we can move so add position to moves ArrayList}
//    if the space is != null && the piece there is different color {we can capture / move so add position}
//    else (break)
// move SW (r-1, c-1)
//    while we are between 1 and 8 on the columns and rows. (nested for loop 1 for columns and 1 for rows)
//    if the space is == null {we can move so add position to moves ArrayList}
//    if the space is != null && the piece there is different color {we can capture / move so add position}
//    else (break)
// move NW (r-1, c+1)
//    while we are between 1 and 8 on the columns and rows. (nested for loop 1 for columns and 1 for rows)
//    if the space is == null {we can move so add position to moves ArrayList}
//    if the space is != null && the piece there is different color {we can capture / move so add position}
//    else (break)
//}


// Do we have to account for not allowing kings to move within a space of one another?
// pseudo code for King movement.
//public class King extends ChessPiece
//{
//     if piecetype == King
//          while between 1 and 8 (nested for loops)
//            if this space (r + 1, c) is null || that space has a piece that is different color (can move)
//           (r + 1, c + 1)
//           (r, c + 1)
//           (r - 1, c + 1)
//           (r - 1, c)
//           (r - 1, c - 1)
//           (r, c - 1)
//           (r + 1, c - 1)
//}


// pseudo code for Knight movement.
//public class Knight extends ChessPiece
//{
//     if piecetype == Knight
//          while between 1 and 8 (nested for loops)
//            if this space (r + 2, c + 1) is null || that space has a piece that is different color (can move)
//           (r + 1, c + 2)
//           (r - 1, c + 2)
//           (r - 2, c + 1)
//           (r - 2, c - 1)
//           (r - 2, c - 1)
//           (r - 2, c + 1)
//           (r + 2, c - 1)
//}



// pseudo code for Pawn movement. (En passant can be ignored. Also later will implement promotions?)
// Because pawns can't move backwards, may need a white pawn copy and a black pawn copy?
//public class Pawn extends ChessPiece
//{
//     if piecetype == Pawn && color == white
//          while between 1 and 8 (nested for loops)
//              if (on row #2) (can move 2 spaces or just 1 space)
//                   if  (r + 1, c) == null, can move forward)
//                   if  (r + 2, c) == null, can move forward)

//      if (r + 1, c - 1) is != null and the piece is other color, you can capture/move
//       if  (r + 1, c) == null, can move forward)
//       if (r + 1, c - 1) is != null and the piece is other color, you can capture/move


//    if piecetype == Pawn && color == black
//          while between 1 and 8 (nested for loops)
//              if (on row #7) (can move 2 spaces or just 1 space)

//      if (r - 1, c - 1) is != null and the piece is other color, you can capture/move
//       if  (r - 1, c) == null, can move forward)
//       if (r - 1, c - 1) is != null and the piece is other color, you can capture/move
//}



// pseudo code for Queen movement.
//public class Bishop extends ChessPiece
//{
//     if piecetype == Queen
// move NE (r+1, c+1)
//    while we are between 1 and 8 on the columns and rows. (nested for loop 1 for columns and 1 for rows)
//    if the space is == null {we can move so add position to moves ArrayList}
//    if the space is != null && the piece there is different color {we can capture / move so add position}
//    else (break or move on to the next direction)

// move E (r, c+1)
//    while we are between 1 and 8 on the columns and rows. (nested for loop 1 for columns and 1 for rows)
//    if the space is == null {we can move so add position to moves ArrayList}
//    if the space is != null && the piece there is different color {we can capture / move so add position}
//    else (break or move on to the next direction)

// move SE (r+1, c-1)
//    while we are between 1 and 8 on the columns and rows. (nested for loop 1 for columns and 1 for rows)
//    if the space is == null {we can move so add position to moves ArrayList}
//    if the space is != null && the piece there is different color {we can capture / move so add position}
//    else (break)

// move S (r-1, c)
//    while we are between 1 and 8 on the columns and rows. (nested for loop 1 for columns and 1 for rows)
//    if the space is == null {we can move so add position to moves ArrayList}
//    if the space is != null && the piece there is different color {we can capture / move so add position}
//    else (break or move on to the next direction)

// move SW (r-1, c-1)
//    while we are between 1 and 8 on the columns and rows. (nested for loop 1 for columns and 1 for rows)
//    if the space is == null {we can move so add position to moves ArrayList}
//    if the space is != null && the piece there is different color {we can capture / move so add position}
//    else (break)

// move W (r, c - 1)
//    while we are between 1 and 8 on the columns and rows. (nested for loop 1 for columns and 1 for rows)
//    if the space is == null {we can move so add position to moves ArrayList}
//    if the space is != null && the piece there is different color {we can capture / move so add position}
//    else (break or move on to the next direction)

// move NW (r-1, c+1)
//    while we are between 1 and 8 on the columns and rows. (nested for loop 1 for columns and 1 for rows)
//    if the space is == null {we can move so add position to moves ArrayList}
//    if the space is != null && the piece there is different color {we can capture / move so add position}
//    else (break)
//}

// move N (r + 1, c)
//    while we are between 1 and 8 on the columns and rows. (nested for loop 1 for columns and 1 for rows)
//    if the space is == null {we can move so add position to moves ArrayList}
//    if the space is != null && the piece there is different color {we can capture / move so add position}
//    else (break or move on to the next direction)



// pseudo code for rook movement. I will do it in 4 parts (for the 4 directions it can move)
//public class Rook extends ChessPiece
//{
//     if piecetype == Rook
// move N (r+1, c)
//    while we are between 1 and 8 on the columns and rows. (nested for loop 1 for columns and 1 for rows)
//    if the space is == null {we can move so add position to moves ArrayList}
//    if the space is != null && the piece there is different color {we can capture / move so add position}
//    else (break)
// move E (r, c + 1)
//    while we are between 1 and 8 on the columns and rows. (nested for loop 1 for columns and 1 for rows)
//    if the space is == null {we can move so add position to moves ArrayList}
//    if the space is != null && the piece there is different color {we can capture / move so add position}
//    else (break)
// move S (r - 1, c)
//    while we are between 1 and 8 on the columns and rows. (nested for loop 1 for columns and 1 for rows)
//    if the space is == null {we can move so add position to moves ArrayList}
//    if the space is != null && the piece there is different color {we can capture / move so add position}
//    else (break)
// move W (r, c - 1)
//    while we are between 1 and 8 on the columns and rows. (nested for loop 1 for columns and 1 for rows)
//    if the space is == null {we can move so add position to moves ArrayList}
//    if the space is != null && the piece there is different color {we can capture / move so add position}
//    else (break)
//}

