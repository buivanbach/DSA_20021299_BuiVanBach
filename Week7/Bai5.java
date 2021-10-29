package Week7;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.util.ArrayList;
import java.util.List;

public class Bai5 {
    public static List<Integer> quickSort(List<Integer> arr) {
        // Write your code here
        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        int x = arr.get(0);
        equal.add(arr.get(0));
        List<Integer> right = new ArrayList<>();
        for(int i = 1 ; i < arr.size();i++){
            if(arr.get(i)==x) equal.add(arr.get(i));
            else if (arr.get(i)>x) right.add(arr.get(i));
            else left.add(arr.get(i));
        }
       List<Integer> res = new ArrayList<>();
        res.addAll(left);
        res.addAll(equal);
        res.addAll(right);
        return res;
    }
    public static void main(String [] args){
        List<Integer> res = new ArrayList<>();
        int x = StdIn.readInt();
        for(int i = 0; i< x; i++){
            res.add(StdIn.readInt());
        }
        res = quickSort(res);
        for(int i = 0; i< x; i++){
           System.out.print(res.get(i)+" ");
        }
    }
}
