public class MergeSort {
    private int[] array;
    private int left;
    private int right;
    long duration;

    public MergeSort(int[] array, int left, int right){
        this.array = array;
        this.left = left;
        this.right = right;

        long start = System.nanoTime();
        mergeSort(this.array,this.left,this.right);

        long end = System.nanoTime();
        long duration = (end - start);

        this.duration = duration / 1000;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public void merge(int[] array, int l, int r, int m){
        int a = m - l + 1;
        int b = r - m;

        //temporary arrays. L symbolizes left side, R symbolizes right side.
        int[] L = new int[a];
        int[] R = new int[b];

        //fill the arrays with array's elements correctly.
        for(int i = 0; i < a ; i++){
            L[i] = array[l+i];
        }
        for(int i = 0  ; i < b ; i++ ){
            R[i] = array[m + 1 + i];
        }

        //merge the L[] and R[] back into array[]
        int i = 0; //initial index of L (first subarray)
        int j = 0 ; //initial index of R (sec subarray)
        int k = l ; //initial index of merged subarray
        while( i < a && j < b){
            if(L[i] <= R[j]){
                array[k] = L[i];
                i++;
            }
            else{
                array[k] = R[j];
                j++;
            }
            k++;
        }
        //Copy the remaining elements of L[], if any
        while(i < a){
            array[k] = L[i];
            i++;
            k++;
        }
        //Copy the remaining elements of R[], if any
        while(j < b){
            array[k] = R[j];
            j++;
            k++;
        }
    }
    //l is for left index and r is right index of the sub array of array to be sorted.
    public void mergeSort(int[] array, int l, int r){
        if(l < r){
            int m = l + (r - 1)/2;

            //sort first and second halves
            mergeSort(array,l, m);
            mergeSort(array, m+ 1, r);

            merge(array,l,m,r);
        }
    }
}
