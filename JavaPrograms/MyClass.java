import java.util.Scanner;

class MyClass {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");



        // Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();
        // String input
        String name = myObj.nextLine();
        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
