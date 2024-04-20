package Array;

import java.util.HashSet;

public class Two_dimensional_arrays {
    public static void main(String[] args) {

        int[][] array = {{1, 3, 1}, {2, 8, 2}};

        int row = array.length;
        int column = array[0].length;
        int count = 0;
        HashSet<Integer> rowHashSet = new HashSet<>();
        HashSet<Integer> columnHastSet = new HashSet<>();

        System.out.println("number column: " + column);
        System.out.println("number row : " + row);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

            }


        }
    }

}