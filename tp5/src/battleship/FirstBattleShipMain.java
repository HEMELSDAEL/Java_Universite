package battleship;

import battleship.util.Position;

public class FirstBattleShipMain {
    
    public static void main(String[] args) throws InvalidShootException{
        Sea sea = new Sea(10, 10);
        Ship ship = new Ship(2);
        Ship ship2 = new Ship(1);
        Position position = new Position(2, 4);
        Position position1 = new Position(1, 2);
        sea.addShip(ship, position);
        sea.addShip(ship2, position1);
        System.out.println("Defender side");
        sea.display(true);
        System.out.println("Attacker side");
        sea.display(false);
        sea.Shoot(position);
        System.out.println(" Defender side ");
        sea.display(true);
        System.out.println(" Attacker side ");
        sea.display(false);

    }
    
}
