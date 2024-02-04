package Sort;

import java.util.*;

public class _414 {

    public  static int thirdMax(int [] nums) {
        int max = 0;
        Arrays.sort(nums);
        List<Integer>  numList = new ArrayList<>();
        for (int number : nums){
            if (!numList.contains(number)){
                numList.add(number);
            }
        }
        if (numList.size() >= 3){
            max =    numList.get(numList.size()-3);
            return max;
        }else {
            max =    numList.get(numList.size()-1);
            return max;
        }

    }

    public static void main(String[] args) {
        int[] array = {1,2};
        System.out.println(  thirdMax(array));


    }


}
