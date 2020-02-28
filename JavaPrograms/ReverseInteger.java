/*
package Easy;


public class ReverseInteger {


    public static int reverse(int x) {

        int n = x;
        if (x >= 2**31-1 || x <= -2**31)
        {
            return 0;
        }
        else {
            int l = String.valueOf(n).length();
            char f;
            int rem = 0;
            int rev = 0;
            if (n > 0)
                f = 'p';
            else
                f = 'n';
            n = Math.abs(n);

            while (n > 0) {
                rev = rev * 10 + n % 10;
                n = n / 10;
            }

            if (f == 'n')
                rev = rev * -1;
            else
                rev = rev;

            return rev;
        }
    }


    public static void main(String args[])
    {
        int in=1534236469;
        int ret=reverse(in);
        System.out.print(ret);
    }
}*/
