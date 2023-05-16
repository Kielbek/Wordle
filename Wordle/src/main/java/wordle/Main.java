package wordle;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Words words = new Words();
        int wordLength = 5;
        words.init("src/main/resources/dict.txt", wordLength);
        String drawWord = words.drawWord();
        String word = "";
        int numberOfTries = 0;
        Scanner scanner = new Scanner(System.in);
        boolean didYouGuess = false;


        System.out.println(GenerateRandomWord.generateRandomWord(5));

        while (numberOfTries != 7) {
            System.out.println("Make a guess: ");
            String w = scanner.nextLine();
            if (w.length() != wordLength) {
                System.err.println("Wrong word");
                break;
            }
            List<Color> list = Game.checkWord(w, drawWord);
            ColorConsole.print(w, list);
            if (Game.checkResult(list)) {
                System.out.println("You win!");
                didYouGuess = true;
                break;
            }
            numberOfTries++;
        }
        if (!didYouGuess) {
            System.out.println("Correct word: " + drawWord);
        }




    }
}
