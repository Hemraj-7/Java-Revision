public class Recursion1 {

    // Print Numbers from 5 to 1
    public static void printNumber(int n) {
        if (n == 0) // base case
            return;
        System.out.println(n); // print
        printNumber(n - 1); // recursion
    }

    // Print Numbers from 1 to 5
    public static void printNumber2(int n) {
        if (n == 6)
            return;
        System.out.println(n);
        printNumber2(n + 1);
    }

    // Print sum of first n natural numbers
    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);

        System.out.println(i);
    }

    public static void main(String args[]) {

        System.out.println("Numbers from 5 to 1:");
        printNumber(5);

        System.out.println("Numbers from 1 to 5:");
        int n = 1;
        printNumber2(n);

        System.out.println("Sum of n natural numbers: ");
        printSum(1, 5, 0);
    }
}