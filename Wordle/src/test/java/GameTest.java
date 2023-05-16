import org.junit.jupiter.api.Test;
import wordle.Color;
import wordle.Game;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void drawTestWhenAllSingIsTrue() {
        List<Color> list = Game.checkWord("wagon", "wagon");

        assertEquals(list, List.of(Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
    }

    @Test
    void checkWhenTheLetterIsButNotInItsPlace() {
        List<Color> list = Game.checkWord("losnu", "qszxcv");

        assertEquals(list, List.of(Color.GRAY, Color.GRAY, Color.YELLOW, Color.GRAY, Color.GRAY));
    }

    @Test
    void e() {
        List<Color> list = Game.checkWord("aabcd", "aabcd");

        assertEquals(list, List.of(Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN, Color.GREEN));
    }

}