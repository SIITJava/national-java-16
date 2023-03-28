package ro.siit.session7.interfaces.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KeyboardReadSorter extends Sorter{
    @Override
    void readArray() {
        List<Integer> nrs = new ArrayList<>();
        Scanner kezboard = new Scanner(System.in);
        int inputNr;
        do {
            System.out.println("Dati nr");
            String input = kezboard.nextLine();
            inputNr = Integer.valueOf(input);
            nrs.add(inputNr);
        }while(inputNr != 0);

        int[] numbers = new int[nrs.size()];
        int k = 0;
        for(Integer n: nrs){
            numbers[k++] = n;
        }
        setArray(numbers);
    }
}
