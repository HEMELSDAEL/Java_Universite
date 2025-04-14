package goosegame.Cell;
import goosegame.Player;

/**TrapCell class */
public class TrapCell extends Cell{
    private String message;

    /**TrapCell constructor */
    public TrapCell(){
        super();
    }

    /** set the player
     * @param p the player
     */
    public void setPlayer(Player p){
        this.p = p;
    }

    /**move or not
     * @return true if we can move else false
     */
    @Override
    public boolean canEscape(){
        return false;
    }

    /**applies cell action to game
     * @param player player of my game
     */
    public void applyCellAction(Player player) {
        message = "Le joueur " + player + " est sur une cellule trap.";
        System.out.println(message);
    }

    /**get the message of the cell
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    
}
