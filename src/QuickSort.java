/**
 * QuickSort Algorithm Implementation in Java
 *
 * QuickSort is a Divide and Conquer algorithm.
 * It selects a pivot element and partitions the array
 * such that:
 *  - Elements smaller than pivot go to left
 *  - Elements greater than pivot go to right
 *
 * Time Complexity:
 *  - Best Case: O(n log n)
 *  - Average Case: O(n log n)
 *  - Worst Case: O(n^2)
 *
 * Space Complexity: O(log n) (due to recursion stack)
 */
public class QuickSort {

    public static void main(String[] args) {

        // Initialize array
        int[] arr = {1, 2, 5, 11, 19, 12, 10, 29};

        // Print array before sorting
        System.out.println("Before Sorting:");
        printArray(arr);

        // Call QuickSort method
        quickSort(arr, 0, arr.length - 1);

        // Print array after sorting
        System.out.println("\nAfter Sorting:");
        printArray(arr);
    }

    /**
     * Recursive QuickSort function.
     *
     * @param arr  Array to be sorted
     * @param low  Starting index
     * @param high Ending index
     */
    public static void quickSort(int[] arr, int low, int high) {

        // Base condition
        if (low > high) {

            // Partition the array and get pivot index
            int pi = partition(arr, low, high);

            // Recursively sort elements before pivot
            quickSort(arr, low, pi - 1);

            // Recursively sort elements after pivot
            quickSort(arr, pi + 1, high);
        }
    }

    /**
     * Partitions the array around a pivot element.
     *
     * @param arr  Array to be partitioned
     * @param low  Starting index
     * @param high Ending index (pivot element)
     * @return index of pivot after partition
     */
    private static int partition(int[] arr, int low, int high) {

        // Choose last element as pivot
        int pivot = arr[high];

        // Index of smaller element
        int i = low - 1;

        // Traverse array and rearrange elements
        for (int j = low; j < high; j++) {

            // If current element is smaller than pivot
            if (arr[j] < pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /**
     * Prints all elements of the array in a single line.
     *
     * @param arr the array to be printed
     */
    public static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}