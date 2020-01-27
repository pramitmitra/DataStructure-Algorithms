import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuess {

    public static void main(String args[])
    {
        int guess=0;
        Random generator =new Random();
        int n =generator.nextInt(10) +1;
        Double d=generator.nextDouble();
        System.out.printf("Selected a Random Number between 1 -> 10\n");
        System.out.printf("Selected a Random Double is %f  \n", d);

        Scanner input = new Scanner(System.in);

        int i=0;
/*        while(true)
        {
            System.out.print("Take guess ");
            guess=input.nextInt();
            i++;
            if (guess == n)
            {
                System.out.print("Correct Guess");
                break;
            }
            else
            {
                System.out.printf("Incorrect Guess Number : %d\n", i);
            }
        }*/
    }
}
