package Week8;

import edu.princeton.cs.algs4.In;

import java.util.*;

public class JessieAndCookies {
    public static int cookies(int k, List<Integer> A) {
        // Write your code here
        Queue pqueue = new PriorityQueue(A.size());
        for (int i = 0; i < A.size(); i++) {
            pqueue.add(A.get(i));
        }
        int count = 0;
        while (!pqueue.isEmpty() ) {
            int temp = (int)pqueue.remove();
            if(temp<k&&pqueue.isEmpty()) {
                count = -1;
                break;
            }

            if(temp >= k ) {
                pqueue.add(temp);
                break;
            }
            else {
                pqueue.add((int) pqueue.remove() * 2 + temp);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 1; i <= n; i++) A.add(sc.nextInt());
        System.out.println(cookies(k, A));
    }
}
