package Week7;

import javax.swing.*;
import java.util.List;

public class Bai1 {
    public static int binarySearch(int v, List<Integer> arr) {
        int l = 0;
        int r = arr.size();
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == v) {
                return mid;
            } else if (arr.get(mid) < v) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

}
