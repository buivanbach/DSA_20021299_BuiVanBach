package Week11;

import javax.swing.*;
import java.util.*;

public class bai5MissingNumber {
    //    //c1
//    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
//        Hashtable<Integer, Integer> a = new Hashtable<>();
//        List<Integer> ans = new ArrayList<>();
//        for (Integer i : arr) {
//            if (a.containsKey(i)) a.put(i, a.get(i)+1);
//            else a.put(i, 1);
//        }
//        for (Integer i : brr) {
//            if (a.containsKey(i)) {
//                a.put(i, a.get(i) - 1);
//                if (a.get(i) == -1) {
//                    ans.add(i);
//                }
//            } else {
//                a.put(i, -1);
//                ans.add(i);
//            }
//        }
//        Collections.sort(ans);
//        return ans;
//    }


    //c2
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        List<Integer> ans = new ArrayList<>();
        Collections.sort(arr);
        Collections.sort(brr);
        int i, j;
        for (i = 0, j = 0; i < arr.size() && j < brr.size(); i++, j++) {
            if (!arr.get(i).equals(brr.get(j))) {
                if (ans.size() != 0) {
                    if (!brr.get(j).equals(ans.get(ans.size() - 1)))
                        ans.add(brr.get(j));
                } else {
                    ans.add(brr.get(j));
                }
                i--;
            }
        }
        if(j< brr.size()) ans.add(brr.get(brr.size()-1));
        return ans;
    }
    //c3
//    public static List<Integer> countingSort(List<Integer> arr,int minb) {
//        // Write your code here
//        int min = minb;
//        List<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < 100; i++) ans.add(0);
//        for (int i = 0; i < arr.size(); i++) {
//            int x = arr.get(i);
//            ans.set(x-min, ans.get(x-min) + 1);
//        }
//        return ans;
//    }
//    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
//        int min = Collections.min(brr);
//        List<Integer> ans = new ArrayList<>();
//        List<Integer> a = countingSort(arr,min);
//        List<Integer> b = countingSort(brr,min);
//        for(int i = 0 ;i < a.size();i++){
//            if(!a.get(i).equals(b.get(i))){
//                ans.add(i+min);
//            }
//        }
//        return ans;
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) a.add(sc.nextInt());
        int m = sc.nextInt();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < m; i++) b.add(sc.nextInt());
        System.out.println(missingNumbers(a, b));
    }
}
