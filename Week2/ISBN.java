package Week2;

import edu.princeton.cs.algs4.In;

public class ISBN {
    public static void main(String [] args){
        int n = Integer.parseInt(args[0]);
        int sum = 0 ;
        for(int i = 2;i<= 10;i++){
            int digit = n % 10;
            sum = sum + digit*i;
            n/=10;
        }
        if(sum%11==1) System.out.println('X');
        else if(sum%11==0) System.out.println('0');
        else System.out.println(11-sum%11);
    }
}
