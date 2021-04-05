import org.junit.jupiter.api.Test;

import javax.crypto.NullCipher;
import javax.lang.model.type.NullType;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    static Game game = new Game();

    @Test
    public void test_a(){
        assertEquals(game.whoWin("paper","rock"),"Player 1 win!");
        assertEquals(game.whoWin("rock","scissors"),"Player 1 win!");
        assertEquals(game.whoWin("scissors","paper"),"Player 1 win!");
    }

    @Test
    public void test_b(){
        assertEquals(game.whoWin("scissors","rock"),"Player 2 win!");
        assertEquals(game.whoWin("paper","scissors"),"Player 2 win!");
        assertEquals(game.whoWin("rock","paper"),"Player 2 win!");
    }

    @Test
    public void test_c(){
        assertEquals(game.whoWin("rock","rock"),"Draw!");
        assertEquals(game.whoWin("paper","paper"),"Draw!");
        assertEquals(game.whoWin("scissors","scissors"),"Draw!");
    }

    @Test
    public void test_d(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->{
            game.check("peko");
        });
        Exception exception2 = assertThrows(IllegalArgumentException.class, () ->{
            game.check("A");
        });
        assertDoesNotThrow(()-> {
            game.check("paper");
        });
    }
}