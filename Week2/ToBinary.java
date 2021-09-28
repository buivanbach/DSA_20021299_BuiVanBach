package Week2;

import java.util.Scanner;

public class ToBinary {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = 1;
        while (v<=n/2){
            v *= 2;
        }
        String answer ="";
        while (v>0){
            if(n<v){
                answer+= '0';
            }
            else{
                answer+= '1';
                n-=v;
            }
            v = v/2;
        }
        System.out.println(answer);
    }
}
