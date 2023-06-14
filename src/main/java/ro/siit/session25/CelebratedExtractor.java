package ro.siit.session25;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class CelebratedExtractor {
    public static void main(String[] args) throws IOException {
        int filteredMonth = 1;
        List<String> processedEntries = Files.readAllLines(Paths.get("src/main/resources/celebrations.txt"))
                .stream()
                .map(Celebrated::new)
                .filter(celebrated -> celebrated.getMonthOfBirth() == filteredMonth)
                .sorted((e1, e2) -> {
                    if(e1.getFirstName().equalsIgnoreCase(e2.getFirstName())){
                        return e1.getLastName().compareToIgnoreCase(e2.getLastName());
                    }
                    return e1.getFirstName().compareToIgnoreCase(e2.getFirstName());
                })
                .map(Celebrated::adjustForWriting)
                .collect(Collectors.toList());

        Files.write(Paths.get("src/main/resources/celebrations_extracted.txt"), processedEntries);
    }
}
