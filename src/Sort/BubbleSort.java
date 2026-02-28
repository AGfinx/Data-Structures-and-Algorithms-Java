package Sort;

/**
 * BubbleSort class demonstrates the Bubble Sort algorithm.
 *
 * Bubble Sort repeatedly compares adjacent elements and swaps them
 * if they are in the wrong order. With each pass, the largest element
 * "bubbles" to the end of the array.
 */
public class BubbleSort {

    /**
     * Main method – program entry point.
     * It displays the array before and after sorting.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Array to be sorted
        int[] arr = {1, 2, 5, 11, 19, 12, 10, 29, 0, 7};

        // Print array before sorting
        System.out.println("Before sorting:");
        printArray(arr);

        // Sort the array using Bubble Sort
        bubbleSort(arr);

        // Print array after sorting
        System.out.println("\nAfter sorting:");
        printArray(arr);
    }

    /**
     * Sorts an array using the Bubble Sort algorithm.
     *
     * @param arr array of integers to be sorted
     */
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        // Outer loop controls number of passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop compares adjacent elements
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if elements are in wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Prints all elements of the array.
     *
     * @param arr array to be printed
     */
    public static void printArray(int[] arr) {

        // Enhanced for-loop to print elements
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}