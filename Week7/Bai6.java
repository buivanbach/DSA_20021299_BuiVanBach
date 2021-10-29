package Week7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai6 {
    public static void printArray(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

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
        printArray(arr);
        return i;
    }

    public static void quickSort(List<Integer> arr, int low, int high) {
        if (high <= low) return;
        int j = partition(arr, low, high);
        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            arr.add(sc.nextInt());
        }
        quickSort(arr,0,arr.size()-1);
    }
}
