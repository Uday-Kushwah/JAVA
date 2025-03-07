package ArraysList;
import java.util.ArrayList;
public class Operation {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        //Length of Arraylist : size is method or function
        System.out.println(list1.size());           //4
        System.out.println(list1);                  //[1, 2, 3, 4]

        //contains Operation
        System.out.println(list1.contains(3));    //true
        System.out.println(!list1.contains(5));   //true

        //Get Operation
        System.out.println(list1.get(3));     //1
        // System.out.println(list1.get(7));        //IndexOutOfBoundsException:

        //Remove Operation
        System.out.println(list1.remove(2));  //3
        System.out.println(list1);                  //[1, 2, 4]

        //Set Operation : remove the previous ele and set element
        list1.set(0,10);
        System.out.println(list1);                  //[10, 2, 4]

        list1.add(1,100);   
        System.out.println(list1);                  //[10, 100, 2, 4]

        System.out.println();

        //Iteration over ArrayList
        for (int index = 0; index < list1.size(); index++) {
            System.out.print(list1.get(index)+" ");
        }
        System.out.println();

    }
}
