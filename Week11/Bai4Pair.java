package Week11;

import java.util.HashSet;
import java.util.List;

public class Bai4Pair {
    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0 ; i< arr.size();i++){
            hashSet.add(arr.get(i));
        }
        int count = 0;
        for(int i = 0;i<arr.size();i++){
            if(hashSet.contains(arr.get(i)+k)){
                count++;
            }
        }
        return count;
    }

}
