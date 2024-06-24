package String;

public class _387_First_Unique_Character_in_a_String {

    public static int firstUniqChar(String s) {
    char [] arr=  s.toCharArray();
    int [] count = new int [125]; // CODE ASCII

        for (int i = 0; i < arr.length; i++) {
            char  c = arr[i]; // tách ra chữ cái
            int index = (int)c; // ép thành int
            count[index]++; // tăng giá trị index ví dụ index tại vị trí 97 thì công 1 đơn vị
        }
        for (int i = 0; i < arr.length; i++) {
            char  c = arr[i];
            int index = (int)c;
            if (count[index] == 1){
                return  i;
            }
        }

        return  -1;
    }

    public static void main(String[] args) {
        String s = "achumeac";
        System.out.println( firstUniqChar(s));

    }
}
