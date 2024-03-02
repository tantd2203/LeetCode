package Math;

public class _7_Reverse_Integer {

    public static int reverse(int x) {
        long result = 0;
        if (x > 0) {

            if (x % 10 == 0) {
                x = x / 10;
                while (x != 0) {

                    result = result * 10 + x % 10;
                    x = x / 10;
                }
                if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                    return 0;
                }
                return  (int)result;
            }

            while (x != 0) {

                result = result * 10 + x % 10;
                x = x / 10;
            }
            if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
            return (int) result;
        }
        if (x < 0) {
            x = Math.abs(x);
            while (x != 0) {

                result = result * 10 + x % 10;
                x = x / 10;
            }

            if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return  0;
                }
            return (int) result - ((int) result + (int) result);
        }

        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }

        return (int)  result;
    }

    public static void main(String[] args) {
        int a = 1534236469;
         System.out.println(reverse(a));
    }
}
