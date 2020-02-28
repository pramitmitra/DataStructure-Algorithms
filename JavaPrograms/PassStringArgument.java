import java.util.Scanner;

public class PassStringArgument {


     static void display(String text)
    {
        text=text;
        char c[]=new char[text.length()];
        c=text.toCharArray();
        for (int i=0;i<text.length();i++) {
            System.out.printf("%c", c[i]);
        }

    }

    static void reverseWord(String text){
         text=text;
         char rev[]=new char[text.length()];
         rev=text.toCharArray();
         int l=text.length()-1;
        //System.out.printf("%d", l);
        for (int j=l;j>0;)
         {
             System.out.printf("%c", rev[j]);
             j--;
         }
    }

    public static void main(String args[])
    {
        //System.out.print("Enter input String");
        //Scanner input=new Scanner(System.in);
        //String a=input.nextLine();
        String a="\n";
        String arr = " 'p', 'e', 'r', 'f', 'e', 'c', 't', '  ', 'm', 'a', 'k', 'e', 's', '  ', 'p', 'r', 'a', 'c', 't', 'i', 'c', 'e'";
        display(arr);
        display(a);
        reverseWord(arr);

    }
}
