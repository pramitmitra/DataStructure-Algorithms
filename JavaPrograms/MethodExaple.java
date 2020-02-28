
import java.util.Scanner;

public class MethodExaple {

    public static int Rectangle(int somelength, int somewidth)
    {
        return somelength*somewidth;
    }

    public static void main(String args[])
    {
        System.out.println("Example of Method");
        int l1, w1;


        Scanner input= new Scanner(System.in);
        System.out.println("Enter Length:");
        l1=input.nextInt();

        System.out.println("Enter Width:");
        w1=input.nextInt();


        int val1= Rectangle(10 , 30   );
        System.out.println(val1);

        int val2 = Rectangle( l1, w1);
        System.out.println(val2);
    }
}
