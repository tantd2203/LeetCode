package HashTable;

import java.util.HashSet;

public class _202_Happy_Number {


    public static boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        while (hashSet.add(n)) {
            int result = 0;
            while (n != 0) {
                int digit = n % 10; // Lấy chữ số cuối cùng
                result += digit * digit; // Tính bình phương và cộng vào tổng
                n /= 10; // Loại bỏ chữ số cuối cùng đã được xử lý
            }
            if (result == 1) {
                return true;
            } else {
                n = result;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

}
