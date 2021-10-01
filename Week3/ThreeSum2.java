package Week3;

import edu.princeton.cs.algs4.In;

import java.util.Arrays;

public class ThreeSum2 {
    public static void tripletZeroSum(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length - 2; i++) {
            int l = i + 1;
            int r = a.length - 1;
            while (l < r) {
                if (a[i] + a[r] + a[l] == 0) {
                    count++;
                    l++;
                    r--;
                    System.out.println((a[i] + ", " + a[l] + " and " + a[r]));
                } else if (a[i] + a[r] + a[l] > 0) r--;
                else l++;
            }
        }
    }
    public static void main(String [] args){
        In in = new In(args[0]);
        int [] a = in.readAllInts();
        Arrays.sort(a);
        tripletZeroSum(a);
    }
}