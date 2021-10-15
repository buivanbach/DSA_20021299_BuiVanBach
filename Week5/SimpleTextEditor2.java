package Week5;

import java.io.*;
import java.util.*;

public class SimpleTextEditor2 {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<String> stack = new Stack<String>();
        String s = "";
        stack.push(s);
        for(int i = 0 ;i<n ;i++){
            int select = sc.nextInt();
            if(select == 1){
                String w = sc.next();
                s+= w;
                stack.push(s);
            }
            else if (select == 2){
                int k = sc.nextInt();
                s = s.substring(0,s.length()-k);
                stack.push(s);
            }
            else if (select == 3){
                int k = sc.nextInt();
                System.out.println(s.charAt(k-1));
            }
            else{
                stack.pop();
                s = stack.peek();
            }

        }
    }
}
