package Week5;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectionSort {
    public static void ex(int[] a, int i, int j) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }

    public static void selectionSort(int[] a) {
        for (int i = 1; i < a.length-1; i++) {
            int min = i ;
            for (int j = i + 1; j < a.length-1; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            if (a[i] > a[min]) {
                ex(a, i, min);
            }
        }
    }

    public static void main(String[] args) {

        int n = StdIn.readInt();
        int [] arr = new int[n];
        for(int i = 0 ; i< n;i++){
            arr[i] = StdIn.readInt();
        }
        selectionSort(arr);
        for(int i = 0 ; i < n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
