/**
 * MergeSort Algorithm Implementation
 *
 * Time Complexity:
 *   Best Case: O(n log n)
 *   Average Case: O(n log n)
 *   Worst Case: O(n log n)
 *
 * Space Complexity: O(n)
 *
 * Stable sorting algorithm.
 */
public class MergeSort {

    public static void main(String[] args) {

        // Initialize array
        int[] arr = {1, 2, 5, 11, 19, 12, 10, 29};

        // Print array before sorting
        System.out.println("Before Sorting:");
        printArray(arr);

        // Call Merge Sort
        mergeSort(arr, 0, arr.length - 1);

        // Print array after sorting
        System.out.println("\nAfter Sorting:");
        printArray(arr);
    }

    /**
     * Recursively divides the array and sorts it using Merge Sort.
     *
     * @param arr   The array to sort
     * @param left  Starting index
     * @param right Ending index
     * @return Sorted array
     */
    public static int[] mergeSort(int[] arr, int left, int right) {

        // Base condition
        if (left < right) {

            // Find middle index
            int mid = left + (right - left) / 2;

            // Recursively sort left half
            mergeSort(arr, left, mid);

            // Recursively sort right half
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }

        return arr;
    }

    /**
     * Merges two sorted subarrays into a single sorted portion.
     *
     * @param arr   The main array
     * @param left  Starting index
     * @param mid   Middle index
     * @param right Ending index
     */
    private static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        // Copy data to left array
        for (int i = 0; i < n1; i++) {
            lArr[i] = arr[left + i];
        }

        // Copy data to right array
        for (int j = 0; j < n2; j++) {
            rArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        // Merge temporary arrays
        while (i < n1 && j < n2) {

            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left array
        while (i < n1) {
            arr[k++] = lArr[i++];
        }

        // Copy remaining elements of right array
        while (j < n2) {
            arr[k++] = rArr[j++];
        }
    }

    /**
     * Prints array elements in a single line.
     *
     * @param arr Array to print
     */
    public static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}