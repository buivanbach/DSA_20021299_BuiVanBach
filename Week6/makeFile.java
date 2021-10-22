package Week6;

import edu.princeton.cs.algs4.Out;
import edu.princeton.cs.algs4.SeparateChainingHashST;

import java.util.Scanner;

public class makeFile {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String x = sc.next();
        Out out = new Out("D:\\DEV\\LibAndTestCase\\algs4-data\\"+x+"oneValue.txt");
        int []a = new int[n];
        for(int i = 0 ;i<n;i++){
            out.println(10);
        }
    }
}
