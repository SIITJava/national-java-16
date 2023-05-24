package ro.siit.session21;

import java.io.File;
import java.util.Scanner;

public class SystemStreams {
    public static void main(String[] args) {
        System.out.println("Out");
        System.err.println("error");

        Scanner keyboard = new Scanner(System.in);

        System.out.println(File.separator);
        System.out.println(File.pathSeparator);
    }
}
