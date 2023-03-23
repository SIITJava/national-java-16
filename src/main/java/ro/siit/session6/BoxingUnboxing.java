package ro.siit.session6;

public class BoxingUnboxing {
    public static void main(String[] args) {
        int i = 10;
        // Integer j = Integer.valueOf(i);
        Integer j = i;
        j.hashCode();

        System.out.println(i == j.intValue());
        System.out.println(i == j);

        int l = 0;
        l++;

        Integer k = null;
       // k = k + 1; // Cannot invoke "java.lang.Integer.intValue()" because "k" is null
    }
}
