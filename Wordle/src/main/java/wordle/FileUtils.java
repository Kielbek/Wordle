package wordle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    public static List<String> loadFile(String fileName, int wordLength) {
        List<String> wordsList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (wordLength == line.length()) {
                    wordsList.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordsList;
    }
}
