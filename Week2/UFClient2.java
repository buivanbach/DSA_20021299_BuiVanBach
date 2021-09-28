package Week2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.UF;

import java.util.SortedMap;

public class UFClient2 {
    public static boolean checkAll(int n , UF uf){
        for(int i = 0 ; i<n-1;i++){
            if(uf.find(i)!=uf.find(i+1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        int pos = 1;
        int res = N -1;

        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.connected(p, q)) {
                uf.union(p, q);
                if(checkAll(N,uf)==true){
                    System.out.println(pos);
                    break;
                }
            }
            pos++;
        }
        if(checkAll(N,uf)==false){
            StdOut.println("FAILED");
        }
    }
}