package Assignment.Assignment_06;

import java.util.Scanner;

public class MappedString {
    static char[] Map = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public static void Partition(String ques, String ans) {
        if(ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 1; i <= ques.length(); i++) {
            String s = ques.substring(0,i);
            if(Integer.parseInt(s) < 26) {
                Partition(ques.substring(i), ans+Map[Integer.parseInt(s)-1]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = n+"";
        Partition(str, "");
        sc.close();
    }
}
