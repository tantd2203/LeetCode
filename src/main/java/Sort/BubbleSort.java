package Sort;

public class BubbleSort {

    public static void printArray(int no , int [] a)
    {
        System.out.printf("%d: ", no );
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ",a[i]);
        }
        System.out.println( );
    }
    public  static  void bubbleSort(int []array){
        int n = array.length;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n-i-1; j++) {

                if (array[j] > array[j+1])
                {
                    swap(array, j);

                }
            }
            printArray(i,array);

        }
    }

    private static void swap(int[] array, int j) {
        int temp = array[j];
        array[j] = array[j +1];
        array[j +1] =temp;
    }

    public static void main(String[] args) {
        int [] a = {5,3,2,7,8,1,2};
        bubbleSort(a);
    }
}
