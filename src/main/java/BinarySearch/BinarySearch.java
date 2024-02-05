package BinarySearch;

public class BinarySearch {

    public  static  int   binary_search( int[] n , int key){

        int size = n.length;
        int ILeft = 0;
        int IRight =  size-1;

        while (ILeft <=  IRight){

            int IMid = (IRight + ILeft) /2;

            if (n[IMid] ==  key){

                return IMid;

            } else if (key > n[IMid] ) {

                ILeft = IMid +1;

            }else {

                IRight = IMid -1;
            }

        }

        return  -1;
    }
    public static void main(String[] args) {
         int [] a = {1,2,3,4,5,6,7,8};
        System.out.println(binary_search(a,2));
    }

}
