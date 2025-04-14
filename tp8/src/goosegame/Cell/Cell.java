package goosegame.Cell;

import goosegame.Player;

/**Cell class*/
public class Cell {
    /**Attributes of my class */
    protected Player p;
    /**Attributes index of my class */
    protected int index;

    /**Constructor of my class */
    public Cell(){
        this.p = null;
    }

    /**get the current index of the cell
     * @return the index of this current cell
     */
    public int getIndex(){
        return this.index;
    }

    /** get the current player
     * @return the current player
     */
    public Player getPlayer(){
        return this.p;
    }

    /** set the current index
     * @param index the index 
     */
    public void setIndex(int index){
        this.index = index;
    }

    /** set the player
     * @param p the player
     */
    public void setPlayer(Player p){
        this.p = p;
    } 
    
    /**unset player in the cell
     */
    public void unsetPlayer() {
    	this.p = null;
    }

    /**check if the cell is empty
     * @return true if it's empty
     */
    public boolean isEmpty(){
        return this.p==null;
    }

    /** Calculates the bounce
     * @param number the number of the bounce
     * @return the bounce
     */
    public int bounce(int number){
        return number;
    }

    /**indicates whether it is safe to move
     * @return true if we can move
     */
    public boolean canEscape(){
        return true;
    }

    /**applies cell action to game
     * @param player player of my game
     */
    public void applyCellAction(Player player) {
        // Par défaut, aucune action spécifique pour une cellule normale
        System.out.println("Le joueur " + player + " est sur une cellule normale.");
    }
}
