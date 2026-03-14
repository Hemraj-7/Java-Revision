import java.util.*;

public class TwoDArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows and columns: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        // input
        // outer loop -> rows
        for (int i = 0; i < rows; i++) {
            // innner loop -> columns
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing the elements ");
        for (int i = 0; i < rows; i++) {
            // innner loop -> columns
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        // Q. Take a matrix as input from the user. Search for a given number x and
        // print the indices at which it occurs.
        System.out.println("Enter the number for search: ");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("The number x fount at location: (" + i + "," + j + ")");
                }
            }
        }
        sc.close();
    }
}
