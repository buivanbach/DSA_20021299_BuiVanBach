package Week9;

import java.util.ArrayList;
import java.util.List;

public class Bai7 {
    public static void merge(List<Integer> a, List<Integer> aux, int lo, int mid, int hi) {

        // copy to aux[]
        for (int k = lo; k <= hi; k++) {
            aux.set(k, a.get(k));
        }
        // merge back to a[]
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid)                        a.set(k, aux.get(j++));
            else if (j > hi)                    a.set(k, aux.get(i++));
            else if (aux.get(j) < aux.get(i))   a.set(k, aux.get(j++));
            else                                a.set(k, aux.get(i++));
        }
    }

    // mergesort a[lo..hi] using auxiliary array aux[lo..hi]
    public static void sort(List<Integer> a, List<Integer> aux, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }

    /**
     * Rearranges the array in ascending order, using the natural order.
     *
     * @param a the array to be sorted
     */
    public static void sort(List<Integer> a) {
        List<Integer> aux = new ArrayList<>();
        for(int i = 0 ; i < a.size();i++) aux.add(0);
        sort(a,aux,0,a.size());
    }
    public static List<Integer> closestNumbers(List<Integer> arr) {
        int MinDis = 100000;
        sort(arr);
        for(int i = 0 ; i < arr.size() -1  ; i++){
            if(arr.get(i+1)- arr.get(i) < MinDis){
                MinDis = arr.get(i+1)- arr.get(i);
            }
        }
        List <Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < arr.size()-1;i++){
            if(arr.get(i+1) - arr.get(i) == MinDis){
                res.add(arr.get(i));
                res.add(arr.get(i+1));
            }
        }
        return res;
    }
}
