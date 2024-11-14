import com.cb.services.Scoreboard;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ScoreboardTest {

    @Test
    void testStartAndFinishMatch() {
        Scoreboard scoreboard = new Scoreboard();
        scoreboard.startMatch("ClassA", "ClassB");
        scoreboard.startMatch("ClassC", "ClassD");

        assertEquals(2, scoreboard.getSummary().size());

        scoreboard.finishMatch("ClassA", "ClassB");
        assertEquals(1, scoreboard.getSummary().size());
    }

    @Test
    void testUpdateScore() {
        Scoreboard scoreboard = new Scoreboard();
        scoreboard.startMatch("ClassA", "ClassB");

        scoreboard.updateScore("ClassA", "ClassB", 2, 1);
        List<String> summary = scoreboard.getSummary();
        assertTrue(summary.contains("ClassA 2 – 1 ClassB"));
    }

    @Test
    void testGetSummaryOrderedByScoreAndStartTime() {
        Scoreboard scoreboard = new Scoreboard();
        scoreboard.startMatch("ClassA", "ClassB");
        scoreboard.startMatch("ClassC", "ClassD");
        scoreboard.startMatch("ClassE", "ClassF");
        scoreboard.startMatch("ClassG", "ClassH");
        scoreboard.startMatch("ClassI", "ClassJ");

        scoreboard.updateScore("ClassA", "ClassB", 0, 5);
        scoreboard.updateScore("ClassC", "ClassD", 10, 2);
        scoreboard.updateScore("ClassE", "ClassF", 2, 2);
        scoreboard.updateScore("ClassG", "ClassH", 6, 6);
        scoreboard.updateScore("ClassI", "ClassJ", 3, 1);

        List<String> summary = scoreboard.getSummary();

        assertEquals("ClassG 6 – 6 ClassH", summary.get(0));
        assertEquals("ClassC 10 – 2 ClassD", summary.get(1));
        assertEquals("ClassA 0 – 5 ClassB", summary.get(2));
        assertEquals("ClassI 3 – 1 ClassJ", summary.get(3));
        assertEquals("ClassE 2 – 2 ClassF", summary.get(4));
    }
}
