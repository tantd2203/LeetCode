package HashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class _2352_Equal_Row_and_Column_Pairs {
    public static int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;

        HashMap<String, Integer> rowMap = new HashMap<>();

        for (int[] row : grid) {

            String rowString = Arrays.toString(row);

            rowMap.put(rowString, rowMap.getOrDefault(rowString, 0) + 1);
        }


        for (int i = 0; i < n; i++) {
            int[] colArray = new int[n];
            for (int j = 0; j < n; j++) {
                colArray[j] = grid[j][i];
            }

            count += rowMap.getOrDefault(Arrays.toString(colArray), 0);
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        System.out.println(equalPairs(grid));
    }
}
// idea bài này là put hết row vô cái row list và cho cái giá trị của nó = 1 , nếu chưa cho cái row đó trong map =1 có r  = 0
// xong đến đoạn đếm số column thì xem thử đã có chưa nếu có r thì +1 đơn vị nếu chưa thì k