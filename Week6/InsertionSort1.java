package Week6;

import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSort1 {
    public static void printArr(int n, List<Integer> arr){
        for(int i = 0 ; i < n;i++){
            System.out.print(arr.get(i)+" ");

        }
        System.out.println();
    }
    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        int x = arr.get(n-1);
        int j = n - 2;
        while(true){
            if(j< 0 ){
                arr.set(j+1,x);
                printArr(n,arr);
                break;
            }
            else if(arr.get(j)>x){
                arr.set(j+1,arr.get(j));
                j--;
            }
            else{
                arr.set(j+1,x);
                printArr(n,arr);
                break;
            }
            printArr(n,arr);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0 ; i<n;i++){
            arr.add(sc.nextInt());
        }
        insertionSort1(n,arr);
    }
}
