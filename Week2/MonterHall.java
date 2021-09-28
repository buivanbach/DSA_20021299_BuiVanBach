package Week2;
import java.util.Scanner;

public class MonterHall {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int trials = sc.nextInt();
        int win = 0;
        for(int i = 0 ;i<trials;i++){
            int choice = (int) (3.0 * Math.random());
            int prize = (int) (3.0*Math.random());
            int reveal;
            do{
                reveal = (int) (3*Math.random());
            }
            while(reveal==choice||reveal==prize);
            int other = 0 + 1 + 2 - reveal - choice;
            if(other == prize) win++;
        }
        System.out.println("ti le win :" + 1.0*win / trials);
    }
}
