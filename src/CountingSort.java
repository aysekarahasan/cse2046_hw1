public class CountingSort {

    int[] array;
    int count;
    long duration;
    int largestNumber;

    CountingSort(int[] array) {

        this.array = array;
        this.count = 0;

        findMaxNumberInArray(array);
        long start = System.nanoTime();
        countingsort(this.array);
        long end = System.nanoTime();
        long duration = (end - start);

        this.duration = duration / 1000;
        System.out.println("CountingSort duration is "+ this.duration);
    }

    void findMaxNumberInArray(int[] array) {
        int largestNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largestNumber) {
                largestNumber = array[i];
            }
        }
        this.largestNumber = largestNumber;
    }

    int[] countingsort(int[] arrayToBeSorted) {
        int numberOfExistence[] = new int[largestNumber+1];
        int result[] = new int[arrayToBeSorted.length];

        for (int i = 0; i < largestNumber; i++) {
            numberOfExistence[i] = 0;
        }

        for (int j = 0; j < arrayToBeSorted.length; j++) {
            count++;
            numberOfExistence[arrayToBeSorted[j]]++;
        }
        for( int i = 1; i <= largestNumber; i++){
        numberOfExistence[i] += numberOfExistence[i-1];
        }
        for(int k = arrayToBeSorted.length - 1; k >= 0; k--){
            result[numberOfExistence[arrayToBeSorted[k]] - 1] = arrayToBeSorted[k];
            numberOfExistence[arrayToBeSorted[k]]--;
        }
        for(int i = 0; i < arrayToBeSorted.length; i++){
            arrayToBeSorted[i] = result[i];
        }

        return result;
    }
}
