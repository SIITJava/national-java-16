package ro.siit.session2;

public class Equation {
    public static void main(String[] args) {
        // a * x = b
        double a = 3;
        double b = 2;

        // double x = b / a;

        if(a == 0 && b == 0){
            System.out.println("O infinitate de solutii");
        } else if (a == 0 && b != 0){
            System.out.println("Nicio solutie");
        } else {
            double x = b / a;
            System.out.println(x);
        }
    }
}
