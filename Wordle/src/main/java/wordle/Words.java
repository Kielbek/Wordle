package wordle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Words {
    private List<String> wordsList = new ArrayList<String>();

    public void init(String fileName, int wordLength) {
        this.wordsList = FileUtils.loadFile(fileName, wordLength);
    }

    public String drawWord() {
        return wordsList.get(new Random().nextInt(wordsList.size()));
    }

    public List<String> getWordsList() {
        return wordsList;
    }
}
