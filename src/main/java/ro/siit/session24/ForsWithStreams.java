package ro.siit.session24;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ForsWithStreams {
    public static void main(String[] args) {
        Supplier<IntStream> noFromOneToTenSupplier = () -> IntStream.range(1, 100);

        noFromOneToTenSupplier.get().filter(n -> n%17 == 0)
                .forEach(System.out::println);

        noFromOneToTenSupplier.get().filter(n -> n%5 == 0)
                .forEach(System.out::println);
    }
}
