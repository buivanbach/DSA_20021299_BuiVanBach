package Week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSort2 {
    public static void insertionSort2(int n, List<Integer> arr) {
        // Write your code here
        for(int i = 1 ; i < arr.size(); i++){
            int j = i - 1;
            int cur = i;
            while(arr.get(j)>arr.get(cur)&&cur>0){
                int temp = arr.get(cur);
                arr.set(cur, arr.get(j));
                arr.set(j,temp);
                j--;
                if(j<0) break;
                cur--;
            }
            for(int k = 0 ; k < arr.size(); k++ ){
                System.out.print(arr.get(k)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        for(int i = 0 ;i<8;i++){
            arr.add(sc.nextInt());
        }
        insertionSort2(8,arr);
    }
}
