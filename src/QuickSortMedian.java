public class QuickSortMedian {
    private int[] array;
    private int left;
    private int right;
    long duration;

    public QuickSortMedian(int[] array) {
        this.array = array;
        this.left = 0;
        this.right = array.length - 1;

        long start = System.nanoTime();
        medianQuickSort(this.array, this.left, this.right);

        long end = System.nanoTime();
        long duration = (end - start);

        this.duration = duration / 1000;
    }

    public static void medianQuickSort(int arr[], int low, int high) {
        if (low >= high)
            return;

        if (low < high) {

            //int pi = medianPivot(arr, low, high);

            QuickSort(arr, low, high);

        }
    }

    public static void QuickSort(int arr[], int low, int high) {

        if (low < high) {
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            QuickSort(arr, low, pi - 1);
            QuickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;

    }
}
