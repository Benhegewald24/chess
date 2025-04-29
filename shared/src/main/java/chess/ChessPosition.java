package chess;

/**
 * Represents a single square position on a chess board
 * <p>
 * Note: You can add to this class
 */
public class ChessPosition
{
    private final int row;  //field
    private final int col;  //field

    public ChessPosition(int row, int col) //constructor
    {
        this.row = row;
        this.col = col;
    }

    /**
     * @return which row this position is in
     * 1 codes for the bottom row
     */
    public int getRow()
    {
        return row;
    }

    /**
     * @return which column this position is in
     * 1 codes for the left row
     */
    public int getColumn()
    {
        return col;
    }
}
