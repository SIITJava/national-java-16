package ro.siit.session24;

import java.util.stream.IntStream;

public class Exer3 {
    public static void main(String[] args) {
        IntStream.range(1, 10)
                .map(nr -> nr * 2)
                .forEach(System.out::println);
    }
}
