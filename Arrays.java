import java.util.*;

public class Arrays {
    public static void main(String args[]) {
        // defining Array ->
        // first way to define array
        // int[] marks = new int[3];

        // second way to define array
        // int marks[] = new int[3];

        // marks[0] = 97; // phy
        // marks[1] = 98; // chem
        // marks[2] = 95; // eng

        // third way to define array
        int marks[] = { 97, 98, 95 };

        System.out.println(marks); // it is gives garbege value

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // create an Array through user input ->
        Scanner ac = new Scanner(System.in);
        System.out.println("Please enter the size of an Array: ");
        int size = ac.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = ac.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Q. Take an array as input from the user. Search for a given number x and
        // print the index at which it occurs.
        System.out.println("Enter the number which one you want to serach i will give you the index of that number.");
        int search = ac.nextInt();

        for (int i = 0; i < size; i++) {
            if (numbers[i] == search) {
                System.out.println("the number is avilable in the " + i + " index.");
                System.out.println("the number found at index:  " + i);
            }
        }
    }
}