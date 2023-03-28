package ro.siit.session7.interfaces.sort;

public class Main {
    public static void main(String[] args) {
        CommandLineSorter cls = new CommandLineSorter(args);
        cls.readArray();
        printArray(cls.sort());

        KeyboardReadSorter krs = new KeyboardReadSorter();
        krs.readArray();
        printArray(krs.sort());
    }

    static void printArray(int[] sir){
        System.out.print("[");
        for (int n: sir) {
            System.out.print(n+ ", ");
        }
        System.out.print("]");
        System.out.println();
    }
}
