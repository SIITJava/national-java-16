package ro.siit.session7.interfaces.sort;

import java.util.Arrays;

public abstract class Sorter {
    private int[] array;

    abstract void readArray();

    public final int[] sort(){
        // very complex algorithm
        Arrays.sort(array);
        return array;
    }

    protected void setArray(int[] array){
        this.array = array;
    }
}
