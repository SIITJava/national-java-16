package ro.siit.session3;

/**
 * This is a javadoc comment
 */
public class Operators {
    public static void main(String[] args) {


        int a = 10;
        a++; // 11//

        a = a + 1; // 12
        int b = a++; // 13
        int c = ++a; // 14
        System.out.println(b); // 12
        System.out.println(c); // 14

        a = a + 5;
        a += 6;

        b = (a < c) ? a : c;
        System.out.println(b);
        System.out.println(Math.min(a, c));
        if (a < c) {
            b = a;
        } else {
            b = c;
        }
        System.out.println(b);

        if (a < c) { // !(a<c)      a >= c

        } else {
            System.out.println("c e mai mic");
        }
    }
}
