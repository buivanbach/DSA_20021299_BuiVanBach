package Week2;

import edu.princeton.cs.algs4.StdOut;

public class Test {
    public static void main(String [] args) {
        String ruler = " ";
         for (int i = 1; i <= 100; i++) {
             ruler = ruler + i + ruler;
            }
        System.out.println(ruler);
         System.out.println();
    }
}
