public class QuickSortFirst {
    private int[] array;
    private int start;
    private int end;

    public QuickSortFirst(int[] array, int start, int end){
        this.array = array;
        this.start = start;
        this.end =end;

        quickSort(this.array,this.start,this.end);
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int partition(int[] array, int start, int end){
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
    public void quickSort(int[] array, int start, int end){
        int p1;
        if(start<end){
            p1 = partition(array, start, end);
            quickSort(array,start, p1-1);
            quickSort(array, p1+1, end);
        }
    }
}
