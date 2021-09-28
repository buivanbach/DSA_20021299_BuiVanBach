package Week2;

import java.util.Scanner;

public class Calender {
    public static boolean LeepYear(int year){
        boolean isLeepYear = false;
        if(year % 4 ==0 && year % 100 != 0 ) isLeepYear = true;
        if(year % 400 ==0 ) isLeepYear = true;
        return isLeepYear;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int y = sc.nextInt();
        //tinh thu may cua ngay dau tien trong thang
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (1 + x + (31*m0)/12) % 7;
        int end = 0;
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                end = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                end = 30;
                break;
            case 2:
                if (LeepYear(y) == true) end = 29;
                else end = 28;
                break;
        }
        System.out.println("Thang "+m+" , " + y);
        System.out.println("S\tM\tT\tW\tTH\tF\tS");
        int count = 1;
        for(int i = 0;i<6;i++){
            for(int j = 0 ;j<7;j++){
                if(i==0&&j<d0)System.out.print("\t");
                else {
                    if (count > end) break;
                    System.out.print(count + "\t");
                    count++;
                }
            }
            System.out.println();
        }
    }
}
