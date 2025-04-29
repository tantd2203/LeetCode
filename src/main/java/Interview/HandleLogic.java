package Interview;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.TreeMap;

public class HandleLogic {
    public static void main(String[] args) {

        LocalDate onlineDT = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String result = "Value :  ";

        TreeMap<String, String> map = new TreeMap<>();
        map.put(onlineDT.plusDays(1).format(formatter), "30");
        map.put(onlineDT.plusDays(6).format(formatter), "36");
        map.put(onlineDT.plusDays(2).format(formatter), "32");
        map.put(onlineDT.plusDays(7).format(formatter), "39");


        for (int i = 0; i <= 7; i++) {
            String currentDate = onlineDT.plusDays(i).format(formatter);
            if (map.containsKey(currentDate)) {
                result = result + i;
            }
            switch (i) {
                case 0:
                    System.out.printf(result);
                    break;
                case 1:
                    System.out.printf(result);
                    break;
                case 2:
                    System.out.printf(result);
                    break;
                case 3:
                    System.out.printf(result);
                    break;
                case 4:
                    System.out.printf(result);
                    break;
                case 5:
                    System.out.printf(result);
                    break;
                case 6:
                    System.out.printf(result);
                    break;
                case 7:
                    System.out.printf(result);
                    break;
                    default:
            }
        }


    }


// Bài toán :  Chúng ta có 1 cái map <String,String> Key : Date, Value: Number , Ngày bắt đầu =  OnlineDT

// Sample : 12:2,15:9,19:1
//
}

