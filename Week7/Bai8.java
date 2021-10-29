package Week7;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;
//priority queue
public class Bai8 {
    // initial capacity of underlying resizing array
    private static final int INIT_CAPACITY = 8;

    private int[] a;         // array of items
    private int n;            // number of elements on stack

    public Bai8() {
        a = new int[INIT_CAPACITY];
        n = 0;
    }
    public boolean isEmpty() {
        return n == 0;
    }
    public int size() {
        return n;
    }

    private void resize(int capacity) {
        int[] copy = new int[capacity];
        for (int i = 0; i < n; i++) {
            copy[i] = a[i];
        }
        a = copy;
    }

    public void push(int item) {
        if (n == a.length) resize(2*a.length);    // double size of array if necessary
        a[n++] = item;                            // add item
    }


    public int pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        int item = a[n-1];
        a[n-1] = Integer.parseInt(null);                              // to avoid loitering
        n--;
        // shrink size of array if necessary
        if (n > 0 && n == a.length/4) resize(a.length/2);
        return item;
    }

    public int peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return a[n-1];
    }
    public void insert(int n){
        push(n);
    }
    public int deleteMin(){
        int min = a[0];
        int pos = 0;
        for(int i = 0 ; i < size();i++){
            if(a[i]<min){
                min = a[i];
                pos = i;
            }
        }
        for(int i = pos+1;i <size()-1;i++){
            a[i-1] = a[i];
        }
        a[size()] = Integer.parseInt(null);
        return min;
    }
    public static void main(String[] args) {

    }

}
