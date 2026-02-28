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

        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }

        return arr;
    }

    private static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        for (int x = 0; x < n1; x++) {
            lArr[x] = arr[left + x];
        }
        for (int x = 0; x < n2; x++) {
            rArr[x] = arr[mid + 1 + x];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            }
            else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }
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
