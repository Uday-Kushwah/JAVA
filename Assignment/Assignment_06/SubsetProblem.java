package Assignment.Assignment_06;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetProblem {

    /* public static void Subset(List<List<Integer>> ans,int[] arr, int currentSum, int target, List<Integer> lst, int idx) {
        if(currentSum == target) {
            ans.add(new ArrayList<>(lst));
            // System.out.println(lst);
            
            return;
        }
        if(currentSum > target) {
            return;
        }
        for (int i = idx; i < arr.length; i++) {  
            if (currentSum < target) {
                lst.add(arr[i]);
                Subset(ans,arr, currentSum+arr[i], target, lst,i+1);
                lst.remove(lst.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // int target = sc.nextInt();

        int n = 3;
        int[] arr = {1,3,5,3,2,4,6,7,2,3};
        int target = 10;
        List<Integer> lst = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Subset(ans,arr, 0, target,lst,0);
        System.out.println(ans);

    } */


   /*  static int count_subset = 0;
    public static void Subset(int[] arr, int currentSum, int target,String ans, int idx) {
        if(currentSum == target) {
            System.out.print(ans+" ");
            count_subset++;
            return ;
        }
        if(currentSum > target) {
            return ;
        }
        for (int i = idx; i < arr.length; i++) {  
            if (currentSum < target) {
               Subset(arr, currentSum+arr[i], target, ans+arr[i]+" ",i+1);
            }
        }
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // int target = sc.nextInt();

        int n = 3;
        int[] arr = {1,4,6,7,2,3};
        int target = 10;
       
        Subset(arr, 0, target,"",0);
        System.out.println();
        System.out.println(count_subset);
    } */



    public static int Subset(int[] arr, int currentSum, int target,String ans, int idx) {
        if(currentSum == target) {
            System.out.print(ans+" ");
            
            return 1;
        }
        if(currentSum > target) {
            return 0;
        }
        int count = 0;
        for (int i = idx; i < arr.length; i++) {  
            if (currentSum < target) {
               count += Subset(arr, currentSum+arr[i], target, ans+arr[i]+" ",i+1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // int target = sc.nextInt();

        int n = 3;
        int[] arr = {1,4,6,7,2,3};
        int target = 10;       
        System.out.println(Subset(arr, 0, target,"",0));
    }
}
