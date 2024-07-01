package String;

public class _344_Reverse_String {
    public static void reverseString(char[] s) {

        int l = 0;
        int r = s.length - 1;

        while (l < r) {
            swap(s, l, r);
            l++;
            r--;
        }
    }

    static void swap(char[] s, int a, int b) {
        char temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(s);

    }
}
