package PrefixSum;

public class _1732_Find_the_Highest_Altitude {
    public int largestAltitude(int[] gain) {
        int highestPoint = 0;
        int currentAltitute = 0;
        for (int i : gain) {
            currentAltitute += i;
            highestPoint = Math.max(highestPoint, currentAltitute);
        }
        return highestPoint;
    }
}
