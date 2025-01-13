package Matrix;

public class testMatrix {
    public static void main(String[] args) {

            // Khởi tạo mảng hai chiều
            int[][] array = {
                    {3, 1, 0, 7},
                    {2, 5, 10, 3},
                    {3, 7, 4, 1},
                    {10, 2, 0, 3}
            };

            // Duyệt qua từng hàng
            for (int i = 0; i < array.length; i++) {
                int maxVal = array[i][0]; // Giả sử phần tử đầu tiên là lớn nhất
                for (int j = 1; j < array[i].length; j++) {
                    if (array[i][j] > maxVal) {
                        maxVal = array[i][j]; // Cập nhật giá trị lớn nhất
                    }
                }
                System.out.println("Giá trị lớn nhất của hàng " + (i + 1) + " là: " + maxVal);
            }


    }
}
