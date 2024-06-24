package Array;

public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {

        int numberAccount = accounts.length;
        int numberBank    = accounts[0].length;
        int maxPrice      = 0;
//
//        int [] arraySumPrice = new int[numberAccount];

        for (int i = 0; i < numberAccount; i++) {
            int sumPrice      = 0;
            for (int j = 0; j < numberBank; j++) {

                sumPrice += accounts[i][j];
            }
            if (sumPrice > maxPrice){
                maxPrice = sumPrice;

            }
//            arraySumPrice[i] = sumPrice;
        }
//        for (int i = 0; i < numberAccount ; i++) {
//
//            System.out.println( i+  " sum :"+arraySumPrice[i] );
//        }

        return  maxPrice;
    }

    public static void main(String[] args) {
        int [] [] array = {{1,5},{7,3},{1,9}};
        System.out.println(maximumWealth(array));
    }

}
