import java.util.List;

public class Main {
    public static void main(String args[]){

      /*  Inputs inputs = new Inputs();
        List<int[]> ascendingInputs = inputs.getAscendingInputs();
        List<int[]> descendingInputs = inputs.getDescendingInputs();
        List<int[]> randomInputs = inputs.getRandomInputs();*/
        int[] array = {0,5,3,7,10,23,6,5,7,2};

        HeapSort heapSort = new HeapSort(array);
        System.out.println();
        for( int a : array){
            System.out.print(a);
            System.out.print(", ");
        }
        int[] array1 =  {0,5,3,7,10,23,6,5,7,2};
        QuickSortMedian quickSortMedian = new QuickSortMedian(array1,0, array1.length - 1);
        System.out.println();
        for( int a : array1){
            System.out.print(a);
            System.out.print(", ");
        }
        int[] array2 =  {0,5,3,7,10,23,6,5,7,2};
        QuickSortFirst quickSortFirst = new QuickSortFirst(array2,0, array2.length - 1);
        System.out.println();
        for( int a : array2){
            System.out.print(a);
            System.out.print(", ");
        }
        int[] array3 =  {0,5,3,7,10,23,6,5,7,2};
        MergeSort mergeSort = new MergeSort(array3, 0, array3.length - 1);
        System.out.println();
        for( int a : array3){
            System.out.print(a);
            System.out.print(", ");
        }
        int[] array4 =  {0,5,3,7,10,23,6,5,7,2};
        BinaryInsertionSort binaryInsertionSort = new BinaryInsertionSort(array4);
        System.out.println();
        for( int a : array4){
            System.out.print(a);
            System.out.print(", ");
        }
        int[] array5=  {0,5,3,7,10,23,6,5,7,2};
        InsertionSort insertionSort = new InsertionSort(array5,array5.length);
        System.out.println();
        for( int a : array5){
            System.out.print(a);
            System.out.print(", ");
        }
    }

}
