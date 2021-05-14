public class QuickSortMedian {
    private int[] array;
    private int left;
    private int right;
    long duration;

    public QuickSortMedian(int[] array){
        this.array=array;
        this.left =0;
        this.right = array.length-1;

        long start = System.nanoTime();
        quickSort(this.array,this.left,this.right);

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
    public void quickSort(int[] array, int left, int right){
        if(left >= right)
            return;

        int pivot = getMedian(array,left,right);
        int partiation = partition(array,left,right);

        quickSort(array,0, partiation-1);
        quickSort(array,partiation+1,right);
    }
    public int partition(int[] array, int start, int end){
        int pivot = array[start];
        while(start <= end){
            while(array[start] < pivot)
                start++;
            while (array[end] > pivot)
                end--;
            if(start<=end){
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }
        return start;
    }
    public int getMedian(int[] array, int left, int right){
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
        return mid;
    }
    public static void swapQuickSort(int[] array, int left, int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
