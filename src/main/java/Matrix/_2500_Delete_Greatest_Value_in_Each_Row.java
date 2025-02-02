package Matrix;

import java.util.Arrays;

public class _2500_Delete_Greatest_Value_in_Each_Row {

    public static int deleteGreatestValue(int[][] grid) {


        int result = 0;

        for (int[] row : grid) {
            Arrays.sort(row);
        }

        int numRow = grid.length;
        int numCol = grid[0].length;

        for (int col = numCol - 1; col >=0; col--) {

            int maxColum = 0;

            for (int row = 0; row < numRow; row++) {
                maxColum = Math.max(maxColum, grid[row][col]);
            }
            result += maxColum;
        }


        return result;

    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 3, 2},
                {4, 6, 5},
                {7, 9, 8}
        };

        int result = deleteGreatestValue(grid);
        System.out.println(result); // Expected Output: 9

    }
}
