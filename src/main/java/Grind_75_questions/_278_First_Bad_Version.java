package Grind_75_questions;

public class _278_First_Bad_Version {
    public boolean isBadVersion(int version) {
        // For example, let's assume version 4 is the first bad version.
        int firstBadVersion = 4; // You can modify this as needed for testing.
        return version >= firstBadVersion;
    }

    public int firstBadVersion(int n) {

        int l = 1;  // Start from 1 since version numbers typically start from 1
        int r = n;

        while (l < r) {
            // To avoid overflow, use the following method to calculate mid
            int mid = l + (r - l) / 2;
            if (isBadVersion(mid)) {
                r = mid;  // The first bad version is in the left half
            } else {
                l = mid + 1;  // The first bad version is in the right half
            }
        }
        return l;  // When l == r, it points to the first bad version
    }


    public static void main(String[] args) {

    }
}
