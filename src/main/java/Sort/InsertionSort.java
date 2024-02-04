package Sort;

public class InsertionSort {

    private static  void Insertion_Sort(int[] array){

        for (int i = 1; i < array.length ; i++) {
            int j = i-1;
            int ai = array[i];

            while (j>=0 && ai< array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = ai;
            printArray(i,array);
        }


    }
    public static void printArray(int no , int [] a)
    {
        System.out.printf("%d: ", no );
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ",a[i]);
        }
        System.out.println( );
    }
    public static void main(String[] args) {
        int a[] = {4,2,2,1,7,8,5};
        Insertion_Sort(a);

    }
}
