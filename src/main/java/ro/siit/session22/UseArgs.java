package ro.siit.session22;

public class UseArgs {
    public static void main(String[] args) {
        if(args.length > 0) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("All good!");
        }

        try {
            System.out.println(args[10]);
            System.out.println("All good again!");
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Sorry");
        }
    }
}
