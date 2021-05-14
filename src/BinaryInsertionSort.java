import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class BinaryInsertionSort {
    private int[] array;

    public BinaryInsertionSort(int[] array){
        this.array = array;

        insertionSort(this.array);
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
        }
    }
}
