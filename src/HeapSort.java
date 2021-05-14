public class HeapSort {
    private int[] array;

    public HeapSort(int[] array){
        this.array = array;

        heapSort(this.array);

    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public static int[] heapSort(int[] array){
        int length = array.length;

        //build heap(rearrange array)
        for(int i = (length / 2) - 1 ; i >= 0 ;i--){
            //move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            //call max heapify on the reduced heap
            heapify(array, i, 0);
        }
        return array;
    }

    //to heapify a subtree rooted with node i which is an index in array[]. n is size of heap
    public static void heapify(int[] array, int n, int i){
        //initialize largest as root
        int largest = i ;
        //left = 2*i +1
        int l = 2 * i + 1;
        //right= 2*i + 2
        int r = 2 * i + 2;

        //If left child is larger than root
        if(l < n && array[l] > array[largest]){
            largest = l;
        }
        //If right child is larger than largest so far
        if(r < n && array[r] > array[largest])
            largest = r;

        //If largest is not root
        if(largest != i){
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            //Recursively heapify the affected subtree
            heapify(array, n, largest);
        }
    }
}
