import java.util.List;

public class Main {
    public static void main(String args[]){

      Inputs inputs = new Inputs();
        List<int[]> ascendingInputs = inputs.getAscendingInputs();
        List<int[]> descendingInputs = inputs.getDescendingInputs();
        List<int[]> randomInputs = inputs.getRandomInputs();

        int[] array = ascendingInputs.get(0);

        HeapSort heapSort = new HeapSort(array);

        QuickSortMedian quickSortMedian = new QuickSortMedian(array);

        QuickSortFirst quickSortFirst = new QuickSortFirst(array);

        MergeSort mergeSort = new MergeSort(array);

        BinaryInsertionSort binaryInsertionSort = new BinaryInsertionSort(array);

        InsertionSort insertionSort = new InsertionSort(array);
        }


}
