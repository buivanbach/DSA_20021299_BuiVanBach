package PracticeCoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
    public static List<Integer> selectionSort(List<Integer> arr){
        for(int i = 1 ; i < arr.size()-1;i++){
            for(int j = i+1;j<arr.size()-1;j++){
                if(arr.get(i)>arr.get(j)){
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j,temp);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0 ; i< n;i++){
            arr.add(sc.nextInt());
        }
        arr = selectionSort(arr);
        for(int i = 0 ; i < n;i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
