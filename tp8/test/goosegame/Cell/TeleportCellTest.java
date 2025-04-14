package goosegame.Cell;

import static org.junit.Assert.*;
import org.junit.Test;


public class TeleportCellTest {
    
    @Test
    public void bounceTest(){
        TeleportCell teleportCell = new TeleportCell();
        int res_bounce = teleportCell.bounce(5);
        assertEquals(res_bounce, 5);
    }

    @Test
    public void CanEscapeTest(){
        TeleportCell teleportCell = new TeleportCell();
        assertTrue(teleportCell.canEscape());
    }

}
