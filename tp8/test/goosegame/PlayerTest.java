package goosegame;

import static org.junit.Assert.*;
import org.junit.Test;
import goosegame.Cell.*;

public class PlayerTest {
    
    @Test
    public void nameTest(){
        Player player = new Player("joueur");
        assertEquals("joueur", player.toString());
    }

    @Test
    public void playerGetCell(){
        Player player = new Player("joueur1");
        Cell cell = new Cell();
        player.setCell(cell);
        assertEquals(cell, player.getCell());
    }
}
