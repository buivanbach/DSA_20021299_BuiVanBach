package Week2;

import edu.princeton.cs.algs4.RandomSeq;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Random;

public class RandomBetweenAandB {
    public static void main(String [] args){
        int a = 20 ; int b = 40;
        Random random = new Random();
        int n  = random.nextInt(b-a+1) + a;
        StdOut.println(n);

    }

}
