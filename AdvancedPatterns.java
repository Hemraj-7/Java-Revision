public class AdvancedPatterns {
    public static void main(String args[]) {

        int n = 5;

        System.out.println("-----------------------------------------------");
        System.out.println("Butterfly Patter --> ");
        // 1. Butterfly Patter

        // outer loop For Upper half
        for (int i = 1; i <= n; i++) {
            // inner loop first part
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            // inner loop for spacing
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("   ");
            }
            // inner loop for second part
            for (int l = 1; l <= i; l++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        // outer loop For Lower half
        for (int i = n; i >= 1; i--) {
            // inner loop first part
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            // inner loop for spacing
            int spaces = 2 * (n - i);
            for (int k = 1; k <= spaces; k++) {
                System.out.print("   ");
            }
            // inner loop for second part
            for (int l = 1; l <= i; l++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------");
        System.out.println("Solid Rhombus Patter --> ");

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop for first spacing
            for (int j = n - 1; j >= i; j--) {
                System.out.print("   ");
            }

            // inner loop for star printing
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }

            // Second spacing we don't require ->
            // if require then ->
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("   ");
            }

            System.out.println();
        }

        System.out.println("-----------------------------------------------");
        System.out.println("Hollow Rhombus Patter --> ");

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop for first spacing
            for (int j = n - 1; j >= i; j--) {
                System.out.print("   ");
            }

            // inner loop for star printing
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }

            System.out.println();
        }

        System.out.println("-----------------------------------------------");
        System.out.println("Number Pyramid Patter --> ");

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop for spaces
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }

            // inner loop for numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------");
        System.out.println("Palindromic Pyramid Patter --> ");

        // outer loop
        for (int i = 1; i <= n; i++) {
            int num = n;
            int spaceCount = 0;
            // inner loop for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
                spaceCount++;
            }

            num = num - spaceCount;
            // inner loop for fist part
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + num + " ");
                num--;
            }

            num = 2;
            // inner loop for second part
            for (int j = 2; j <= i; j++) {
                System.out.print(" " + num + " ");
                num++;
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------");
        // Solution by shardha kapra
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 1st half Numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // 2nd half Numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------");
        System.out.println("Diamond's Patter --> ");

        // outer loop for upper part
        for (int i = 1; i <= n; i++) {
            // inner loop for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }

            // inner loop for star printing in first part
            for (int j = i; j >= 1; j--) {
                System.out.print(" * ");
            }

            // inner loop for second star part
            for (int j = 2; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        // outer loop for lower part
        for (int i = n; i >= 1; i--) {
            // inner loop for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }

            // inner loop for star printing in first part
            for (int j = i; j >= 1; j--) {
                System.out.print(" * ");
            }

            // inner loop for second star part
            for (int j = 2; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------");
        // Solution by yt video

        // Upper part
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}