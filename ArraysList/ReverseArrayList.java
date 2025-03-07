package ArraysList;
import java.util.ArrayList;
public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i,i+11);
        }
        System.out.println(list);

        for (int i = list.size()-1; i >=0; i--) {
            System.out.print(list.get(i)+" ");
        }

        
    }
}
