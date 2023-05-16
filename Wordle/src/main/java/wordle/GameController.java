package wordle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class GameController {
    Words words = new Words();
    private HashMap<String, String> hashMap = new HashMap<>();

    @GetMapping("/get/word/{wordLength}")
    public String drawWord(@PathVariable int wordLength) {
        words.init("src/main/resources/dict.txt", wordLength);
        String randomKey = GenerateRandomWord.generateRandomWord(6);
        String randomWord = words.drawWord();
        hashMap.put(randomKey, randomWord);

        return randomKey;
    }

    @PutMapping("/guess/word/{key}/{guessWord}")
    public List<Color> guessWord(@PathVariable String key, @PathVariable String guessWord) {
        String word = hashMap.get(key);
        if (word.length() != guessWord.length()) {
            throw new RuntimeException("Wrong word!");
        }
        return Game.checkWord(guessWord, word);
    }
}
