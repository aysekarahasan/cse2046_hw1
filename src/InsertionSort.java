public class InsertionSort {
    private int[] array;
    private int length;
    double duration;
    int count;


    public InsertionSort(int[] array){
        this.array = array;
        this.length = array.length;

        long start = System.nanoTime();
        insertionSorting(this.array,this.length);


        long end = System.nanoTime();
        long duration = (end - start);

        this.duration = (double) duration /100000;
        System.out.println(this.getClass().getName()+ "  "+array.length + "  "+ this.duration + " " + count);



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
                count++;
                array[j+1] = array[j];
                j -= 1;
            }
            array[j + 1] = key;
        }
    }
}
