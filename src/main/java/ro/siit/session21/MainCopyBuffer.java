package ro.siit.session21;

import java.io.*;

public class MainCopyBuffer {
    public static void main(String[] args) throws IOException {
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            // in = new BufferedReader(new FileReader("src/main/resources/input.txt"));
            in = new BufferedReader(new FileReader(new File("src/main/resources/input.txt")));
            out = new PrintWriter(new FileOutputStream("src/main/resources/output.txt"));
            String val;
            while ((val = in.readLine()) != null) {
                out.write(val);
                out.write("\n");
                System.out.println("copying");
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
