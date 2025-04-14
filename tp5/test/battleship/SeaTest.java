package battleship;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import battleship.util.Position;

public class SeaTest {
    
    @Test
    public void GoodShoot() throws InvalidShootException{
        Sea sea = new Sea(5, 10);
        Ship ship = new Ship(3);
        Position pos = new Position(3, 6);
        sea.addShip(ship, pos);
        assertEquals(Answer.HIT, sea.Shoot(pos));
        assertEquals(Answer.MISSED, sea.Shoot(pos));

        Sea sea2 = new Sea(5, 10);
        Ship ship2 = new Ship(1);
        Position pos2 = new Position(4, 6);
        sea2.addShip(ship2, pos2);
        assertEquals(Answer.SUNK, sea2.Shoot(pos2));

        Sea sea3 = new Sea(5, 10);
        Position pos3 = new Position(4, 8);
        assertEquals(Answer.MISSED, sea3.Shoot(pos3));       
    }

    @Test(expected = InvalidShootException.class)
    public void IndexOutTest() throws InvalidShootException{
        Sea sea = new Sea(5, 10);
        Position p = new Position(5, 11);
        sea.Shoot(p);
    }
}
