package goosegame.Cell;

import static org.junit.Assert.*;
import org.junit.Test;


public class GooseCellTest {
    @Test
    public void bounceTest(){
        GooseCell goosecell = new GooseCell();
        int bounce = goosecell.bounce(6);
        assertEquals(bounce, 6);
    }

    @Test
    public void CanEscapeTest(){
        GooseCell goosecell = new GooseCell();
        assertTrue(goosecell.canEscape());
    }       
}
