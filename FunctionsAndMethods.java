import java.util.*;

public class FunctionsAndMethods {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    // Q. Make a function to add 2 numbers and return their sum?
    public static int sumOfTwoNumber(int a, int b) {
        System.out.println("The sum of Two Number is : " + (a + b));
        return a + b;
    }

    // Q. Make a function to multiply 2 numbers and return thier product.
    public static int calulateProduct(int a, int b) {
        int multiplication = a * b;
        return multiplication;
    }

    // Q. Find the factiorial of a Number?
    public static void calculateFatorial(int num) {
        if (num < 0) {
            System.out.println("invalid factorial Number");
            return;
        }
        int factiorial = 1;
        for (int i = num; i >= 1; i--) {
            factiorial *= i;
        }
        System.out.println("The factorial of " + num + " is: " + factiorial);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Name: ");
        String name = sc.nextLine();

        printMyName(name); // Function Calling

        System.out.println("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int sum = sumOfTwoNumber(x, y);
        System.out.println("Return value is : " + sum);
        System.out.println("Product of a and b is: " + calulateProduct(x, y));

        System.out.println("Enter the number of factorial: ");
        int factiorialNumber = sc.nextInt();

        calculateFatorial(factiorialNumber);

        sc.close();
    }
}
