package Week2;

import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

public class CartesianToPolar {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double r = Math.sqrt(x*x + y*y);
        double theta = Math.atan2(y,x);
        StdOut.println("r = " + r +";"+ "theta =" + theta);
    }
}
