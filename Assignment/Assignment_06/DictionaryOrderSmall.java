package Assignment.Assignment_06;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class DictionaryOrderSmall { 

/*     public static void Dictionary(String ques,String ans) {
        if(ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String s2 = ques.substring(i+1);
            String s1 = ques.substring(0, i);
            Dictionary(s1+s2, ans+ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Dictionary(str, "");
    } */


    public static void Dictionary(String ques,String ans, ArrayList<String> lst) {
        if(ques.length() == 0) {
            lst.add(ans);
            // System.out.println(ans);
            return;
        }
        
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String s2 = ques.substring(i+1);
            String s1 = ques.substring(0, i);
            Dictionary(s1+s2, ans+ch,lst);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> lst = new ArrayList<>();
        Dictionary(str, "",lst);
        // System.out.println(lst);
        Collections.sort(lst);
        System.out.println(lst);
        int idx = 0;
        for (int i = 0; i < lst.size(); i++) {
            if(lst.get(i).equals(str)) {
                idx = i;
                break;
            }
        }
        for (int i = idx+1; i < lst.size(); i++) {
            // if(lst.get(i).equals(str)) {
            //     break;
            // }
            // System.out.print(lst.get(i)+" ");
            // if(lst.get(i).compareTo(str) < 0) {
            //     System.out.println(lst.get(i));
            // } else {
            //     break;
            // }
            System.out.println(lst.get(i));
        }
        sc.close();
    }
}
