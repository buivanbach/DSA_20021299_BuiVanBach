package Week2;

import java.util.Scanner;

public class Sinx {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        x = x % (2 * Math.PI);
        double sum = 0.0;
        double term = 1.0;
        for(int i = 1 ; sum != sum + term;i++  ){
            term *= x/i;
            if(i%4==1) sum+=term;
            if(i%4==3) sum-= term;
        }
        System.out.println(sum);
    }
}
