package Sort;

import java.util.*;

public class _414_Third_Maximum_Number {

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

//
    public static void main(String[] args) {
        int[] array = {1,2};
        System.out.println(  thirdMax(array));


    }


}
/*
* 414. Third Maximum Number
Solved
Easy
Topics
Companies
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.



Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.
Example 3:

Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.
 */