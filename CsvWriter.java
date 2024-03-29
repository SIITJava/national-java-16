package calc.rate;

import java.io.FileWriter;
import java.io.IOException;

public class CsvWriter {
    private FileWriter fileWriter;

    public CsvWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }
    public void writeHeader() throws IOException {
        fileWriter.append("Month");
        fileWriter.append(",");
        fileWriter.append("CreditIpotecar");
        fileWriter.append(",");
        fileWriter.append("Balance");
        fileWriter.append(",");
        fileWriter.append("Interest");
        fileWriter.append(",");
        fileWriter.append("Paid Amount");
        fileWriter.append("\n");


    }

    public void writeRecord(int month, double creditIpotecar, double balance, double interest, double paidAmount) throws IOException {
        fileWriter.append(String.valueOf(month));
        fileWriter.append(",");
        fileWriter.append(String.valueOf(creditIpotecar));
        fileWriter.append(",");
        fileWriter.append(String.valueOf(balance));
        fileWriter.append(",");
        fileWriter.append(String.valueOf(interest));
        fileWriter.append(",");
        fileWriter.append(String.valueOf(paidAmount));
    }

    public void closeFile() throws IOException {
        fileWriter.close();

    }

}

