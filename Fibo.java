import java.util.Scanner;

public class Fibo {
    public static void main(String args[])
    {
        System.out.print("Please Enter First Number");
        Scanner input= new Scanner(System.in);
        int first_num=input.nextInt();
        System.out.printf("First Number Entered by you is %d\n", first_num);

        System.out.print("Please Enter Second Number");
        int second_num=input.nextInt();
        System.out.printf("Second Number Entered by you is %d\n", second_num);


        System.out.print("Please Enter How many sequence you want? ");
        int seq=input.nextInt();
        System.out.printf("Here is your Fibenacci Series for %d -> %d of sequence %d \n", first_num, second_num, seq);

        System.out.printf("%d -> %d", first_num, second_num);

        for (int i=0; i< seq ; i++)
        {
           int t= first_num+second_num;
           first_num=second_num;
           second_num=t;
           System.out.printf(" -> %d", t);
        }

    }

}
