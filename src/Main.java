import java.util.List;

public class Main {
    public static void main(String args[]) {

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


    static void runAlgorithms(int[] array) {
        HeapSort heapSort = new HeapSort(array);
        QuickSortMedian quickSortMedian = new QuickSortMedian(array);
        MergeSort mergeSort = new MergeSort(array);
        BinaryInsertionSort binaryInsertionSort = new BinaryInsertionSort(array);
        CountingSort countingSort = new CountingSort(array);
        InsertionSort insertionSort = new InsertionSort(array);
        QuickSortFirst quickSortFirst = new QuickSortFirst(array);


    }


}
