public class CountingSort {
    public static int findMaxNumberInArray(int[] arrayToBeSorted) {
        int largestNumber = arrayToBeSorted[0];
        for (int i = 0; i < arrayToBeSorted.length; i++) {
            if (arrayToBeSorted[i] > largestNumber) {
                largestNumber = arrayToBeSorted[i];
            }
        }
        return largestNumber;
    }

    public static void countingsort(int[] arrayToBeSorted, int[] B, int largestNumber) {
        int numberOfExistence[] = new int[largestNumber]; // sayma dizisi oluşturuluyor
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
