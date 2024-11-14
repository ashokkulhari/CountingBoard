import com.cb.models.Match;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatchTest {

    @Test
    void testMatchInitialization() {
        Match match = new Match("ClassA", "ClassB");
        assertEquals(0, match.getHomeScore());
        assertEquals(0, match.getAwayScore());
        assertEquals("ClassA", match.getHomeClass());
        assertEquals("ClassB", match.getAwayClass());
    }

    @Test
    void testUpdateScore() {
        Match match = new Match("ClassA", "ClassB");
        match.updateScore(5, 3);
        assertEquals(5, match.getHomeScore());
        assertEquals(3, match.getAwayScore());
    }
}
