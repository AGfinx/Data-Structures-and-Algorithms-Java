public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 11, 19, 12, 10, 29};


        // Print array before sorting
        System.out.println("Before sorting:");
        printArray(arr);

        // Sort the array using Selection Sort
        insertionSort(arr);

        // Print array after sorting
        System.out.println("\nAfter sorting:");
        printArray(arr);
    }

    public static int[] insertionSort(int[] arr){

        return arr;
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
