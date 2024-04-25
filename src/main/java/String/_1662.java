package String;

public class _1662 {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String a  : word1){
            sb1.append(a);
        }
        for (String a  : word2){
            sb2.append(a);
        }

        return  sb2.toString().equals(sb1.toString());
    }
    public static void main(String[] args) {
       String [] word1 = {"ab", "c"}, word2 = {"a", "bc"};
    }
}
