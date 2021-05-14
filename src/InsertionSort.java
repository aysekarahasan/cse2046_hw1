public class InsertionSort {
    private int[] array;
    private int length;

    public InsertionSort(int[] array, int length){
        this.array = array;
        this.length = length;

        insertionSorting(this.array,this.length);
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void insertionSorting(int[] array, int length){
        int key, j;
        for(int i = 0 ; i < length ; i++){

            key = array[i];
            j = i - 1;

            while (j >= 0 && array[j] > key){

                array[j+1] = array[j];
                j -= 1;
            }
            array[j + 1] = key;
        }
    }
}
