import java.util.*;

public class QuestionsSet1 {

    // Q1. Enter 3 numbers from the user and make a function to print their average.
    public static int calulateAvg(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    // Q2. Write a function to print the sum of all odd numbers from 1 to n.
    public static void allOddNumbers(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                System.out.println();
            }
        }
    }

    // Q3. Write a function which takes in 2 numbers and returns the greater of
    // those two.
    public static int gretestNumber(int a, int b) {
        int result = 0;
        if (a > b) {
            result = a;

        } else if (a < b) {
            result = b;

        } else {
            result = a;
        }
        return result;
    }

    // Q4. Write a function that takes in the radius as input and returns the
    // cricumference of a circle.
    public static float cricumferenceOfACircle(float radius) {
        float pi = 3.14f;
        return 2 * pi * radius;
    }

    // Q5. Write a function that takes in age as input and returns if that peroson
    // is eligible to vote or not. A person of age > 18 is eligible to vote.
    public static int checkEligibilityForVote(int age) {
        if (age > 18) {
            return 1;
        } else {
            return 0;
        }
    }

    // Q8. Two numbers are entered by the user, x and n. write a function to find
    // the value of one nubmer raised to the power of another i.e x to the power of
    // n
    public static void power(int x, int n) {
        System.out.println(x + " to the power of " + n + " is: ");
        int power = 1;
        for (int i = 1; i <= n; i++) {
            power *= x;
        }
        System.out.println(power);
        return;
    }

    // Q9. Write a function that calculates the Greatest common divisor of 2
    // numbers.
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter three number's: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Q1.
        int avg = calulateAvg(a, b, c);
        System.out.println("The avg of three number is: " + avg);

        // Q2.
        allOddNumbers(avg);

        // Q3.
        System.out.println("The geretest number of " + a + " and " + b + " is: " + gretestNumber(a, b));

        // Q4.
        System.out.println(
                "The Circumference of a Circle is: " + cricumferenceOfACircle(avg) + " it's radius is: " + avg);

        // Q5.
        int val = checkEligibilityForVote(avg);
        if (val == 1) {
            System.out.println("Your age is: " + avg + " years. You are eligible for vote.");
        } else {
            System.out.println("Your age is: " + avg + " years. You are not eligible for vote.");
        }

        // Q6. Write a infinite loop using do while condition.
        // int i = 1;
        // do {
        // System.out.println("Hello! Paji");
        // } while (i == 1);

        // Q7. Write a program to enter the numbers till the user wants and at the end
        // it should display the count of positive, nagetive and zeros enterd.
        int positiveCounts = 0;
        int nagetiveCounts = 0;
        int zeroCounts = 0;
        boolean exit = true;

        while (exit == true) {
            System.out.println("Please enter your choice: 1 for entering a number and 2 for exit.");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter a Number: ");
                    int x = sc.nextInt();
                    if (x == 0) {
                        zeroCounts++;
                    } else if (x > 0) {
                        positiveCounts++;
                    } else {
                        nagetiveCounts++;
                    }
                    break;
                case 2:
                    exit = false;
                    break;
                default:
                    System.out.println("Invalid Selection");
                    break;
            }
        }
        System.out.println("The total Positive numbers are: " + positiveCounts + " and the total Negetive Numbers are: "
                + nagetiveCounts + " and the total zeros are: " + zeroCounts);

        // Q8.
        System.out.println("a to the power of b is: ");
        power(a, b);

        // Q9.
        System.out.println("Gretest common divisor of 2 is: " + gcd(a, b));

        // Q10. Write a program to print fibonacci series of n terms where n is input by
        // user?

        System.out.println("Enter the n number for fibonacci series: ");
        int number = sc.nextInt();

        int fibonacci = 0;
        int secondLastNum = 1;
        int lastNum = 0;

        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacci + " ");
            fibonacci = lastNum + secondLastNum;
            secondLastNum = lastNum;
            lastNum = fibonacci;
        }

        System.out.println();

        int first = 0;
        int second = 1;

        for (int i = 1; i <= number; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
        sc.close();
    }
}
