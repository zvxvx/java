package lab7.cscd211recursion;

public class CSCD211Lab7 {
    public static void main(String[] args) {
        for (int x = 0; x < 8; x++)
            System.out.printf("Square - Row: %d - Blocks: %d\n", x, square(x));
    }

    /**
     * We have square made of blocks.
     * The topmost row has 1 block, the next row down has 2 blocks,
     * the next row has 3 blocks, and so on.
     * Compute recursively (no loops or multiplication) the total
     * number of blocks in such a square with the given number of rows.
     * <p>
     * square(0) - 0
     * square(1) - 1
     * square(2) - 3
     *
     * <br>
     *
     * @param row The number of rows
     * @return int - the number of blocks for the given n
     */
    public static int square(final int row) {
        // base case
        //recursive call square(updated params)
        // return total number of blocks
        return -1;
    }

}

/*
Square - Row: 0 - Blocks: 0
Square - Row: 1 - Blocks: 1
Square - Row: 2 - Blocks: 3
Square - Row: 3 - Blocks: 6
Square - Row: 4 - Blocks: 10
Square - Row: 5 - Blocks: 15
Square - Row: 6 - Blocks: 21
Square - Row: 7 - Blocks: 28
*/
 
