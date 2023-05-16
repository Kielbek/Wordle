package wordle;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static List<Color> checkWord(String word, String guessWord) {
        List<Color> list = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (guessWord.charAt(i) == c) {
                list.add(Color.GREEN);
            }
            else if (guessWord.contains(Character.toString(c))) {
                list.add(Color.YELLOW);
            }
            else {
                list.add(Color.GRAY);
            }
        }
        return list;
    }

    public static boolean checkResult(List<Color> list) {
        for (Color color : list) {
            if (color != Color.GREEN) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkCorrectWord(String word, List<String> words) {
        for (String w : words) {
            if (word.equals(w)) {
                return true;
            }
        }
        return false;
    }
}
