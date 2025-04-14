package battleship;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShipTest {

    @Test
    public void creationShip(){
        Ship ship = new Ship(3);
        assertEquals(3, ship.getLifePoints());
    }

    @Test
    public void ShipIsSunk(){
        Ship ship = new Ship(2);
        ship.beenHitting();
        ship.beenHitting();
        assertEquals(true, ship.hasBeenSunk());
    }
}
