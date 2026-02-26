import java.util.*;

public class Loops {
    public static void main(String args[]) {

        // for Loop ->
        for (int counter = 0; counter < 10; counter = counter + 1) {
            System.out.println("Hello World!" + counter);
        }

        for (int count = 0; count < 11; count++) {
            // System.out.println(count);
            System.out.print(count + " ");
        }

        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }

        // while Loop ->
        int i = 0;
        while (i < 11) {
            System.out.println(i);
            i++;
        }

        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 11);

        // Q1. print the number of n natural numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int k = 0; k <= num; k++) {
            sum += k;
        }
        System.out.println("The sum of entered number is: " + sum);

        // Q2. Print the table of a number input by the user.
        for (int x = 1; x <= 10; x++) {
            System.out.println(num + " x " + x + " = " + num * x);
        }
    }
}
