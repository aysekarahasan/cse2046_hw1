import java.util.List;

public class Main {
    public static void main(String args[]){

        Inputs inputs = new Inputs();
        List<int[]> ascendingInputs = inputs.getAscendingInputs();
        List<int[]> descendingInputs = inputs.getDecendingInputs();
        List<int[]> randomInputs = inputs.getRandomInputs();


    }
    //1.insertion sort
    public static int[] insertionSort(int[] array, int length){
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
        return array;
    }

    //2.Binary insertion sort
    public static int binarySearch(int array[], int item, int low, int high){
        if(high <= low)
            return (item > array[low]) ? (low + 1) : low;

        int mid = (low + high) / 2;
        if(item == array[mid])
            return mid+1;
        if(item > array[mid])
            return binarySearch(array, item, mid + 1 , high);
        return binarySearch(array, item, low, mid - 1);
    }
    public static int[] insertionSortBinary(int[] array, int length){
        int loc, j, k, key;
        for(int i = 1 ; i <length ; i++){
            j = i - 1;
            key = array[i];

            //find the location where key should be inserted.
            loc = binarySearch(array,key,0,j);

            //Move all elements after location to create space
            while(j >= loc){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        return array;
    }

    //3.Merge sort
    public static void merge(int[] array, int l, int r, int m){
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
    public static int[] mergeSort(int[] array, int l, int r){
        if(l < r){
            int m = l + (r - 1)/2;

            //sort first and second halves
            mergeSort(array,l, m);
            mergeSort(array, m+ 1, r);

            merge(array,l,m,r);
        }
        return array;
    }

    //4.Quick sort(pivot is always selected as the first element
    public static int partition(int[] array, int start, int end){
        int pivot = array[start];
        int p1 = start+1;
        int i, temp;

        for(i = start+1; i <= end; i++){
            if(array[i] < pivot){
                if(i != p1){
                    temp = array[p1];
                    array[p1] = array[i];
                    array[i]= temp;
                }
                p1++;
            }
        }
        return p1-1;
    }
    public static int[] quickSort(int[] array, int start, int end){
        int p1;
        if(start<end){
            p1 = partition(array, start, end);
            quickSort(array,start, p1-1);
            quickSort(array, p1+1, end);
        }
        return array;
    }

    //5.Quick sort with median of three pivot selection
    public static int[] medianOfThree(int[] array, int left, int right){
        int mid = (left+right)/2;
        if(array[right] < array[left]){
            swapQuickSort(array, left, right);
        }
        if(array[mid] < array[left]){
            swapQuickSort(array, mid, left);
        }
        if(array[right] < array[mid]){
            swapQuickSort(array, right, mid);
        }
        return array;
    }
    public static void swapQuickSort(int[] array, int left, int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }


    //6.Heap-Sort
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

    //7.Counting sort (bundan emin değilim)
    public static int[] countingSort(int[] array){
        int n = array.length;
        //new output array that will have sorted.
        int output[] = new int[n];

        int count[] = new int[256];
        for(int i = 0 ; i <256; i++){
            count[i] = 0;
        }
        //store count of each character
        for(int i = 0 ; i < n ; i++){
            ++count[array[i]];
        }
        //change count[i] so that count[i] now contains actual position of this character in output array
        for(int i = 1 ; i <= 225 ; i++){
            count[i] += count[i-1];
        }

        for(int i = n-1 ; i >=0 ; i--){
            output[count[array[i] - 1]] = array[i];
            --count[array[i]];
        }
        //copy the output array to array so that array now contains sorted number.
        for(int i = 0 ; i < n ; i++){
            array[i] = output[i];
        }
        return array;
    }

}
