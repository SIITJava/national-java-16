package ro.siit.session14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class BubbleSorterTest {
    @Test
    public void sort_asc_works(){
        Random randomizer = new Random();
        int length = randomizer.nextInt(10, 20);
        Integer[] array = new Integer[length];
        for (int i = 0; i < length; i++) {
            array[i] = randomizer.nextInt(100);
        }

        Integer[] copy = Arrays.copyOf(array, array.length);
        Comparator<Integer> ascComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
        Arrays.sort(copy, ascComparator);


        BubbleSorter bubbleSorter = new BubbleSorter();
        Integer[] sortedArray = bubbleSorter.sort(array, true);

        Assertions.assertArrayEquals(sortedArray, copy);
    }

    @Test
    public void sort_desc_works(){
        Random randomizer = new Random();
        int length = randomizer.nextInt(10, 20);
        Integer[] array = new Integer[length];
        for (int i = 0; i < length; i++) {
            array[i] = randomizer.nextInt(100);
        }

        Integer[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy, (o1, o2) -> o2 - o1);


        BubbleSorter bubbleSorter = new BubbleSorter();
        Integer[] sortedArray = bubbleSorter.sort(array, false);

        Assertions.assertArrayEquals(sortedArray, copy);
    }
}
