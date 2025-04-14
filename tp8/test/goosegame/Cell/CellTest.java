package goosegame.Cell;

import static org.junit.Assert.*;
import org.junit.Test;
import goosegame.Player;

public class CellTest {
    
    @Test
    public void testIsEmpty(){
        Cell cell = new Cell();
        Player player = new Player("joueur");
        assertTrue(cell.isEmpty());
        cell.setPlayer(player);
        assertFalse(cell.isEmpty());

    }

    @Test
    public void testSetPlayer(){
        Cell cell = new Cell();
        Player player = new Player("joueur1");
        cell.setPlayer(player);
        assertFalse(cell.isEmpty());
        assertEquals(player, cell.getPlayer());
    }

    @Test
    public void testIndex(){
        Cell cell = new Cell();
        int index = 5;
        cell.setIndex(index);
        assertEquals(index, cell.getIndex());
    }

    @Test
    public void testCanEscape(){
        Cell cell = new Cell();
        assertTrue(cell.canEscape());
    }
}
