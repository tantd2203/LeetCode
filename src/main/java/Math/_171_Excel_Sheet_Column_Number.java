package Math;

public class _171_Excel_Sheet_Column_Number {
    public static int titleToNumber(String columnTitle) {
        int ans=0;
        for(int i=0;i<columnTitle.length();i++)
            ans= ans*26+columnTitle.charAt(i)-'A'+1;

        return ans;
    }

    public static void main(String[] args) {

        String s = "AA";
        System.out.println(titleToNumber(s));
    }
}
