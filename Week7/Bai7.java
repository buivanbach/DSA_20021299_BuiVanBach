package Week7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai7 {
    public static void swap(List<Integer> arr, int i, int j) {
        int temp = arr.get(j);
        arr.set(j, arr.get(i));
        arr.set(i, temp);
    }

    public static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(high);
        int i = low;
        for (int j = low; j <= high - 1; j++) {
            if (arr.get(j) <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, high);
       return i;
    }
    public static int findMedian1(List<Integer> arr,int low , int high) {
        int j = partition(arr,low,high);
        if(j == arr.size()/2) return j;
        else if( j > arr.size()/2) return findMedian1(arr,low,j-1);
        else return findMedian1(arr,j+1,high);
    }
    public static int findMedian(List<Integer> arr) {
        return arr.get(findMedian1(arr,0,arr.size()-1));
    }
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            arr.add(sc.nextInt());
        }
        System.out.println(findMedian(arr));
    }
}
