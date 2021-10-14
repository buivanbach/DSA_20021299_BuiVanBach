package Week5;



import java.util.Scanner;
import java.util.SplittableRandom;
import java.util.concurrent.LinkedTransferQueue;

public class QueueUsingTwoStack {
    public static void main(String [] args){
        Queue<Integer> s = new Queue<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != 0 ){
            int seclect = sc.nextInt();
            if(seclect == 1){
                s.enqueue(sc.nextInt());
            }
            else if( seclect == 2){
                s.dequeue();
            }
            else {
                System.out.println(s.peek());
            }
            n--;
        }
    }
}
