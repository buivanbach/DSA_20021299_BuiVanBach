package Week6;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

public class Merge {
    // stably merge a[lo .. mid] with a[mid+1 ..hi] using aux[lo .. hi]
    private static void merge(int[] a, int[] aux, int lo, int mid, int hi) {

        // copy to aux[]
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        // merge back to a[]
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if      (i > mid)              a[k] = aux[j++];
            else if (j > hi)               a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else                           a[k] = aux[i++];
        }
    }

    // mergesort a[lo..hi] using auxiliary array aux[lo..hi]
    private static void sort(int[] a, int[] aux, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }

    /**
     * Rearranges the array in ascending order, using the natural order.
     * @param a the array to be sorted
     */
    public static void sort(int[] a) {
        int[] aux = new int[a.length];
        sort(a, aux, 0, a.length-1);
    }
    // is v < w ?
    private static boolean less(int v, int w) {
        return v<w;
    }
    // print array to standard output
    private static void show(int[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }
    }

    /**
     * Reads in a sequence of strings from standard input; mergesorts them;
     * and prints them to standard output in ascending order.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
//        In in = new In("D:\\DEV\\LibAndTestCase\\algs4-data\\"+x+"Kints.txt"); // tạo luồng đọc từ file
//        In in = new In("D:\\DEV\\LibAndTestCase\\algs4-data\\"+x+"Random.txt"); // tạo luồng đọc từ file
//        In in = new In("D:\\DEV\\LibAndTestCase\\algs4-data\\"+x+"Sorted.txt"); // tạo luồng đọc từ file
//        In in = new In("D:\\DEV\\LibAndTestCase\\algs4-data\\"+x+"Reverse.txt"); // tạo luồng đọc từ file
        In in = new In("D:\\DEV\\LibAndTestCase\\algs4-data\\"+x+"oneValue.txt"); // tạo luồng đọc từ file

        int[] a = in.readAllInts();  // đọc toàn bộ file vào mảng a
        long start = System.currentTimeMillis();
        Merge.sort(a);
        long end = System.currentTimeMillis();  // thời gian chạy bằng end - start
        System.out.println(end-start);

    }
}