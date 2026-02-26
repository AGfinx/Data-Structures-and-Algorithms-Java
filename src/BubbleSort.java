public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 5, 11, 19, 12, 10, 29, 0, 7};

        System.out.println("Before sorting: ");
        printArray(arr);

        arr = bubbleSort(arr);

        System.out.println("\nAfter sorting: ");
        printArray(arr);

    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
