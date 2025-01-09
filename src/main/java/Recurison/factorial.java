package Recurison;

public class factorial {

    public  static  int fuc_factorial(int n){

        if (n ==0)
            return  1;
        return  n * fuc_factorial( n-1);
    }
    public static void main(String[] args) {

        System.out.println(fuc_factorial(1));

    }
}
