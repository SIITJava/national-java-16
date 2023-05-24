package ro.siit.session21;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;



public class MainCopyFiles {
    public static void main(String[] args) throws Exception {
        Files.copy(Paths.get("src" + File.separator + "main/resources/input.txt"), new FileOutputStream("other.txt"));
    }
}
