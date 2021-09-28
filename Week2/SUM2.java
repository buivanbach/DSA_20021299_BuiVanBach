package Week2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
public class SUM2 {
    public static void main(String [] args){
        In in  = new In("D:\\DEV\\LibAndTestCase\\algs4-data\\8Kints.txt");
        int[] a = in.readAllInts();
        Arrays.sort(a);
        int res ; int left  ; int right ;
        for(int i = 0 ;i< a.length;i++){
            res = -a[i];
            left = i+1;
            right = a.length - 1;
            int flag = -1;
            while(left<=right){
                int mid = left+ (right - left )/2;
                if(a[mid] == res){
                    flag = 1;
                    break;
                }
                else if(a[mid] > res ) right =  mid-1;
                else left = mid + 1;
            }
            if(flag == 1){
                StdOut.println("(" + a[i] + "," + res + ")");
            }
        }
    }
}
