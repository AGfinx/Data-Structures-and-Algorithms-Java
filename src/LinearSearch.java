/**
 * LinearSearch class demonstrates the implementation of
 * the Linear Search algorithm in Java.
 *
 * Linear Search checks each element of the array one by one
 * until the target element is found or the array ends.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class LinearSearch {

    /**
     * The main method is the entry point of the program.
     *
     * @param args Command-line arguments (not used here)
     */
    public static void main(String[] args) {

        // Array of integers to search from
        int[] nums = {1, 2, 5, 11, 19, 12, 10, 29};

        // Element to be searched
        int target = 11;

        // Call linearSearch method and store result
        int result = linearSearch(nums, target);

        // Check if element was found
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    /**
     * Performs Linear Search on the given array.
     *
     * @param arr    Array of integers to search
     * @param target Element to be searched
     * @return Index of the target element if found, otherwise -1
     */
    public static int linearSearch(int[] arr, int target) {

        // Traverse the array element by element
        for (int i = 0; i < arr.length; i++) {

            // Compare current element with target
            if (arr[i] == target) {
                return i; // Return index if element is found
            }
        }

        // Return -1 if target element is not found
        return -1;
    }
}