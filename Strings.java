import java.util.*;

public class Strings {
    public static void main(String args[]) {
        // String Declaration
        // String name = "Tony";
        // String fullName = "Tony Stark";
        // String sentence = "My name is Tony Stark";

        Scanner sc = new Scanner(System.in);
        // String name = sc.next(); // it takes only one word
        // String name = sc.nextLine(); // it is able to takes more than one word
        // System.out.println("Your name is: " + name);

        String firstName = "Hem";
        String lastName = "Raj";

        // String functions ->
        // 1. Concatenation function
        String puraName = firstName + " " + lastName;
        System.out.println(puraName);

        // 2. length function
        System.out.println(puraName.length());

        // 3. charAt function
        for (int i = 0; i < puraName.length(); i++) {
            System.out.println(i + " = " + puraName.charAt(i));
        }

        // compare
        String name1 = "Hemsa";
        // String name2 = "Hemsa";
        String name2 = "Hemsa";

        // compare funtion check 3 coditions
        // 1. s1 > s2 : it returns a +ve value
        // 2. s1 == s2 : it returns a 0
        // 3. s1 < s2 : it returns a -ve value

        String hello = "helloXyz";
        String wello = "wello";
        System.out.println(hello.compareTo(wello));
        System.out.println(wello.compareTo(hello));
        System.out.println(wello.compareTo(wello));

        if (name1.compareTo(name2) == 0) {
            System.out.println("Both Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // some times it is not working well
        if (name1 == name2) {
            System.out.println("Both Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // it is not comparing right
        if (new String("Tony") == new String("Tony")) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");

        }

        // substring function
        String sentence = "My name is Hemraj";
        String myName = sentence.substring(11, sentence.length());
        System.out.println(myName);

        System.out.println(sentence.substring(3, 8));
        System.out.println(sentence.substring(8));

        // Strings are Immutable
    }
}
