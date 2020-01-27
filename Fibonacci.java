import java.util.Scanner;
public class Fibonacci {

    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int a,b,n;
        System.out.println("Enter First Number");
        a=input.nextInt();

        System.out.println("Enter Second Number");
        b=input.nextInt();

        System.out.println("Enter Range ");
        n=input.nextInt();

        for (int i=0;i<n;i++)
        {
            int sum=a+b;
            System.out.printf("%d ",sum);
            a=b;
            b=sum;
        }
    }


}
