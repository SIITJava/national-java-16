package ro.siit.session2;

public class Factorial {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int factorial = 1;
        for (int i = 2; i<=n; i++){
            factorial = i * factorial;
        }

        System.out.println(n+ "!=" + factorial);

        myPreciousMethod(factorial);
    }

    static void myPreciousMethod(int value){
        System.out.println(2 * value);
    }
}