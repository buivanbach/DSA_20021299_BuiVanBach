package Week9;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
//        Map<String> map = new HashSet<>()
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();

        }

//Write your code here
        HashSet hs = new HashSet();

        for (int i = 0; i < t; i++) {

            hs.add(pair_left[i]+" "+pair_right[i]);
            System.out.println(hs.size());
        }
    }
}
