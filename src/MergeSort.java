public class MergeSort {
    private int[] array;
    private int left;
    private int right;
    double duration;
    int count;

    public MergeSort(int[] array){
        this.array = array;
        this.left = 0;
        this.right = array.length - 1;

        long start = System.nanoTime();
        mergeSort(this.array,this.left,this.right);

        long end = System.nanoTime();
        long duration = (end - start);

        this.duration = (double) duration / 1_000_000;
        System.out.println(this.getClass().getName()+ "  "+array.length + "  "+ this.duration + " " + count);

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
            count++;
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
            count++;

            int m = (l + r)/2;

            //sort first and second halves
            mergeSort(array,l, m);
            mergeSort(array, m+ 1, r);

            merge(array,l,r,m);
        }
    }
}
