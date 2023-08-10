package calc.rate;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {

    static final int MONTHS_IN_YEAR = 12;
    static final int PERCENT = 100;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        CsvWriter csvWriter;

        try {
            //Instantiem resursele necesare
            FileWriter writer = new FileWriter(FileProvider.getFile());
            csvWriter = new CsvWriter(writer);
            //Scrie header ul tabelului
            csvWriter.writeHeader();
        }catch (IOException e){
            System.out.println("A apărut o eroare la inițializarea CsvWriter:" + e.getMessage());;
            return;
        }

        System.out.println("Va rugam introduceti suma: ");

        int amount;
        int period;
        double interestRate;
//Citim din consola suma imprumutata
        try{
            amount = Integer.parseInt(scanner.nextLine());

        }catch (NumberFormatException e){
            System.out.println("Suma este obligatorie sa fie numerica!");
            return;

        }


        System.out.println("Vă rugăm să introduceți perioada de încărcare în ani: ");

        try{
            period = Integer.parseInt(scanner.nextLine());

        }catch(NumberFormatException e){
            System.out.println("Perioada este obligatorie sa fie numerica!");
            return;
        }



        System.out.println("Vă rugăm să introduceți rata anuală a dobânzii");

        //Citim din consola rata anuala a dobanzii

        try{
            interestRate = Double.parseDouble(scanner.nextLine());

        }catch(NumberFormatException e){
            System.out.println("Perioada este obligatorie sa fie numerica!");
            return;


        }
        // Calculam valorile pt fiecare luna in parte
        double balance = amount;
        for(int month = 1; month<=period * MONTHS_IN_YEAR; month++){
            double lastMonthBalance = balance;
            double monthlyCredituluiIpotecar = calculateCreditIpotecar(amount, period, interestRate);
            double montlyInteresRate = calculateInterest(lastMonthBalance, interestRate);
            double paidAmount = monthlyCredituluiIpotecar - montlyInteresRate;

            balance = (lastMonthBalance - paidAmount) < 0 ? 0 : (lastMonthBalance - paidAmount) ;

            System.out.println("Month: " + month + " | " + " CreditIpotecar: " + monthlyCredituluiIpotecar + " | " +
                    "Interest: " + montlyInteresRate + " | " + "Paid Amount " + paidAmount + " | " + "Balance: " +balance);

             try{
                 csvWriter.writeRecord(month, monthlyCredituluiIpotecar, balance, montlyInteresRate, paidAmount);

             }catch (IOException e){
                 System.out.println("Eroare la scrierea fișierului csv:" + e.getMessage());
             }



        }
        try{
            csvWriter.closeFile();
        }catch(IOException e){
            System.out.println("Ceva a mers prost când ați încercat să închideți fișierul csv.:" +e.getMessage());

        }


    }
    //Calculul ratei lunare

    private static double calculateCreditIpotecar(int amount, int period, double interestRate){
       double monthlyRate = interestRate / PERCENT / MONTHS_IN_YEAR;
       return (monthlyRate * amount) / (1 - Math.pow(1 + monthlyRate,  (-period *MONTHS_IN_YEAR)));

    }

    //Calculul dobanzii pe o luna

    private static double calculateInterest(double balance, double interestRate){
        double interestPerYear = balance * interestRate / PERCENT;
        return interestPerYear / MONTHS_IN_YEAR;

    }
}
