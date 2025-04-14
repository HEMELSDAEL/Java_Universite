package goosegame;

import goosegame.Cell.*;

/**My class abstract Board */
public abstract class Board {

    /**Attributes of my class Board */
    protected final int nbOfCells;
    /**board of cell of my class Board */
    protected Cell theCells[];

    /**Constructor of my class Board
     * @param nbOfCells : Number of cell that make up the game board
     */
    public Board(int nbOfCells){
        this.nbOfCells = nbOfCells+1;
        this.theCells = new Cell[this.nbOfCells];
        this.initBoard();
    }

    /**initBoard for initialize the game that will be encoded in ClassicalBoard */
    protected abstract  void initBoard();

    /**get cell at the specified index
     * @param index : the index to specify the cell
     * @return the cell at the index
     */
    public Cell getCell(int index){
        return this.theCells[index];
    }

    /**get the number of cell of board
     * @return the number of cell
     */
    public int getNbOfCells(){
        return this.nbOfCells;
    }
}
