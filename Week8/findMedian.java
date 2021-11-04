package Week8;

import java.util.*;

public class findMedian {
    public static List<Double> runningMedian(List<Integer> a) {
        List<Double> ans = new ArrayList<>();
        int N = a.size();
        double median = 0;
        Queue maxPQ = new PriorityQueue(N / 2 + 1, Collections.reverseOrder());
        Queue minPQ = new PriorityQueue(N / 2 + 1);
        for (int i = 1; i <= N; i++) {
            int x = a.get(i-1);
            if (i == 1) {
                maxPQ.add(x);
                median = (double) x;
            }
            else if(i % 2 == 1){
                if(x>median){
                    minPQ.add(x);
                    median =(double) ((int) minPQ.peek());
                }
                else {
                    maxPQ.add(x);
                    median =(double) ((int) maxPQ.peek());
                }
            }
            else if(i % 2 == 0){
                if(x< median){
                    if(maxPQ.size()>minPQ.size()) {
                        minPQ.add(maxPQ.poll());
                        maxPQ.add(x);
                    }
                    else maxPQ.add(x);
                }
                else{
                    if(minPQ.size()>maxPQ.size()){
                        maxPQ.add(minPQ.poll());
                        minPQ.add(x);
                    }
                    else minPQ.add(x);
                }
                median = (double) ((int)maxPQ.peek()+(int) minPQ.peek())/2;
            }
            ans.add(median);
        }
        return ans;
    }

    public static void main(String[] args) {
    }
}
