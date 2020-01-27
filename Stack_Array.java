import java.util.Scanner;

public class Stack_Array {
    final static int top_max=50; static int top=0;
    static int stack_array[]=new int[top_max];



    public static void push(int d){
        int data=d;
        //Check OverFlow Condition
        if (stack_array[top] >= top_max) {
            System.out.print("\nStack OverFlow");
        }else
        {
            top=top+1;
            stack_array[top]=data;
            System.out.printf("\n %d Data pushed into Stack Top\n", data);
        }
    }

    public static void pop(){
        //Check UnderFlow Condition
        if (top<0){
            System.out.print("\n Stack UnderFlow");
            top=0;
        }else{
            System.out.printf("\n %d from top is poped ", stack_array[top]);
            top=top-1;
        }
    }

    static void display_top(){
        System.out.printf("\n Top of Stack is %d\n", stack_array[top]);
    }

    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        while (true){
            System.out.println("\n::Enter Your Choice for Stack Operation ::\n");
            System.out.println("Enter 1 For Stack Push ::");
            System.out.println("Enter 2 For Stack Pop ::");
            System.out.println("Enter 3 For Stack Top Display ::");
            System.out.println("Enter 4 For Exit ::");
            int ip=input.nextInt();

            if(ip==1)
            {
             System.out.printf("\nEnter Stack Element to Push");
                int d=input.nextInt();
                push(d);
            }

            if(ip==2)
            {
                pop();
            }

            if(ip==3)
            {
                display_top();
            }

            if(ip==4)
            {
                System.exit(1);
            }

        }
    }

}
