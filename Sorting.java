public class Sorting {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = { 7, 8, 3, 1, 2 };
        System.out.println("Original Array:");
        printArray(arr);

        // Bubble Sort ->
        // time complexity = O(n^2)
        for (int i = 0; i < arr.length - 1; i++) { // n - 1
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorting thorugh Bubble Sort: ");
        printArray(arr);

        // Selection Sort ->
        // time complexity = O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }

        System.out.println("Sorting through Selection Sort");
        printArray(arr);

        // Insertion Sort ->
        // time complexity = O(n^2)
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            // placement
            arr[j + 1] = current;
        }

        System.out.println("Sorting through Insertion Sort");
        printArray(arr);
    }
}