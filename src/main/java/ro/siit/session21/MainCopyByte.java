package ro.siit.session21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainCopyByte {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("src/main/resources/input.txt");
            out = new FileOutputStream("src/main/resources/output.txt");
            int val;
            while ((val = in.read()) != -1) {
                out.write(val);
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
