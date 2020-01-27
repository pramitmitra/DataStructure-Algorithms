import java.util.Scanner;
public class Practice {
    public static void main(String args[])
    {
        System.out.print("Enter Name");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();

        System.out.print("Enter age");
        String age=input.nextLine();

        System.out.printf("%s",name);
        int i=Integer.parseInt(age);
        System.out.printf("%d",i);
    }
}
