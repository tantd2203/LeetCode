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

        for (int col = numCol - 1; 0 >= col; col--) {

            int maxColum = 0;

            for (int row = 0; row < numRow; row++) {
                maxColum = Math.max(maxColum, grid[row][col]);
            }
            result += maxColum;
        }


        return result;

    }

    public static void main(String[] args) {
        int[][] grid = {{5, 3, 9, 1}};

        int result = deleteGreatestValue(grid);
        System.out.println(result); // Expected Output: 9

    }
}
