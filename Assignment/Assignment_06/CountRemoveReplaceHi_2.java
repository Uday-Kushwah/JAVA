package Assignment.Assignment_06;

import java.util.Scanner;

public class CountRemoveReplaceHi_2 {
    
    /* public static void Remove(String s, String ans, int i,int count_hi ) {
        if(s.length() == i) {
            System.out.println(count_hi);
            System.out.println(ans);
            return ;
        }
        if(i < s.length()-2 && s.charAt(i) == 'h' && s.charAt(i+1) == 'i' && s.charAt(i+2) != 't') {
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
        if(i < s.length()-2 && s.charAt(i) == 'h' && s.charAt(i+1) == 'i' && s.charAt(i+2) != 't') {
            Replace(s, ans+"bye", i+2);
        } else {
            Replace(s, ans+s.charAt(i), i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        String s = "abchihitfhi";
        Remove(s, "", 0,0);
        Replace(s, "", 0);
        sc.close();
    } */




    public static void Remove(String s, String ans, int i,int count_hi ) {
        if(s.length() == i) {
            if(ans.substring(ans.length()-2).equals("hi")) {
                System.out.println(count_hi+1);
                System.out.println(ans.substring(0,ans.length()-2));
            } else {
                System.out.println(count_hi);
                System.out.println(ans);
            }
            // System.out.println(ans);
            return ;
        }
        if(i < s.length()-2 && s.charAt(i) == 'h' && s.charAt(i+1) == 'i' && s.charAt(i+2) != 't') {
            Remove(s, ans, i+2,count_hi+1);
            count_hi++;
        } else {
            Remove(s, ans+s.charAt(i), i+1,count_hi);
        }
    }
  
    public static void Replace(String s, String ans, int i) {
        if(s.length() == i) {
            if(ans.substring(ans.length()-2).equals("hi")) {
                System.out.println(ans.substring(0,ans.length()-2)+"bye");
            } else {
                System.out.println(ans);
            }
            return;
        }
        if(i < s.length()-2 && s.charAt(i) == 'h' && s.charAt(i+1) == 'i' && s.charAt(i+2) != 't') {
            Replace(s, ans+"bye", i+2);
        } else {
            Replace(s, ans+s.charAt(i), i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        String s = "abchihitfhi";
        Remove(s, "", 0,0);
        Replace(s, "", 0);
        sc.close();
    }
}
