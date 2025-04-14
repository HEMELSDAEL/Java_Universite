package goosegame;
import java.util.Random;
import goosegame.Cell.*;
/**A player in the "jeu de l'oie" game */

public class Player {
    private static Random random = new Random();
    /**current cell of the player */
    protected Cell cell;
    /**name of player */
    protected String name;

    /**
     * @param name the name of this player
     */
    public Player(String name){
        this.name = name;
        this.cell = null;
    }

    /** @see Object#toString() */
    public String toString(){
        return this.name;
    }

    /** @return the current cell of the player */
    public Cell getCell(){
        return this.cell;
    }

    /** changes the cell of the player
     * @param newCell the new Cell
     */
    public void setCell(Cell newCell){
        this.cell = newCell;
    }

    /** @return random result of a 1d6 throw */
    private int oneDiceThrow(){
        return Player.random.nextInt(6)+1;
    }

    /** @return random result of 2d6 throw */
    public int twoDiceThrow(){
        int result = oneDiceThrow() + oneDiceThrow();
        return result;
    }
    
}
