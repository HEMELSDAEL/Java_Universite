package battleship;
import battleship.util.*;

public class ThirdBattleShipMain {
    public static void main(String[] args) throws InvalidShootException{
        Sea sea1 = new Sea(10, 10);
        Ship ship1 = new Ship(3);
        Ship ship2 = new Ship(2);
        Ship ship3 = new Ship(4);
        Position pos1 = new Position(2, 5);
        Position pos2 = new Position(5, 2);
        Position pos3 = new Position(8, 1);
        Game game1 = new Game(sea1);
        game1.getSea().addShipHorizontally(ship1,pos1);
        game1.getSea().addShipVertically(ship2, pos2);
        game1.getSea().addShip(ship3, pos3, 0, 4);
        System.out.println("-- Plateau Defenseur --");
        sea1.display(true);
        game1.play();
    }
}
