public class MergeSort {
    public static void main(String[] args){


        // Initialize array
        int[] arr = {1, 2, 5, 11, 19, 12, 10, 29};

        // Print array before sorting
        System.out.println("Before Sorting:");
        printArray(arr);

        // Call  Merge Sort method
        mergeSort(arr, 0, arr.length - 1);

        // Print array after sorting
        System.out.println("\nAfter Sorting:");
        printArray(arr);

    }

    public static int[] mergeSort(int[] arr, int left, int right) {

        return arr;
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
