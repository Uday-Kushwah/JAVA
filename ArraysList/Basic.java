package ArraysList;

import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {       
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);    //TC : constant
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        //to get the length of arrayslist
        System.out.println(list.size());   

        //to add the element at a particular index
        list.add(1,90);   //TC : O(n)
        System.out.println(list);

        // give error
        // list.add(8,80);     // Index: 8, Size: 5
        // System.out.println(list);

        System.out.println("=======================================");

        //to get the element of aarraylist
        System.out.println(list.get(2));  //TC : O(1)

        //to remove the element of aarraylist
        System.out.println(list.remove(3));
        System.out.println(list);

        //to set the element of aarraylist
        list.set(3,56);
        System.out.println(list);
        

        //Loop 
        System.out.println("=======================================");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }


        
    }
}
