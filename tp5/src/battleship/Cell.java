package battleship;

public class Cell {
    /**Attrbiutes*/
    private Ship ship;
    private boolean shot;

    /**Constructor of my class Cell*/
    public Cell(){
        this.ship = null;
        this.shot = false;
    }

    /**
     * Checks if the cell is empty
     * @return : true if the cell is empty else false
     */
    public boolean isEmpty(){
        if (this.ship==null){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Get the boat on the current cell
     * @return : the ship who is on the current cell
     */
    public Ship getShip(){
    if (this.ship==null){
        return null;
    }else{
        return this.ship;
        }
    }

    /** set a ship at the current cell
     * @param ship a ship
     */
    public void setShip(Ship ship){
        this.ship = ship;
    }

    /** return the current shot value for the current cell
     * @return true if the shot is true either false
     */
    public boolean getShot(){
        return this.shot;
    }

    /**the shot in the current cell
     */
    public void setShot(){
        this.shot = true;
    }

    /**
     * check that the ship has been shot
     * @return true if the ship has been shot else false
     */
    public boolean hasBeenShot(){
        if(this.shot==true){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Shot on a ship 
     * @return SUNK if the ship is sunk/HIT if the ship is hit/ MISSED if the ship is missed
     */
    public Answer shot(){
        if (this.ship != null && this.hasBeenShot() == false){
            this.shot = true;
            this.ship.beenHitting();
            if(this.ship.hasBeenSunk() == true){
                return Answer.SUNK;
            }
            return Answer.HIT;
        }
        this.shot = true;
        return Answer.MISSED;
    }

    /**
     * print a character based on the player's action
     * @param defender : player who is the defender
     * @return : the character according to the player's choices
     */
    public char toCharacter(boolean defender){
        if (defender == true){
            if (this.ship == null){
                return ("∼".charAt(0));
            }
            else if (this.ship != null) {
                return "B".charAt(0);
            }
            else if (this.ship != null && this.hasBeenShot() == true) {
                return "*".charAt(0);
            }

        }
        if (this.hasBeenShot() == false){
            return (".".charAt(0));
        }
        else if (this.ship != null && this.hasBeenShot() == true) {
            return "*".charAt(0);
        }
        return "∼".charAt(0);
    }
    
}
