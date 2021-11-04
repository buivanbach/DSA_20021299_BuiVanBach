package Week8;

import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> A = new ArrayList<>();
        for (int i = 1; i <= n; i++) A.add(sc.nextInt());
        Queue pqueue = new PriorityQueue(A.size());
        for (int i = 0; i < A.size(); i++) {
            pqueue.add(A.get(i));
        }
        System.out.println(pqueue.remove());
    }
}
