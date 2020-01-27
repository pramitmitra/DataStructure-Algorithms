import java.util.Scanner;

public class HackerRank1 {
    public static void main(String args[])
    {
        //System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n%2 ==0)
        {
            if (n>-2 && n<=5)
            {
                System.out.printf("Not Weird");
            }
            else{
                if (n>=6 && n<=20)
                {
                    System.out.printf("Weird");
                }
                else
                {
                    if (n>20)
                    {
                        System.out.printf("Not Weird");
                    }
                }
            }
        }
        else
        {
            System.out.printf("Weird");
        }

    }
}
