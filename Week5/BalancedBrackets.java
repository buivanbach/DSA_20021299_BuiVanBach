package Week5;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

public class    BalancedBrackets {
    public static String isBalanced(String s) {
        Stack<Character> solution = new Stack<>();
        solution.push(s.charAt(0));
        for(int i = 1 ; i < s.length();i++){
            if(solution.isEmpty()){
                solution.push(s.charAt(i));
                continue;
            }
            char res = solution.pop();
            if(res == '{'){
                if(s.charAt(i)!='}'){
                    solution.push(res);
                    solution.push(s.charAt(i));
                }
            }
            else if(res == '['){
                if(s.charAt(i)!=']'){
                    solution.push(res);
                    solution.push(s.charAt(i));
                }
            }
            else if(res == '('){
                if(s.charAt(i)!=')'){
                    solution.push(res);
                    solution.push(s.charAt(i));
                }
            }
            else return "NO";

        }
        if(solution.isEmpty())return "YES";
        return "NO";
    }
    public static void main(String [] args){
        while(true) {
            String s = StdIn.readString();
            System.out.println(isBalanced(s));
        }
    }
}
