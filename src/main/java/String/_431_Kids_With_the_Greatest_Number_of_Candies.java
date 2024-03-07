package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _431_Kids_With_the_Greatest_Number_of_Candies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();

        int max = Arrays.stream(candies).max().orElseThrow();

        for (int i : candies) {
            if ((i + extraCandies) >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);

        result.stream().forEach(System.out::println);
    }
}
