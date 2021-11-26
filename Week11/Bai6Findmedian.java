package Week11;

import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Bai6Findmedian {
    public static List<Double> runningMedian(List<Integer> a) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        double median = 0;
        for (int i = 0; i < a.size(); i++) {
                int x = a.get(i);
                treeSet.add(x);
                if(treeSet.size()==1){
                    median = treeSet.pollFirst();
                }

        }
        return null;
    }
}
