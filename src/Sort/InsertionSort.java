package Sort;

/**
 * InsertionSort.java
 *
 * This program demonstrates the Insertion Sort algorithm.
 *
 * Insertion Sort works by dividing the array into a sorted and
 * unsorted portion. It repeatedly picks an element from the
 * unsorted portion and inserts it into its correct position
 * in the sorted portion.
 *
 * Characteristics:
 * - Stable sorting algorithm
 * - In-place sorting (no extra memory required)
 *
 * Time Complexity:
 *   Best Case    : O(n)      (Already sorted array)
 *   Average Case : O(n^2)
 *   Worst Case   : O(n^2)    (Reverse sorted array)
 *
 * Space Complexity:
 *   O(1)  → Constant extra space
 *
 * Author: Abhijeet Giri
 */
public class InsertionSort {

    /**
     * Main method – entry point of the program.
     * Creates an array, prints it, sorts it,
     * and prints the sorted result.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Initialize array
        int[] arr = {1, 2, 5, 11, 19, 12, 10, 29};

        // Print array before sorting
        System.out.println("Before Sorting:");
        printArray(arr);

        // Call insertion sort method
        insertionSort(arr);

        // Print array after sorting
        System.out.println("\nAfter Sorting:");
        printArray(arr);
    }

    /**
     * Sorts the given array using the Insertion Sort algorithm.
     *
     * Algorithm Steps:
     * 1. Assume the first element is already sorted.
     * 2. Pick the next element (key).
     * 3. Compare the key with previous elements.
     * 4. Shift larger elements to the right.
     * 5. Insert the key at its correct position.
     *
     * @param arr the array to be sorted
     */
    public static void insertionSort(int[] arr) {

        // Traverse from index 1 to end of array
        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];      // Current element to be inserted
            int j = i - 1;         // Index of last element in sorted portion

            // Move elements of arr[0…i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];  // Shift element to the right
                j--;
            }

            // Place key at its correct position
            arr[j + 1] = key;
        }
    }

    /**
     * Prints all elements of the array in a single line.
     *
     * @param arr the array to be printed
     */
    public static void printArray(int[] arr) {

        // Enhanced for-loop to print elements
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Move to next line after printing array
        System.out.println();
    }
}