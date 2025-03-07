package ArraysList;

import java.util.ArrayList;

public class Max_ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i,i+11);
        }
        System.out.println(list);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max,list.get(i));
        }
        System.out.println(max);
    }
}
