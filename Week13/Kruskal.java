package Week13;

import edu.princeton.cs.algs4.In;

import java.util.*;

public class Kruskal {
    public static int indexMinList(List<Integer> gWeight) {
        int min = 0;
        for (int i = 1; i < gWeight.size(); i++) {
            if (gWeight.get(min) > gWeight.get(i)) {
                min = i;
            }
        }
        return min;
    }

    public static int kruskals(int gNodes, List<Integer> gFrom, List<Integer> gTo, List<Integer> gWeight) {
        int shortestValue = 0;
        boolean[] marked = new boolean[gNodes + 1];
        int count = gNodes - 1;
        while (count > 0) {
            int min = indexMinList(gWeight);

            int cost = gWeight.remove(min);
            int a = gFrom.remove(min);
            int b = gTo.remove(min);
            if (marked[a] && marked[b]) {
                continue;
            }
            shortestValue += cost;
            marked[a] = true;
            marked[b] = true;
            count--;
        }
        return shortestValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gNodes = sc.nextInt();
        int edges = sc.nextInt();
        List<Integer> gFroms = new ArrayList<>();
        List<Integer> gTos = new ArrayList<>();
        List<Integer> gWeights = new ArrayList<>();
        for(int i = 0 ; i < edges;i++){
            gFroms.add(sc.nextInt());
            gTos.add(sc.nextInt());
            gWeights.add(sc.nextInt());
        }
        System.out.println(kruskals(gNodes,gFroms,gTos,gWeights));
    }
}
