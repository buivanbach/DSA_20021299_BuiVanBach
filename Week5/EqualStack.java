package Week5;

import java.util.List;
import java.util.Stack;

public class EqualStack {
    public static int max2(int a, int b) {
        return a > b ? a : b;
    }

    public static int max3(int a, int b, int c) {
        return max2(max2(a, b), c);
    }

    public static int equalStacksUseStack(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        Stack<Integer> s3 = new Stack<Integer>();
        int sum1 = 0 , sum2 = 0 , sum3 = 0;
        for(int i = h1.size()-1;i>=0;i--) {
            sum1 += h1.get(i);
            s1.push(sum1);
        }
        for(int i = h2.size()-1;i>=0;i--) {
            sum2 += h2.get(i);
            s2.push(sum2);
        }
        for(int i = h3.size()-1;i>=0;i--) {
            sum3 += h3.get(i);
            s3.push(sum3);
        }
        while(!s1.isEmpty()&&!s2.empty()&&!s3.empty()){
            sum1 = s1.peek();
            sum2 = s2.peek();
            sum3 = s3.peek();
            if(sum1==sum2&&sum2 == sum3){
                return sum1;
            }
            if(sum1 >= sum2 && sum1 >= sum3){
                s1.pop();
            }
            else if(sum2 >= sum1 && sum2 >= sum3){
                s2.pop();
            }
            else if(sum3 >= sum1 && sum3 >= sum1){
                s3.pop();
            }
        }
        return 0;
    }
    // soluton not ues stack
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int sum1 = 0, sum2 = 0 , sum3 =0;
        for(int i = 0 ; i < h1.size();i++) sum1+=h1.get(i);
        for(int i = 0 ; i < h2.size();i++) sum2+=h2.get(i);
        for(int i = 0 ; i < h3.size();i++) sum3+=h3.get(i);
        int i = 0 ; int k = 0; int j = 0;
        while(i<h1.size()&&j< h2.size()&&k< h3.size()){
            if(sum1==sum2&&sum1==sum3){
                return sum1;
            }
            else if(sum1 == max3(sum1,sum2,sum3)){
                sum1-=h1.get(i);
                i++;
            }
            else if(sum2 == max3(sum1,sum2,sum3)){
                sum2-=h2.get(j);
                j++;
            }
            else if(sum3 == max3(sum1,sum2,sum3)){
                sum3-=h3.get(k);
                k++;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(max3(3, 2, 5));
    }
}
