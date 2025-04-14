package goosegame;

import goosegame.Cell.*;

/**It's my class ClassicalBoard who extends of my class Board */
public class ClassicalBoard extends Board{
    

    /**Constructor of my class ClassicalBoard */
    public ClassicalBoard(){
        super(64);
        initBoard();
    }

    /**Initializes the cell of the game according to the classic game */
    protected void initBoard() {
        for (int i = 0; i < this.nbOfCells; i++) {
            if (i == 9 || i == 18 || i == 27 || i == 36 || i == 45 || i == 54) {
                // les "cases oies" sont les cases 9, 18, 27, 36, 45, 54
                this.theCells[i] = new GooseCell();
                this.theCells[i].setIndex(i);
            } else if (i == 31 || i == 52) {
                // les "cases pièges" sont les cases 31(puit), 52(prison)
                this.theCells[i] = new TrapCell();
                this.theCells[i].setIndex(i);
            } else if (i == 19) {
                // la "case d'attente" est la case 19
                this.theCells[i] = new WaitCell();
                this.theCells[i].setIndex(i);
            } else if (i == 6 || i == 42 || i == 58) {
                // les "cases de téléportation" sont les cases 6, 42, 58
                this.theCells[i] = new TeleportCell();
                this.theCells[i].setIndex(i);
            } else {
                this.theCells[i] = new Cell(); // les cases classiques du jeu
                this.theCells[i].setIndex(i);
            }
        }
    }    
}
