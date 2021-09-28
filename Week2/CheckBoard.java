package Week2;

import java.util.Scanner;

public class CheckBoard {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ;i<n;i++){
            for(int j = 0;j<n*2;j++){
                if((i%2==0&&j%2==0)||(i%2==1&&j%2==1)){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
