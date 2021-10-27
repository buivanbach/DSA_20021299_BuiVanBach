package Week7;

import java.util.ArrayList;
import java.util.List;

public class Bai2 {
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < 100; i++) ans.add(0);
        for (int i = 0; i < arr.size(); i++) {
            int x = arr.get(i);
            ans.set(x, ans.get(x) + 1);
        }
        return ans;
    }
}
