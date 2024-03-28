package TwoPointers;

public class _11_Container_With_Most_Water {

    public static int maxArea(int[] height) {
        int r = height.length - 1;
        int l = 0;

        int max = 0;
        while (l < r) {

            int minHeight = Math.min(height[l], height[r]);

            int area = minHeight * (r - l);
            max = Math.max(area, max);

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }

        }

        return max;


    }

    public static void main(String[] args) {

        int[] height = {2, 3, 4, 5, 18, 17, 6};

        System.out.println(maxArea(height));

    }
}
