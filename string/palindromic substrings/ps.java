import java.util.*;

public class ps {

    public static Scanner scn = new Scanner(System.in);

    public static boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;

            }
            i++;
            j--;
        }

        return true;

    }

    public static void solution(String s) {
        int n = s.length();

        for(int i=0; i<n;i++)
        {
             for(int j=i; j<n;j++)
            {
                String str = s.substring(i, j+1);
                if (isPalindrome(str))
                {
                    System.out.println(str);
                }
            }
        
        }

    public static void main(String[] args) {
        String str = scn.next();
        solution(str);
    }

}
