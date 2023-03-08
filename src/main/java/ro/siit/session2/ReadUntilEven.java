package ro.siit.session2;

import java.util.Scanner;

public class ReadUntilEven {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        do {
            System.out.println("Type a number");
            number = Integer.parseInt(keyboard.nextLine());
        } while (number % 2 != 0);
    }
}
