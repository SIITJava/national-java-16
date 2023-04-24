package ro.siit.session14;

public class BubbleSorter {
    public Integer[] sort (Integer[] unsortedArray, boolean ascendent){
        boolean sorted  = false;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < unsortedArray.length - 1; i++) {
                if ((unsortedArray[i] < unsortedArray[i + 1] && (ascendent == false)) ||
                        (unsortedArray[i] > unsortedArray[i + 1] && (ascendent == true))) {
                    sorted = false;
                    int aux = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i + 1];
                    unsortedArray[i + 1] = aux;
                }
            }
        }
        return unsortedArray;
    }
}
