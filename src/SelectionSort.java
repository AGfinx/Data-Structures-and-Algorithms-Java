public class SelectionSort {
    public static void main(String[] args) {
        // Array to be sorted
        int[] arr = {1, 2, 5, 11, 19, 12, 10, 29, 0, 7};

        // Print array before sorting
        System.out.println("Before sorting:");
        printArray(arr);

        // Sort the array using selection Sort
        selectionSort(arr);

        // Print array after sorting
        System.out.println("\nAfter sorting:");
        printArray(arr);
    }

    public static int[] selectionSort(int[] arr) {

        int n = arr.length;

        return arr;
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
