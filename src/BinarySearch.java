import java.util.Arrays;

/**
 * BinarySearch class demonstrates the implementation of
 * the Binary Search algorithm using an iterative approach.
 * <p>
 * Binary Search works only on a sorted array.
 */
public class BinarySearch {

    /**
     * The main method is the entry point of the program.
     * It sorts the array, searches for a target element,
     * and prints the result.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Array of integers (unsorted)
        int[] nums = {1, 2, 5, 11, 19, 12, 10, 29};

        // Element to be searched
        int target = 19;

        // Sort the array because Binary Search requires sorted data
        Arrays.sort(nums);

        // Call binarySearch method
        int result = binarySearch(nums, target);

        // Display result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    /**
     * Performs Binary Search on a sorted array.
     *
     * @param arr    sorted integer array
     * @param target element to be searched
     * @return index of target if found, otherwise -1
     */
    public static int binarySearch(int[] arr, int target) {

        // Starting index of the array
        int start = 0;

        // Ending index of the array
        int end = arr.length - 1;

        // Loop until start index crosses end index
        while (start <= end) {

            // Calculate middle index (avoids overflow)
            int mid = start + (end - start) / 2;

            // If target is found at mid
            if (arr[mid] == target) {
                return mid;
            }
            // If target is greater, ignore left half
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                end = mid - 1;
            }
        }

        // Target element not found
        return -1;
    }
}