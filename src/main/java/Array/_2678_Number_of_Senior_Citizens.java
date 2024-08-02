package Array;


public class _2678_Number_of_Senior_Citizens {
    public static int countSeniors(String[] details) {
        int count = 0;
        for (String s : details) {
            String ageStr = s.substring(11, 13);
            if (Integer.parseInt(ageStr) >60) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Example test cases
        String[] testCase1 = {
                "1234567890A6210", // Age 62, senior
                "1234567890B5910", // Age 59, not senior
                "1234567890C6510", // Age 65, senior
                "1234567890D7012"  // Age 70, senior
        };


        // Running test cases
        System.out.println(countSeniors(testCase1));

    }
}
