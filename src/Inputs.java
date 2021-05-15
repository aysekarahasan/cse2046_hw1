import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Inputs {

    int[] SIZES = new int[100];

    Inputs(){

        for(int i=0;i<100;i++){
            SIZES[i] = (int) Math.pow(i+1,2);
        }
    }

    List<int[]> getAscendingInputs() {

        List<int[]> inputs = new ArrayList<>();
        for (int i = 0; i < SIZES.length; i++) {

            inputs.add(ascendingInputs(SIZES[i]));
        }
        return inputs;
    }

    private int[] ascendingInputs(int size) {
        /*
        Returns input starting from LOWER up to UPPER_BOUND
        ex: [ 0 1 2 3 4 5 .... 10.000]
         */

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }


    List<int[]> getDescendingInputs() {

        List<int[]> inputs = new ArrayList<>();
        for (int i = 0; i < SIZES.length; i++) {

            inputs.add(descendingInputs(SIZES[i]));
        }
        return inputs;
    }

    private int[] descendingInputs(int size) {
        /*
        Returns input starting from UPPER up to LOWER_BOUND
        ex: [10.000 9.999   ...... 3 2 1]
         */

        int[] array = new int[size];

        for (int i = array.length-1; i >= 0; i--) {
            array[array.length - i - 1] = i;
        }
        return array;
    }

    List<int[]> getRandomInputs() {

        List<int[]> inputs = new ArrayList<>();
        for (int i = 0; i < SIZES.length; i++) {

            inputs.add(randomInputs(SIZES[i]));
        }
        return inputs;
    }


    private int[] randomInputs(int size) {

        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(size);
        }
        return array;
    }


}