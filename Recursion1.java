public class Recursion1 {

    // Print Numbers from 5 to 1
    public static void printNumber(int n) {
        if (n == 0) // base case
            return;
        System.out.println(n); // print
        printNumber(n - 1); // recursion
    }

    public static void main(String args[]) {
        printNumber(5);
    }
}