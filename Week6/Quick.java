package Week6;

import edu.princeton.cs.algs4.*;

import java.util.Scanner;

public class Quick {

    // This class should not be instantiated.
    private Quick() { }

    public static void sort(int[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    // quicksort the subarray from a[lo] to a[hi]
    private static void sort(int[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    // partition the subarray a[lo..hi] so that a[lo..j-1] <= a[j] <= a[j+1..hi]
    // and return the index j.
    private static int partition(int[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        int v = a[lo];
        while (true) {

            // find item on lo to swap
            while (less(a[++i], v)) {
                if (i == hi) break;
            }

            // find item on hi to swap
            while (less(v, a[--j])) {
                if (j == lo) break;      // redundant since a[lo] acts as sentinel
            }

            // check if pointers cross
            if (i >= j) break;

            exch(a, i, j);
        }

        // put partitioning item v at a[j]
        exch(a, lo, j);

        // now, a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
        return j;
    }

    private static boolean less(int v, int w) {
        if (v == w) return false;   // optimization when reference equals
        return v<w;
    }

    // exchange a[i] and a[j]
    private static void exch(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    // print array to standard output
    private static void show(int[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }
    }
    // test voi du lieu algs4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
//        In in = new In("D:\\DEV\\LibAndTestCase\\algs4-data\\"+x+"Kints.txt"); // tạo luồng đọc từ file
//        In in = new In("D:\\DEV\\LibAndTestCase\\algs4-data\\"+x+"Random.txt"); // tạo luồng đọc từ file
//        In in = new In("D:\\DEV\\LibAndTestCase\\algs4-data\\"+x+"Sorted.txt"); // tạo luồng đọc từ file
//        In in = new In("D:\\DEV\\LibAndTestCase\\algs4-data\\"+x+"Reverse.txt"); // tạo luồng đọc từ
        In in = new In("D:\\DEV\\LibAndTestCase\\algs4-data\\"+x+"oneValue.txt"); // tạo luồng đọc từ file

        int[] a = in.readAllInts();  // đọc toàn bộ file vào mảng a
        long start = System.currentTimeMillis();
        Quick.sort(a);
        long end = System.currentTimeMillis();  // thời gian chạy bằng end - start
        System.out.println(end-start);

    }


}