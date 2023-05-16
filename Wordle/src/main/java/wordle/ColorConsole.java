package wordle;

import java.util.List;

public class ColorConsole {

    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_GRAY = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void print(String word, List<Color> list) {
        for (int i = 0; i < word.length(); i++) {
            Color color = list.get(i);

            if (color == Color.GREEN) {
                System.out.print(ANSI_GREEN + word.charAt(i) + ANSI_RESET);
            }
            else if (color == Color.YELLOW) {
                System.out.print(ANSI_YELLOW + word.charAt(i) +  ANSI_RESET);
            }

            else if (color == Color.GRAY) {
                System.out.print(ANSI_GRAY + word.charAt(i) + ANSI_RESET);
            }
        }
        System.out.println("\n");
    }
}
