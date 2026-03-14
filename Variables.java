import java.util.*;

public class Variables {
    public static void main(String args[]) {
        // Outputs:-
        // System.out.print("Hello! World Hemsa");
        System.out.println("Hello! World");
        System.out.print("Hello! World Java \n");
        System.out.println("---------------------------");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("---------------------------");
        System.out.println("*\n**\n***\n****");

        // Variables:-
        // String name = "Hemsa";
        // int age = 24;
        // double price = 34.124;
        int a = 25;
        int b = 10;

        // b = 20;
        // name = "Hem Raj";

        int sum = a + b;
        int diff = a - b;
        int mul = a * b;
        int div = a / b;
        System.out.println("the sume of a and b is: " + sum);
        System.out.println("the difference of a and b is: " + diff);
        System.out.println("the multiplication of a and b is: " + mul);
        System.out.println("the division of a and b is: " + div);

        // Input:-
        Scanner sc = new Scanner(System.in);
        // String tellTheName = sc.next();
        System.out.println("Please Enter Your Name: ");
        String tellTheName = sc.nextLine();
        // nextInt()
        // nextFloat()
        System.out.println(tellTheName);

        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y: ");
        int y = sc.nextInt();
        System.out.println("The sum of x and y is: " + (x + y));
        sc.close();
    }
}
