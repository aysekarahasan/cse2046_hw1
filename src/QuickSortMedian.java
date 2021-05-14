public class QuickSortMedian {
    private int[] array;
    private int left;
    private int right;

    public QuickSortMedian(int[] array, int left, int right){
        this.array=array;
        this.left =left;
        this.right = right;

        quickSort(this.array,this.left,this.right);
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
    }
    public static void swapQuickSort(int[] array, int left, int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
