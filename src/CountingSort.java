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

    void countingsort(int[] arrayToBeSorted) {
        int numberOfExistence[] = new int[largestNumber+1];
        int i;
        int j;

        for (i = 0; i < largestNumber; i++) {
            numberOfExistence[i] = 0;
        }
        for (j = 0; j < arrayToBeSorted.length; j++) {
            numberOfExistence[arrayToBeSorted[j]]++;
        }

    }
}
