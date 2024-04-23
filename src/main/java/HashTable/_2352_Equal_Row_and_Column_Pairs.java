package HashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class _2352_Equal_Row_and_Column_Pairs {
    public static int equalPairs(int[][] grid) {
        int count = 0;
        int n = grid.length;

        Map<String, Integer> rowCounter = new HashMap<>();

        for (int[] row : grid) {

            String rowString = Arrays.toString(row);
            rowCounter.put(rowString, rowCounter.getOrDefault(rowString, 0) + 1);
        }
        for (int c = 0; c < n; c++) {
            int[] colArray = new int[n];
            for (int r = 0; r < n; r++) {
                colArray[r] = grid[r][c];
            }
            count += rowCounter.getOrDefault(Arrays.toString(colArray), 0);
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        System.out.println(        equalPairs(grid));
    }
}
