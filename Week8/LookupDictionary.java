package Week8;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.*;

public class LookupDictionary {

    //        Scanner sc = new Scanner(System.in);
//        List<String> p = new ArrayList<>();
//        while (!StdIn.isEmpty()) {
//            String item = StdIn.readString();
//            p.add(item);
//        }
//        List<Integer> appear = new ArrayList<>();
//
//        for (int i = 0; i < p.size(); i++) {
//            int count = 1;
//            for (int j = i + 1; j < p.size(); j++) {
//                if (p.get(j).equals(p.get(i))) {
//                    count++;
//                    p.remove(j);
//                    j--;
//                }
//            }
//            appear.add(count);
//        }
//        for (int i = 0; i < p.size(); i++) {
//            System.out.println(p.get(i) + " : " + appear.get(i));
//        }
//    }
    public static void main(String[] args) {
        TreeMap<String, Integer> lookup = new TreeMap<>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (lookup.containsKey(item)) {
                lookup.put(item, lookup.get(item) + 1);
            } else {
                lookup.put(item, 1);
            }
        }
        System.out.println(lookup);
        System.out.println(lookup.keySet());
    }
}