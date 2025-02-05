package String;

public class _1790_Check_if_One_String_Swap_Can_Make_Strings_Equal {

    public static boolean areAlmostEqual(String s1, String s2) {

        if (s1.equals(s2)) return true; // Hai chuỗi đã giống nhau

        int n = s1.length();
        int first = -1, second = -1;

        // Tìm các vị trí khác nhau giữa hai chuỗi
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    return false; // Nếu có hơn 2 vị trí khác nhau thì không thể hoán đổi 1 lần để bằng nhau
                }
            }
        }

        // Kiểm tra xem hoán đổi hai ký tự có làm chuỗi giống nhau không
        return (second != -1) && (s1.charAt(first) == s2.charAt(second)) && (s1.charAt(second) == s2.charAt(first));
    }

    public static void main(String[] args) {

        String s1 = "bank", s2 = "kanb";

        System.out.println(areAlmostEqual(s1, s2));
    }
}
