package Array;

public class _1351_Count_Negative_Numbers_in_a_Sorted_Matrix {
    public int countNegatives(int[][] grid) {

        int  count = 0;
        int row = grid.length;
        int column = grid[0].length;

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < column; j++) {

                if (grid[i][j] < 0){
                    count ++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {

    }
}
