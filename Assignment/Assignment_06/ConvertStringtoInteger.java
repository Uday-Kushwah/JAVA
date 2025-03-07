package Assignment.Assignment_06;

import java.util.Scanner;

public class ConvertStringtoInteger {

    public static int Convert_String_to_Int(String ques, int ans, int i) {
        if(i == ques.length()) {
            return ans;
        }
        char ch = ques.charAt(i);
        int num = ch-'0';
        return Convert_String_to_Int(ques, ans*10+num,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Convert_String_to_Int(s, 0,0));
        sc.close();
    }
}
