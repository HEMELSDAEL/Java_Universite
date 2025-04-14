package goosegame.Cell;

import goosegame.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class TrapCellTest {
    
    @Test
    public void canEscapeTest(){
        TrapCell trapCell = new TrapCell();
        assertFalse(trapCell.canEscape());
    }

    @Test
    public void ApplyCellActionTest(){
        TrapCell trapCell = new TrapCell();
        Player playerTest = new Player("PlayerTest");
        trapCell.applyCellAction(playerTest);
        assertEquals("Le joueur PlayerTest est  sur une cellule trap.", trapCell.getMessage());
        
    }
}
