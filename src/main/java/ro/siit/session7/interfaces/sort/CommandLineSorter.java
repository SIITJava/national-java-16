package ro.siit.session7.interfaces.sort;

public class CommandLineSorter extends Sorter{
    private String[] numbers;
    CommandLineSorter(String[] numbers){
        this.numbers = numbers;
    }
    @Override
    void readArray() {
        int[] nrs = new int[numbers.length];
        for(int i = 0; i< numbers.length ; i++){
            nrs[i] = Integer.parseInt(numbers[i]);
        }
        setArray(nrs);
    }
}
