package Week5;

import java.io.*;
import java.util.*;

public class SimpleTextEditor {

    public static void main(String[] args) {
        try {
            InputStreamReader inputStream = new InputStreamReader(System.in);
            BufferedReader scan = new BufferedReader(inputStream);
            int n = Integer.parseInt(scan.readLine());
            Stack<String> stack = new Stack<String>();
            String s = "";
            stack.push(s);
            for (int i = 0; i < n; i++) {
                String input = scan.readLine();
                String[] inputArray = input.split(" ");
                if(inputArray[0].equals("1")){
                    String w = inputArray[1];
                    s = s + w;
                    stack.push(s);
                }
                else if(inputArray[0].equals("2")){
                    int k = Integer.parseInt(inputArray[1]);
                    s = s.substring(0, s.length() - k);
                    stack.push(s);
                }
                else if(inputArray[0].equals("3")){
                    int k = Integer.parseInt(inputArray[1]);
                    System.out.println(s.charAt(k - 1));
                }
                else if(inputArray[0].equals("4")){
                    stack.pop();
                    s = stack.peek();
                }
            }
        }
        catch (NumberFormatException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}