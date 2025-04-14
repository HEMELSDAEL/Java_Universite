package goosegame.Cell;

import goosegame.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class WaitCellTest {
    
    @Test
    public void canEscapeTest(){
        WaitCell waitCell = new WaitCell();
        waitCell.canEscape();
        waitCell.canEscape();
        assertTrue(waitCell.canEscape());
    }

    @Test
    public void cantEscapeTest(){
        WaitCell waitcell2 = new WaitCell();
        assertFalse(waitcell2.canEscape());
    }

    @Test
    public void applyCellActionTest(){
        WaitCell waitCell = new WaitCell();
        Player player = new Player("Player");
        waitCell.applyCellAction(player);
        assertEquals("Le joueur Player est sur une cellule attente.", waitCell.getMessage());
    }
}
