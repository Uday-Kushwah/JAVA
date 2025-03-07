package Assignment.Assignment_06;

import java.util.Scanner;

public class ReplaceAll_Pie {

    public static void Replace(String s, String ans, int i) {
        if(s.length() == i) {
            System.out.println(ans);
            return;
        }

        if(i < s.length()-1 && s.charAt(i) == 'p' && s.charAt(i+1) == 'i') {
            ans += 3.14;
            i+=1;
        } else {
            ans += s.charAt(i);
        }
        
        Replace(s, ans, i+1);

    }
    public static void main(String[] args) {

        // String s = "xpix";
        // String s = "xabpixx3.15x";
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            Replace(s, "", 0);
        }
        sc.close();
    }
}
