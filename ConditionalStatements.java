import java.util.*;

public class ConditionalStatements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Age: ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }

        if (age % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        System.out.println("Enter 2 Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Through if else ->
        if (a == b) {
            System.out.println("Equal numbers");
        } else {
            if (a > b) {
                System.out.println("A is Greater");
            } else {
                System.out.println("B is Greater");
            }
        }

        // through else if statement ->
        if (a == b) {
            System.out.println("Equal numbers");
        } else if (a > b) {
            System.out.println("A is Greater");
        } else {
            System.out.println("B is Greater");
        }

        System.out.println("Enter the button number: ");
        int button = sc.nextInt();

        // if (button == 1) {
        //     System.out.println("Hello!");
        // } else if (button == 2) {
        //     System.out.println("Namaste");
        // } else if (button == 3) {
        //     System.out.println("Banjour");
        // } else {
        //     System.out.println("Invalid button");
        // }

        // Switch Case Statement ->
        switch(button){
            case 1: System.out.println("Hello!");
            break;
            case 2: System.out.println("Namaste!");
            break;
            case 3: System.out.println("Banjour");
            break;
            default: System.out.println("Invalid Button");
        }
        sc.close();
    }
}
