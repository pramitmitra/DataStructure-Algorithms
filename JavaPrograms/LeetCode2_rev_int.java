class Solution1 {
    public int reverse(int x) {
        int y;
        int y_arr[]=new int[10];
        y=x;
        System.out.printf("Ip numnber %d\n", y);
        int i=0;int rev_num=0;
        while(y>0)
        {
            int dig = y%10;
            y=y/10;
            y_arr[i]=dig;
          System.out.printf("%d \n", y_arr[i]);
            i++;
        }

        for (int k=1; k<i;k--)
        {

            if (k==0)
            {
                 rev_num=y_arr[k];
            }
            if (k==1)
            {
                 rev_num=rev_num + (y_arr[k])*10;
            }
            if (k==2)
            {
                rev_num=rev_num + (y_arr[k])*100;
            }
            if (k==3)
            {
                rev_num=rev_num + (y_arr[k])*1000;
            }
            if (k==4)
            {
                rev_num=rev_num + (y_arr[k])*10000;
            }
            System.out.printf("[K]:%d ARR[K]%d [rev_num]%d \n",k, y_arr[k], rev_num);
        }
    return rev_num;
    }
}


public class LeetCode2_rev_int {
    public static void main(String args[])
    {
        int ip=345, re;
        Solution1 sol=new Solution1();
        re=sol.reverse(ip);
        System.out.printf("\nFinal Reverser Number = %d", re);
    }


}
