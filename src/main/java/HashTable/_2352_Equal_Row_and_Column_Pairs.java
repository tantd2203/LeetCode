package HashTable;

import java.util.HashSet;

public class _2352_Equal_Row_and_Column_Pairs {
    public static int equalPairs(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int count = 0;
        HashSet<Integer> rowHashSet = new HashSet<>();
        HashSet<Integer> columnHastSet = new HashSet<>();

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < column; j++) {
                rowHashSet.add(grid[i][j]);
                System.out.println();
            }
            System.out.println();
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        equalPairs(grid);
    }
}
