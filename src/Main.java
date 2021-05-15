import java.util.List;

public class Main {
    public static void main(String args[]) {

        boolean test = false;
        if (test) {
            int[] array1 = {0, 5, 3, 7, 10, 23, 6, 5, 7, 2};
            QuickSortMedian quickSortMedian1 = new QuickSortMedian(array1);
            System.out.println();
            for (int a : array1) {
                System.out.print(a);
                System.out.print(", ");
            }
            int[] array3 = {0, 5, 3, 7, 10, 23, 6, 5, 7, 2};
            MergeSort mergeSort1 = new MergeSort(array3);
            System.out.println();
            for (int a : array3) {
                System.out.print(a);
                System.out.print(", ");
            }
            int[] array2 = {0, 5, 3, 7, 10, 23, 6, 5, 7, 2};
            QuickSortFirst quickSortFirst1 = new QuickSortFirst(array2);
            System.out.println();
            for (int a : array2) {
                System.out.print(a);
                System.out.print(", ");
            }


            int[] array4 = {0, 5, 3, 7, 10, 23, 6, 5, 7, 2};
            BinaryInsertionSort binaryInsertionSort1 = new BinaryInsertionSort(array4);
            System.out.println();
            for (int a : array4) {
                System.out.print(a);
                System.out.print(", ");
            }
            int[] array5 = {0, 5, 3, 7, 10, 23, 6, 5, 7, 2};
            InsertionSort insertionSort1 = new InsertionSort(array5);
            System.out.println();
            for (int a : array5) {
                System.out.print(a);
                System.out.print(", ");
            }

            int[] array6 = {0, 5, 3, 7, 10, 23, 6, 5, 7, 2, 100};
            CountingSort countingSort = new CountingSort(array6);
            System.out.println();
            for (int a : array6) {
                System.out.print(a);
                System.out.print(", ");
            }
            int[] array7 = {0, 5, 3, 7, 10, 23, 6, 5, 7, 2};
            CountingSort countingSort1 = new CountingSort(array7);
            System.out.println();
            for (int a : array7) {
                System.out.print(a);
                System.out.print(", ");
            }
        }


        if (!test) {
            Inputs inputs = new Inputs();
            List<int[]> ascendingInputs = inputs.getAscendingInputs();
            List<int[]> descendingInputs = inputs.getDescendingInputs();
            List<int[]> randomInputs = inputs.getRandomInputs();

            System.out.println("=== ASCENDING INPUTS ====");
            for (int[] array : ascendingInputs) {
                runAlgorithms(array);
            }

            System.out.println("\n=== DESCENDING INPUTS ====");

            for (int[] array : descendingInputs) {
                runAlgorithms(array);

            }

            System.out.println("\n=== RANDOM INPUTS ====");

            for (int[] array : randomInputs) {
                runAlgorithms(array);

            }
        }

    }


    static void runAlgorithms(int[] array) {
        HeapSort heapSort = new HeapSort(array);
 /*       QuickSortMedian quickSortMedian = new QuickSortMedian(array);
        QuickSortFirst quickSortFirst = new QuickSortFirst(array);
        MergeSort mergeSort = new MergeSort(array);
        BinaryInsertionSort binaryInsertionSort = new BinaryInsertionSort(array);
        InsertionSort insertionSort = new InsertionSort(array);
        CountingSort countingSort = new CountingSort(array);
  */  }


}
