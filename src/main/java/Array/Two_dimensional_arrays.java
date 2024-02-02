package Array;

public class Two_dimensional_arrays {
    public static void main(String[] args) {

         int [] [] array = {{1,1,1},{2,2,2}};

        int row =array.length;
        int column =  array[0].length;


        System.out.println( "number column: "+column);
        System.out.println("number row : "+row);

        for (int i = 0; i <row ; i++) {

            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    }

}