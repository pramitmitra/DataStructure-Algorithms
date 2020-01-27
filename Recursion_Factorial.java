import java.util.Scanner;
class Rec_Fact
{
    int fin=0;
     int fact(int n)
    {
        if(n!=0)
            return (n*fact(n-1));
        else
            return 1;
    }
}

public class Recursion_Factorial{
    public static void main(String args[])
    {
        int x=0,y;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Input to calculate Factorial\n");
        x=input.nextInt();
        if (x<0)
        {
            System.out.print("\n Only Positive Integer are allowed!");
            System.exit(1);
        }
        else {
            Rec_Fact obj = new Rec_Fact();
            y = obj.fact(x);
            System.out.printf("Factorial of %d is %d",x, y);
        }


    }
}
