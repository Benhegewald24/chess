package chess;

/**
 * Represents a single square position on a chess board
 * <p>
 * Note: You can add to this class
 */
public class ChessPosition
{
    private final int row;  //instance variable
    private final int col;  //instance variable

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
        return this.row;
    }

    /**
     * @return which column this position is in
     * 1 codes for the left row
     */
    public int getColumn()
    {
        return this.col;
    }
}
