package goosegame.Cell;
import goosegame.Player;

/**WaitCell class */
public class WaitCell extends Cell{

    /**Attributes */
    private int compteur;
    private String message;

    /**Constructor of my class WaitCell */
    public WaitCell(){
        super();
        this.compteur = 2;
    }

    /** set the player
     * @param p the player
     */
    public void setPlayer(Player p){
        this.p = p;
    }

    /**move or not
     * @return true if we can move else return false
     */
    @Override
    public boolean canEscape(){
        if((this.compteur)==0){//si il vient de tomber sur cette case
            this.compteur = 2; //nombres de tour à attendre avant de pouvoir rejouer
            return true;
        }
        this.compteur -=1;
        return false;
    }
    
    /**applies cell action to game
     * @param player player of my game
     */
    public void applyCellAction(Player player) {
        message = "Le joueur " + player + " est sur une cellule attente.";
        System.out.println(message);
    }

    /**get the message of the cell
     * @return the message
     */
    public String getMessage(){
        return message;
    }
}
