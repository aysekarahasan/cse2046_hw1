import java.util.Random;

class Inputs {

    final int LOWER_BOUND = 0;
    final int UPPER_BOUND = 10000;

    int[] ascendingInputs() {
        /*
        Returns input starting from LOWER up to UPPER_BOUND
        ex: [ 0 1 2 3 4 5 .... 10.000]
         */

        int[] array = new int[UPPER_BOUND - LOWER_BOUND];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    int[] descendingInputs() {
        /*
        Returns input starting from UPPER up to LOWER_BOUND
        ex: [10.000 9.999   ...... 3 2 1]
         */

        int[] array = new int[UPPER_BOUND - LOWER_BOUND];

        for (int i = array.length; i > 0; i--) {
            array[i] = i;
        }
        return array;
    }


    int[] randomInputs() {

        Random random = new Random();
        int[] array = new int[UPPER_BOUND - LOWER_BOUND];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND;
        }
        return array;
    }

    int[] sameInputs() {

        Random random = new Random();
        int[] array = new int[UPPER_BOUND - LOWER_BOUND];
        int value = random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND;
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
        return array;

    }


}