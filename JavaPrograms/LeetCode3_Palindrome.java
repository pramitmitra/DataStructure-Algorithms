// Palindrome Check
import java.util.Scanner;

class Solution2 {
    public boolean reverse(int x) {
        int y, rev_val=0, mul_ran;
        int y_arr[] = new int[5];
        y = x;
        //System.out.printf("Ip numnber %d\n", y);
        int l= String.valueOf(y).length();
        mul_ran=l;
        //System.out.printf("%d \n", l);
    if (y<0) {
        return false;
    }
     else {

        int i = 0;
        int rev_num = 0;
        while (y > 0) {
            int dig = y % 10;
            y = y / 10;
            y_arr[i] = dig;
            // System.out.printf("%d \n", y_arr[i]);
            i++;
        }

        for (int k = 0; k < l; k++) {


            if (mul_ran == 9) {
                rev_val = rev_val + y_arr[k] * 1000000;
                //System.out.printf("%d",rev_val);
            }
            if (mul_ran == 8) {
                rev_val = rev_val + y_arr[k] * 100000;
                //System.out.printf("%d",rev_val);
            }
            if (mul_ran == 7) {
                rev_val = rev_val + y_arr[k] * 100000;
                //System.out.printf("%d",rev_val);
            }
            if (mul_ran == 6) {
                rev_val = rev_val + y_arr[k] * 100000;
                //System.out.printf("%d",rev_val);
            }
            if (mul_ran == 5) {
                rev_val = rev_val + y_arr[k] * 10000;
                //System.out.printf("%d",rev_val);
            }
            if (mul_ran == 4) {
                rev_val = rev_val + y_arr[k] * 1000;
                //System.out.printf("%d",rev_val);
            }
            if (mul_ran == 3) {
                rev_val = rev_val + y_arr[k] * 100;
                //System.out.printf("%d",rev_val);
            }
            if (mul_ran == 2) {
                rev_val = rev_val + y_arr[k] * 10;
                //System.out.printf("%d",rev_val);
            }
            if (mul_ran == 1) {
                rev_val = rev_val + y_arr[k] * 1;
                //System.out.printf("%d",rev_val);
            }


            mul_ran--;

        }

        //System.out.printf("Op number %d \n",rev_val);
        if (x==rev_val) {

            return true;
        }
        else
        {
            return false;
        }
    }
    }
}

public class LeetCode3_Palindrome {
            public static void main(String args[])
            {
                boolean r;
                Solution2 sol=new Solution2();
                //System.out.println("Input Number :: ");
                Scanner input=new Scanner(System.in);
                int num=input.nextInt();
                r=sol.reverse(num);
                System.out.print(r);
            }

}
