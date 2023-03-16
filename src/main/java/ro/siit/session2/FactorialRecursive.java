package ro.siit.session2;


// (1*2*3*4)*5
// 5! = 5 * 4!
// n! = n * (n-1)!
// 1! = 1, 0! = 1

public class FactorialRecursive {
    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
    }

    public static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
}
