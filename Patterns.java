public class Patterns {
    public static void main(String args[]) {
        int n = 4;
        int m = 5;

        System.out.println("------------------------------------------------------------------------");

        System.out.println("1. Solid or Ractangle Pattern");
        // 1. Solid Pattern or Ractangle Pattern ->
        // * * * * * *
        // * * * * * *
        // * * * * * *
        // * * * * * *

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= m; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------");

        System.out.println("2. Hollow Ractangle Pattern");
        // 2. Hollow Ractangle Pattern ->
        // * * * * *
        // *       *
        // *       *
        // * * * * *

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= m; j++) {
                // cell -> (i, j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------");

        System.out.println("3. Half Pyramid Pattern");
        // 3. Half Pyramid Pattern ->
        // *
        // * *
        // * * *
        // * * * *

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------");

        System.out.println("4. Inverted Half Pyramid Pattern");
        // 4. Inverted Half Pyramid ->
        // * * * *
        // * * *
        // * *
        // *

        // outer loop
        for (int i = n; i >= 1; i--) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------");

        System.out.println("5. Inverted Half Pyramid Pattern (rotated by 180 deg)");
        // 5. Inverted Half Pyramid Pattern (rotated by 180 deg) ->
        //       *
        //     * *
        //   * * *
        // * * * *

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop -> Space print
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }

            // inner loop -> Star print
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------");

        System.out.println("6. Half Pyramid with Numbers Pattern");
        // 6. Half Pyramid with numbers ->
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        // outer loop
        for (int i = 1; i <= m; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                // System.out.print(j);
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------");

        System.out.println("7. Inverted Half Pyramid with Numbers Pattern");
        // 7. Inverted half Pyaramid with numbers ->
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1

        // outer loop
        for (int i = m; i >= 1; i--) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------");

        System.out.println("8. Floyd's Triangle Pattern");
        // 8. Floyd's Triangle
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        int counter = 1;

        // outer loop
        for (int i = 1; i <= m; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + counter++ + " ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------");

        System.out.println("9. binary (0-1) Triangle Pattern");
        // 9. 0-1 Triangle ->
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

        // outer loop
        for (int i = 1; i <= m; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) { // even
                    System.out.print(" 1 ");
                } else { // odd
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------");
    }
}
