package Week2;

public class Kary {
    public static void main(String[] args)
    {
        long i = Long.parseLong(args[0]);
        int k = Integer.parseInt(args[1]);
        int v = 1;
        while (v <= i/k)
            v = k*v;

        long n = i;

        while (v > 0)
        {
            if (n < v)
            {
                System.out.print("0");
            }
            else
            {
                int digit = (int)(n / v);
                if (digit > 9)
                {
                    char charDigit = (char)('A' + (digit - 10));
                    System.out.print(charDigit);
                }
                else
                    System.out.print(digit);
                n -= v*digit;
            }

            v = v/k;
        }

        System.out.println();
    }
}
