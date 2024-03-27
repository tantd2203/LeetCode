package TwoPointers;


public class _125_Valid_Palindrome {


    public boolean isPalindrome(String s) {

        char[] chars = s.toLowerCase().toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (Character c : chars) {
            if (Character.isLetterOrDigit(c)) {
                stringBuilder.append(c);
            }
        }
        int l = 0;
        int r = stringBuilder.length() - 1;
        while (l < r) {

            if (stringBuilder.charAt(l) == stringBuilder.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}
