package Week6;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdArrayIO;

import java.util.Scanner;

public class InsertionSortBAC {
    public static void insertionSort(int[] A){
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > value){
                A[j + 1] = A[j];
                j = j - 1;
                A[j + 1] = value;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
//        In in = new In("D:\\DEV\\LibAndTestCase\\algs4-data\\"+x+"Kints.txt"); // tạo luồng đọc từ file
//        In in = new In("D:\\DEV\\LibAndTestCase\\algs4-data\\"+x+"Random.txt"); // tạo luồng đọc từ file
//        In in = new In("D:\\DEV\\LibAndTestCase\\algs4-data\\"+x+"Sorted.txt"); // tạo luồng đọc từ file
//        In in = new In("D:\\DEV\\LibAndTestCase\\algs4-data\\"+x+"Reverse.txt"); // tạo luồng đọc từ file
        In in = new In("D:\\DEV\\LibAndTestCase\\algs4-data\\"+x+"oneValue.txt"); // tạo luồng đọc từ file
        int[] a = in.readAllInts();  // đọc toàn bộ file vào mảng a
        long start = System.currentTimeMillis();
        insertionSort(a);
        long end = System.currentTimeMillis();  // thời gian chạy bằng end - start
        System.out.println(end-start);


    }
}
