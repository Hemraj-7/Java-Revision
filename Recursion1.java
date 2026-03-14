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

    // Print factorial of a number n
    public static int calcFactrial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1 = calcFactrial(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }

    // Print the fibonacci sequence till nth turm*
    public static void printFib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        printFib(b, c, n - 1);
    }

    public static void main(String args[]) {

        System.out.println("Numbers from 5 to 1:");
        printNumber(5);

        System.out.println("Numbers from 1 to 5:");
        int n = 1;
        printNumber2(n);

        System.out.println("Sum of n natural numbers: ");
        printSum(1, 5, 0);

        System.out.println("Factorial of number 5: ");
        n = 5;
        int ans = calcFactrial(n);
        System.out.println(ans);

        System.out.println("Fibonacci Sequence: ");
        int a = 0, b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        n = 30;
        printFib(a, b, n - 2);

    }
}