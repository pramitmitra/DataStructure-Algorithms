import java.util.Scanner;

public class HackerRank2
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        String b=input.nextLine();
        String emp=input.nextLine();
        float b_f=Float.parseFloat(b);
        String str=input.nextLine();

        System.out.printf("String: %s \n",str);
        System.out.printf("Double: %f\n",b_f);
        System.out.printf("Int: %d",a);
    }
}
