package battleship;
import battleship.util.Position;

public class Sea {
    private Cell [][] tab;
    private Sea sea;
    /**
     * Constructor of my class Sea
     * @param nRows : position one
     * @param nColums : position two
     */
    public Sea(int nRows, int nColumns){
        this.tab = new Cell [nRows][nColumns];
        for (int i=0; i<nRows; i++){
            for (int j=0; j<nColumns; j++){
                this.tab[i][j] = new Cell();
            }
        }
        this.sea=this;
    }

    /**
     * Get the table for the sea
     * @return the table
     */
    public Cell[][] getTab(){
        return this.tab;
    }

    /**
     * Adds a ship to the position
     * @param s : the ship to add
     * @param p : the position where to place the ship
     */
    public void addShip(Ship s, Position p) throws ArrayIndexOutOfBoundsException{
        if(p.getX() > this.tab.length || p.getY() > this.tab[0].length){
            throw new ArrayIndexOutOfBoundsException();
        }
        this.tab[p.getX()][p.getY()].setShip(s);
    }

    /**
     * Shoot a specific cell on the sea
     * @param p : the position
     * @return : HIT/MISSED/SUNK
     * @throws InvalidShootException : if the shoot is index out
     */
    public Answer Shoot(Position p) throws InvalidShootException{
        int x = p.getX();
        int y = p.getY();
    
        if (x >= 0 && x < this.tab.length && y >= 0 && y < this.tab[0].length) {
            // Les coordonnées sont valides, vous pouvez continuer
            return this.tab[x][y].shot();
        } else {
            // Les coordonnées sont en dehors des limites, lancez une exception
            throw new InvalidShootException("Coordonnées invalides : X=" + x + ", Y=" + y);
        }
    }

    /**
     * Number of Life Points Remaining
     * @return : Number of Life Points Remaining
     */
    public int getRemainingLifePoints(){
        int acc = 0;
        for (int i = 0; i < this.tab.length; i++){
            for (int j = 0; j < this.tab[0].length; j++){
                if (this.tab[i][j].getShip() != null){
                    acc = acc + this.tab[i][j].getShip().getLifePoints();
                }
            }
        }
        return acc;
    }

    /** display the game board line by line and cell by cell, on standing output,
     *  the display is different for the defender or the attacker, according to parameter
     * @param defender true iff display is for defender, false if for oppponent
     */
    public void display(boolean defender){
        for (int i = 0; i < this.tab.length; i++){
            for (int j = 0; j < this.tab[0].length; j++){
                System.out.print(this.tab[i][j].toCharacter(defender) + " ");
            }
            System.out.println("\n");
        }
    }

    

    /** Test if you can place the ship vertically
     * @param shipToPlace ship
     * @param position position
     * @throws IllegalStateException if the ship b can not be placed on the sea
     */
    private void testIfShipCanBePlacedVertically(Ship shipToPlace, Position position) throws IllegalStateException{
        if (shipToPlace.getLifePoints()-1 + position.getX() > this.sea.getTab().length-1){
            throw new IllegalStateException();
        }
        for (int i = 0; i < shipToPlace.getLifePoints()-1; i++){
            if (this.sea.getTab()[position.getX()+i][position.getY()].isEmpty() == false){
                throw new IllegalStateException();
            }
        }
    }

    /** add the ship b to this game’s sea.  Ship is added vertically down from position p.
     *    The number of cells is determined by the ship life points.
     * @param shipToPlace the ship to add
     * @param position the position of the first (top) cell occupied by the ship
     * @throws IllegalStateException if the ship b can not be placed on the sea
     *    (ship goes outside of the sea or some cell is not empty)
     */
    public void addShipVertically(Ship shipToPlace, Position position) throws IllegalStateException{
        testIfShipCanBePlacedVertically(shipToPlace, position);
        for (int i = 0; i < shipToPlace.getLifePoints(); i++){
            this.sea.getTab()[position.getX()+i][position.getY()].setShip(shipToPlace);
        }
    }

    /** Test if u can place the ship horizontally
     * @param shipToPlace ship
     * @param position position
     * @throws IllegalStateException if the ship b can not be placed on the sea
     */
    private void testIfShipCanBePlacedHorizontally(Ship shipToPlace, Position position) throws IllegalStateException{
        if (shipToPlace.getLifePoints()-1 + position.getY() > this.sea.getTab()[0].length-1){
            throw new IllegalStateException();
        }
        for (int i = 0; i < shipToPlace.getLifePoints(); i++){
            if (this.sea.getTab()[position.getX()][position.getY()+i].isEmpty() == false){
                throw new IllegalStateException();
            }
        }
    }

    /** add the ship b to this game’s sea.  Ship is added horizontally right from position p.
     *    The number of cells is determined by the ship life points.
     * @param shipToPlace the ship to add
     * @param position the position of the first (top) cell occupied by the ship
     * @throws IllegalStateException if the ship b can not be placed on the sea
     *    (ship goes outside of the sea or some cell is not empty)
     */
    public void addShipHorizontally(Ship shipToPlace, Position position) throws IllegalStateException{
        testIfShipCanBePlacedHorizontally(shipToPlace, position);
        for (int i = 0; i < shipToPlace.getLifePoints(); i++){
            this.sea.getTab()[position.getX()][position.getY()+i].setShip(shipToPlace);
        }
    }

    /** add the ship to the game, added horizontally or vertically depends on dx, dy
     * @param shipToPlace ship 
     * @param position position
     * @param dx x-variation
     * @param dy y-variation
     * @throws IllegalStateException if the ship b can not be placed on the sea
     */
    public void addShip(Ship shipToPlace, Position position, int dx, int dy) throws IllegalStateException{
        if (dx != 0 && dy != 0){
            throw new IllegalStateException();
        }
        else if (dx != 0 && dy == 0){
            testIfShipCanBePlacedVertically(shipToPlace, position);
            for (int i = 0; i < dx; i++){
                this.sea.getTab()[position.getX()+i][position.getY()].setShip(shipToPlace);
            }
        }
        else if (dx == 0 && dy != 0){
            testIfShipCanBePlacedHorizontally(shipToPlace, position);
            for (int i = 0; i < dy; i++){
                this.sea.getTab()[position.getX()][position.getY()+i].setShip(shipToPlace);
            }
        }
    }
  
}
