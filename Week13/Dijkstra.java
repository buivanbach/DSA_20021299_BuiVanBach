package Week13;

import java.util.*;

public class Dijkstra {
    static class Cost implements Comparable<Cost> {
        public int r, v;

        public Cost(int vertex, int cost) {
            r = cost;
            v = vertex;
        }

        @Override
        public int compareTo(Cost c) {
            if (r < c.r) return -1;
            if (r > c.r) return 1;
            return 0;
        }

        public String toString() {
            return "(" + r + " , " + v + ")";
        }

    }

    public static List<Integer> shortestReach(int n, List<List<Integer>> edges, int s) {
        // Write your code here
        List<Integer> disTo = new ArrayList<>();
        for (int i = 0; i <= n; i++) disTo.add(i, 0);
        boolean[] marked = new boolean[n + 1];
        for (int i = 0; i < n + 1; i++) marked[i] = false;
        List<List<Cost>> listEdges = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            listEdges.add(i, new ArrayList<>());
        }

        for (int i = 0; i < edges.size(); i++) {
            listEdges.get(edges.get(i).get(0)).add(new Cost(edges.get(i).get(1), edges.get(i).get(2)));
            listEdges.get(edges.get(i).get(1)).add(new Cost(edges.get(i).get(0), edges.get(i).get(2)));
        }
        Queue<Cost> pq = new PriorityQueue();
        pq.add(new Cost(s, 0));
        while (pq.size() > 0) {
            Cost temp = pq.poll();
            int cur = temp.v;
            int cost = temp.r;
            if (marked[cur]) {
                continue;
            }
            marked[cur] = true;
            disTo.set(cur, cost);
            for (Cost i : listEdges.get(cur)) {
                pq.add(new Cost(i.v, i.r + cost));
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < disTo.size();i++){
            if(i == 0||i==s){
                continue;
            }
            if(disTo.get(i)==0){
                ans.add(-1);
            }
            else ans.add(disTo.get(i));
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int k = 0; k < test; k++) {
            int n = sc.nextInt();
            int edges = sc.nextInt();
            List<List<Integer>> edge = new ArrayList<>();
            for (int i = 0; i < edges; i++) {
                List<Integer> temp = new ArrayList<>();
                for (int j = 0; j < 3; j++) temp.add(sc.nextInt());
                edge.add(i, temp);
            }
            int start = sc.nextInt();
            for (int i : shortestReach(n, edge, start)) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
