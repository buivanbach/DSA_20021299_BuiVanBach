package Week11;

import java.util.*;

public class Bai6Findmedian {
    public static List<Double> runningMedian(List<Integer> a) {
        List<Double> ans = new ArrayList<>();
        TreeSet<Double> treeSet = new TreeSet<>();
        double median = 0;
        double temp = 0;
        for (int i = 0; i < a.size(); i++) {
                double x = (double) a.get(i);
                treeSet.add(x);
                if(treeSet.size()==1){
                    median = x;
                    temp = x;
                }
                else if(treeSet.size()%2==1&&treeSet.size()!=1){
                    if(x>median){
                        temp = treeSet.higher(median);
                        median=temp;
                    }
                    else if(x < median){
                        temp = treeSet.lower(median);
                        median = temp ;
                    }
                    else {
                        temp = x;
                        median = temp;
                    }
                }
                else{
                    if(x>median){
                        median = (temp + treeSet.higher(median))/2;
                    }
                    else
                        median = (temp + treeSet.lower(median))/2;
                }
                ans.add(median);
            System.out.println(median);
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) {
            a.add(sc.nextInt());
        }
        System.out.println(runningMedian(a));
    }
}
