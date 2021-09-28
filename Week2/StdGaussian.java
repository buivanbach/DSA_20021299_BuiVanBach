package Week2;

import edu.princeton.cs.algs4.StdOut;

public class StdGaussian {
    public static void main(String [] args) {
        double u =  Math.random();
        double v = Math.random();
        double Z = Math.sin(2*Math.PI*u)*Math.sqrt(-2*Math.log(v));
        StdOut.println(Z);
    }
}
