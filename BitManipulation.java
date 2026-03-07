import java.util.*;

public class BitManipulation {
    public static void main(String args[]) {
        // Get Bit Operation -------->
        int n = 5; // 0101
        // int pos = 2; // position = 2 => [0[1]01];
        int pos = 3; // position = 3 => [[0]101];
        int bitMask = 1 << pos; // 1 = 0001 => 0001<<2 => 0100

        if ((bitMask & n) == 0) { // 0100 multiply by 0101
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was One");
        }

        // Set Bit Operation -------->
        n = 5; // 0101
        pos = 1; // [01[0]1]
        bitMask = 1 << pos; // 0001 << 1 => 0010
        int newNumber = bitMask | n; // 0010 OR (|) 0101 => 0111 means 0111 => 7;
        System.out.println(newNumber);

        // Clear Bit Operation -------->
        n = 5; // 0101
        pos = 2; // [0[1]01]
        bitMask = 1 << pos; // 0001 << 2 => 0100
        int notBitMask = ~(bitMask); // ~0100(NOT) => 1011

        int newNumberforClear = notBitMask & n; // 1011 & 0101 => 0001 => 1
        System.out.println(newNumberforClear);

        // Update Bit Operation -------->
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        n = 5;
        pos = 1;
        bitMask = 1 << pos;

        if (oper == 1) {
            // Set
            int setNumber = bitMask | n;
            System.out.println(setNumber);
        } else {
            int newBitMask = ~(bitMask);
            int clearNumber = newBitMask & n;
            System.out.println(clearNumber);
        }

    }
}
