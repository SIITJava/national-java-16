package ro.siit.session22;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class UserInteraction {
    static Logger LOGGER = LogManager.getLogger(UserInteraction.class);
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dati numele");
        String nume = keyboard.nextLine();
        System.out.println("Dati varsta");
        Integer varsta = null;
        String varstaAsString = keyboard.nextLine();
        try {
            varsta = Integer.parseInt(varstaAsString);
        } catch (NumberFormatException numberFormatException){
            LOGGER.error("Userul " + nume + " a introdus varsta " + varstaAsString,
                     numberFormatException);
        }
        System.out.println(nume + ":" + varsta);
        LOGGER.info("Userul " + nume + " a introdus varsta transformat in int " + varsta);
    }
}
