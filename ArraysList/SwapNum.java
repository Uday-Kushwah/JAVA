package ArraysList;

import java.util.ArrayList;

public class SwapNum {
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i,i+11);
        }
        System.out.println(list);

        int idx1 = 3;
        int idx2 = 5;
        int temp1 = list.get(idx1);
        int temp2 = list.get(idx2);
        list.set(idx2,temp1);
        list.set(idx1,temp2);
        System.out.println(list);
        
    }
}
