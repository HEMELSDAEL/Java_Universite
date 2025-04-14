package battleship;
import battleship.util.*;

public class SecondBattleShipMain {
    public static void main(String[] args) throws InvalidShootException{
        Sea sea = new Sea(10, 10);
        Ship ship = new Ship(3);
        Ship ship1 = new Ship(2);
        Position pos1 = new Position(2, 5);
        Position pos2 = new Position(5, 2);
        sea.addShip(ship, pos1);
        sea.addShip(ship1, pos2);
        System.out.println("Defender side");
        sea.display(true);
        Game game = new Game(sea);
        game.play();


    }
    
}
