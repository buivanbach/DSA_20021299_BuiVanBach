package Week2;

import edu.princeton.cs.algs4.StdOut;

public class Dragon {
    public static String reverse(String s){
        String a = "";
        if(s.length()==1) return s;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)=='R') a+= 'L';
            else if(s.charAt(i)=='L') a+= 'R';
            else a+= s.charAt(i);
        }

        return a;
    }
    public static String Fractal(int x){
        if(x == 0) return "F";
        return Fractal(x-1)+"L"+reverse(Fractal(x-1));

    }
    public static void main(String [] args){
        String s = Fractal(4);
        StdOut.println(s);
    }
}
