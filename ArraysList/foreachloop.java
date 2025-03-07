package ArraysList;

import java.util.ArrayList;
import java.util.Collections;

public class foreachloop {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);    //TC : constant
        list.add(10);
        list.add(89);
        list.add(40);
        // System.out.println(list);


        for(int v:list){
            System.out.print(v+" ");
        }
        System.out.println();
        System.out.println("======================");
        int[] arr = {1,4,5,7,9};
        for (int i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        
        Collections.sort(list);
        System.out.println(list);

        System.out.println();

        Collections.reverse(list);
        System.out.println(list);
    }
}