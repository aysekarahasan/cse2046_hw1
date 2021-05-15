import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class BinaryInsertionSort {
    private int[] array;
    long duration;
    int count;

    public BinaryInsertionSort(int[] array){
        this.array = array;
        this.count = 0;

        long start = System.nanoTime();
        insertionSort(this.array);
        long end = System.nanoTime();
        long duration = (end - start);

        this.duration = duration / 1000;
        System.out.println("BinaryInsertionSort duration is "+ this.duration);
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++)
        {
            int x = array[i];

            // Find location to insert
            // using binary search
            int j = Math.abs(
                    Arrays.binarySearch(array, 0,
                            i, x) + 1);

            // Shifting array to one
            // location right
            System.arraycopy(array, j,
                    array, j + 1, i - j);

            // Placing element at its
            // correct location
            array[j] = x;
            count++;
        }
    }
}
