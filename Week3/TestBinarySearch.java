package Week3;

import java.util.Arrays;
import java.util.Random;

public class TestBinarySearch {
    public static int binarySearch(int[] a, int number){
        int left = 0;
        int right = a.length - 1;
        int mid = 0;
        while(left<=right){
            mid = left + ( right - left ) / 2 ;
            if(a[mid] == number) return mid;
            else if (a[mid] > number) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }

    public static void main(String [] args){
        Random rand = new Random();
        int [] a = new int[100];
        for(int i = 0 ;i < 100 ; i++ ) a[i] = rand.nextInt(1000);
        Arrays.sort(a);
        System.out.println(binarySearch(a,4));
    }
}
