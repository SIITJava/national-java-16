package ro.siit.session24;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exer2 {
    public static void main(String[] args) {
        IntStream.range(0, 10)
                .filter(n -> isPrimeNoFor(n))
                .forEach(System.out::println);
    }

    static boolean isPrime(int n){
//        for(int i = 2; i <= Math.sqrt(n); i++){
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isPrimeNoFor(int n){
        int sum = IntStream.range(2, (int)Math.sqrt(n) + 1)
                .filter(i -> n % i == 0)
                .sum();
        return sum == 0;
    }
}
