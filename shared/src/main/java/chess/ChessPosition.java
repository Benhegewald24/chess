package chess;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o)
    {
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        ChessPosition that = (ChessPosition) o;
        return row == that.row && col == that.col;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(row, col);
    }

    @Override
    public String toString()
    {
        return "ChessPosition{" +
                "row=" + row +
                ", col=" + col +
                '}';
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