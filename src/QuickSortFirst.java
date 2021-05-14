public class QuickSortFirst {
    private int[] array;
    private int start;
    private int end;
    long duration;

    public QuickSortFirst(int[] array){
        this.array = array;
        this.start = 0;
        this.end =array.length-1;

        long startTime = System.nanoTime();
        quickSort(this.array,this.start,this.end);


        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        this.duration = duration / 1000;
        System.out.println("QuickSortFirst duration is "+ this.duration);
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
        while(start<=end) {
            while(array[start] < pivot)
                start++;
            while(array[end] > pivot)
                end--;
            if(start<=end) {
                int tmp = array[start];
                array[start] = array[end];
                array[end] = tmp;
                start++;
                end--;
            }
        }
        return start;
    }
    public void quickSort(int[] array, int start, int end){
        int p1= partition(array, start, end);
        if(start<p1-1){
            quickSort(array,start, p1-1);
        }
        if(end > p1){
            quickSort(array,p1,end);
        }
    }
}
