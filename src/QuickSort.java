
public class QuickSort {
    public static  void main(String[] args){


        // Initialize array
        int[] arr = {1, 2, 5, 11, 19, 12, 10, 29};

        // Print array before sorting
        System.out.println("Before Sorting:");
        printArray(arr);

        // Call insertion sort method
        quickSort(arr, 0, arr.length);

        // Print array after sorting
        System.out.println("\nAfter Sorting:");
        printArray(arr);

    }

    public static int[] quickSort(int[] arr, int low, int high){

        return arr;
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
