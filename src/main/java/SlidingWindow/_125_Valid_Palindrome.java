package SlidingWindow;

public class _125_Valid_Palindrome {
    public boolean isPalindrome(String s) {
        String palindrome = s.toLowerCase().trim();
        StringBuilder builder = new StringBuilder();
        for (char c : palindrome.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                builder.append(c);
            }
        }
        int l = 0;
        int r = builder.length() - 1;

        while (r >= l) {
            if (builder.charAt(l) != builder.charAt(r)) {
                return false;
            }
            r--;
            l++;
        }

        return true;
    }
}
