package Week5;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Scanner;

public class SelectionSort {
    public static void ex(int[] a, int i, int j) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }

    public static void SecSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i ;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            if (a[i] > a[min]) {
                ex(a, i, min);
            }
        }
    }

    public static void printArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) StdRandom.uniform(i+1);
        }
        printArr(a);
        long start = System.currentTimeMillis();

        SecSort(a);
        long end = System.currentTimeMillis();
        printArr(a);
        System.out.println("Start "+start+", End " + end );
    }
}
