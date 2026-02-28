package Sort;

/**
 * SelectionSort class demonstrates the Selection Sort algorithm.
 *
 * Selection Sort repeatedly selects the smallest element
 * from the unsorted portion of the array and places it
 * at the beginning.
 */
public class SelectionSort {

    /**
     * Main method – program entry point.
     * Displays array before and after sorting.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Array to be sorted
        int[] arr = {1, 2, 5, 11, 19, 12, 10, 29, 0, 7};

        // Print array before sorting
        System.out.println("Before sorting:");
        printArray(arr);

        // Sort the array using Selection Sort
        selectionSort(arr);

        // Print array after sorting
        System.out.println("\nAfter sorting:");
        printArray(arr);
    }

    /**
     * Sorts the given array using the Selection Sort algorithm.
     *
     * @param arr array of integers to be sorted
     */
    public static void selectionSort(int[] arr) {

        int n = arr.length;

        // Outer loop selects position where the smallest element should go
        for (int i = 0; i < n - 1; i++) {

            // Assume current index holds the minimum element
            int minIndex = i;

            // Inner loop finds the actual minimum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap only if a smaller element was found
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    /**
     * Prints all elements of the array.
     *
     * @param arr array to be printed
     */
    public static void printArray(int[] arr) {

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}