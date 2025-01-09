package Interview;

import java.util.LinkedList;
import java.util.List;

public class removeDuplicates {
    public static void removeDuplicates(LinkedList<Integer> list) {
        LinkedList<Integer> checkVar = new LinkedList<>();

        int flag = 0;
        while (flag < list.size()) {
            int numberCurrent = list.get(flag);

            if (checkVar.contains(list.get(flag))) {

                list.remove(flag);
            } else {

                checkVar.add(numberCurrent);
                flag++;
            }


        }


    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(3);

        System.out.println("Danh sách ban đầu: " + list);

        removeDuplicates(list);

        System.out.println("Danh sách sau khi xóa các phần tử trùng lặp: " + list);
    }

}
