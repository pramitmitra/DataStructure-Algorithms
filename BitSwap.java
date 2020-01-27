public class BitSwap
{
     public static void main(String args[])
     {
         int a=5;
         int b=6;

          a=a^b;
          b=a^b;
          a=a^b;

      System.out.printf("%d %d \n",a,b);

      // Bit Shift Operations
         int x=6;
         int y=x<<1;
         int z=x>>1;

         System.out.printf("%d %d", y,z);


     }
}
