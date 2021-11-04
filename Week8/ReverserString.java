package Week8;

import java.util.Scanner;

public class ReverserString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int flag = 1;
        for(int i = 0 ; i < A.length()/2;i++){
            if(A.charAt(i)!=A.charAt(A.length()-1-i)){
                flag = 0;
                break;
            }
        }
        System.out.println(flag ==1 ? "Yes": "No");
    }
}
