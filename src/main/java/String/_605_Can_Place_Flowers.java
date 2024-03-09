package String;

import Recurison.Fibonacci;

public class _605_Can_Place_Flowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
//
        int length = flowerbed.length;
// Case 1 :  if length == 1 index 0 = 0 Special
        if (length == 1) {
            if (flowerbed[0] == 0) {
                n--;
                return n <= 0 ? true : false;
            }
        }

//case overview

        for (int i = 0; i < length; i++) {

//            case 2   with i = 0 begin = 0
            if (i == 0) {
                if (flowerbed[0] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
                // case3   with i = last index
            } else if (i == length - 1) {
                if (i - 1 >= 0 && flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }

//                cas4
            } else {
                if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }

            if (n <= 0) {
                return true;
            }
        }


        return false;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}
