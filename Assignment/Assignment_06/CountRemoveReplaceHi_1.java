package Assignment.Assignment_06;

import java.util.Scanner;

public class CountRemoveReplaceHi_1 {


    public static void Remove(String s, String ans, int i,int count_hi ) {
        if(s.length() == i) {
            System.out.println(count_hi);
            System.out.println(ans);
            return ;
        }
        if(i < s.length()-1 && s.charAt(i) == 'h' && s.charAt(i+1) == 'i') {
            Remove(s, ans, i+2,count_hi+1);
            count_hi++;
        } else {
            Remove(s, ans+s.charAt(i), i+1,count_hi);
        }
    }
  
    public static void Replace(String s, String ans, int i) {
        if(s.length() == i) {
            System.out.println(ans);
            return;
        }
        if(i < s.length()-1 && s.charAt(i) == 'h' && s.charAt(i+1) == 'i') {
            Replace(s, ans+"bye", i+2);
        } else {
            Replace(s, ans+s.charAt(i), i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        String s = "abchibhhi";
        Remove(s, "", 0,0);
        Replace(s, "", 0);
        sc.close();
    }
}
