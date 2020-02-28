import java.util.Scanner;


public class Fibo_Array {
    public static void main(String args[])
    {
        System.out.print("Enter First Number :");
        Scanner input =new Scanner(System.in);
        int first_num=input.nextInt();

        System.out.print("Enter Second Number :");
        int second_num=input.nextInt();

        System.out.print("How many sequence you want? ");
        int seq = input.nextInt();

        int []fib_ar = new int[seq];

        //fib_ar[0]=first_num;
        //fib_ar[1]=second_num;

        for (int i=0; i< seq; i++)
        {
            fib_ar[i] = first_num+second_num;
            first_num=second_num;
            second_num=fib_ar[i];
           System.out.printf(" %d ", fib_ar[i]);
        }

    }

}
