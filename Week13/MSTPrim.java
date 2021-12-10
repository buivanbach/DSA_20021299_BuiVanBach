package Week13;

import java.util.*;

public class MSTPrim {
    static class Cost implements Comparable<Cost> {
        public int r, v;

        public Cost(int cost, int vertex) {
            r = cost;
            v = vertex;
        }

        @Override
        public int compareTo(Cost c) {
            if (r < c.r) return -1;
            if (r > c.r) return 1;
            if (v < c.v) return -1;
            if (v > c.v) return 1;
            return 0;
        }

    }

    public static int prims(int n, List<List<Integer>> edges, int start) {
        int count = n;
        int cost = 0;
        boolean[] marked = new boolean[n+1];
        List<List<Cost>> listEdges = new ArrayList<>();
        for (int i = 0; i < n+1; i++) {
            listEdges.add(i, new ArrayList<>());
        }

        for (int i = 0; i < edges.size(); i++) {
            listEdges.get(edges.get(i).get(0)).add(new Cost(edges.get(i).get(2), edges.get(i).get(1)));
            listEdges.get(edges.get(i).get(1)).add(new Cost(edges.get(i).get(2), edges.get(i).get(0)));
        }
        Queue<Cost> pq = new PriorityQueue();
        marked[start] = true;
        for (int i = 0; i < listEdges.get(start).size(); i++) {
            pq.add(listEdges.get(start).get(i));
        }
        while (!pq.isEmpty()&&count>0) {
            Cost temp = pq.poll();
            if(marked[temp.v]) continue;
            cost += temp.r;
            count--;
            marked[temp.v] = true;
            for (Cost i : listEdges.get(temp.v)) {
                if (marked[i.v]) continue;
                pq.add(i);
            }

        }
        return cost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int edges = sc.nextInt();
        List<List<Integer>> edge = new ArrayList<>();
        for (int i = 0; i < edges; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < 3; j++) temp.add(sc.nextInt());
            edge.add(i, temp);
        }
        int start = sc.nextInt();
        System.out.println(prims(n, edge, start));
    }
}
