package battleship;

/**My class Ship */
public class Ship {
    /**Attributes */
    private int lifePoints;

    /**
     * Constructor of my class Ship
     * @param lifePoints : length of my boat
     */
    public Ship(int lifePoints){
        this.lifePoints=lifePoints;
    }

    /**
     * know if the ship has been sunk or not
     * @return : true if the ship has been sunk either false
     */
    public boolean hasBeenSunk(){
        if (this.lifePoints==0){
            return true;
        }else{
            return false;
        }
    }
    
    /** know the ship has been hit */
    public void beenHitting(){
        this.lifePoints = lifePoints - 1;
    }

    /**
     * Get the number of life points of the ship
     * @return : the number of life points of the ship
     */
    public int getLifePoints(){
        return this.lifePoints;
    }

    /**
     * print the number of hit points of the ship
     * @return : a sentence with the life points of the ship
     */
    public String toString(){
        return "Ship [LifePoints : " + this.lifePoints + " ]";
    }




}
