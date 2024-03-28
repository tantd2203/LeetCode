package TwoPointers;

public class _11_Container_With_Most_Water {

    public  static int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;

        while (r > l) {
            // Calculate the area using the shorter of the two vertical lines
            int minHeight = Math.min(height[l], height[r]);
            int area = minHeight * (r - l);

            // Update max if the calculated area is greater
            max = Math.max(max, area);

            // Move the pointers towards each other
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] height = {2,3,4,5,18,17,6};

        System.out.println(maxArea(height));

    }
}
