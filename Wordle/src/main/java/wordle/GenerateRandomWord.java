package wordle;

import java.util.Random;

public class GenerateRandomWord {
    public static String generateRandomWord(int length) {
        String availableLetters = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder wordBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(availableLetters.length());
            char randomLetter = availableLetters.charAt(randomIndex);
            wordBuilder.append(randomLetter);
        }

        return wordBuilder.toString();
    }
}
