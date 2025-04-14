package goosegame;

import java.util.*;
import goosegame.Cell.*;

/**My Game class for my goose game */

public class Game{
    
    /**Attributes of my class */
    protected List<Player> thePlayers = new ArrayList<Player>() ;
    /**Attributes Board of my class Game */
    protected Board board;
    
    /**constant for my casemax */
    private final int CASEMAX = 63;

    /**Constructor of my class Game 
     * @param board : it's my board of my game
     */
    public Game(Board board){
        this.board = board;
    }

    /**get the current Board
     * @return the current Board
     */
    public Board getBoard(){
        return this.board;
    }

    /**
     * @param p player to add
     */
    public void addPlayers(Player p){
        thePlayers.add(p);
    }

    /**get the list of players
     * @return the list of players
     */
    public List<Player> getPlayers() {
        return thePlayers;
    }

    /**makes the player to move according to the index finger if this square has a bounce
     * @param p player of the goosegame
     * @param index cell dont il avance 
     */
    public void move(Player p, int index) {
        // Calculer la nouvelle position en tenant compte du rebond
        int newPosition = index + p.getCell().getIndex();
    
        System.out.println("Avant le deplacement : le joueur " + p + " est dans la cellule " + p.getCell().getIndex());
    
        // Si la nouvelle position dépasse la dernière cellule, faire reculer le joueur
        if (newPosition > CASEMAX) {
            int overshoot = newPosition - CASEMAX;
            newPosition = CASEMAX - overshoot;
    
            System.out.println("Le joueur " + p + " a depasse la case 63 ! Recule de " + overshoot + " cases.");
        }
    
        Cell newCell = this.board.theCells[newPosition];
    
        
    
        // Si la cellule actuelle est la cellule finale, le joueur a gagné
        if (p.getCell().getIndex() == CASEMAX) {
            System.out.println("Le joueur " + p + " a gagne !");
            return;
        }
    
        // Mettre à jour la nouvelle cellule du joueur
        p.setCell(this.board.theCells[newPosition]);
        p.getCell().unsetPlayer();
        this.board.theCells[newPosition].setPlayer(p);
    
        System.out.println("Apres le deplacement : Joueur " + p + " est dans la cellule " + p.getCell().getIndex());
        // Appliquer l'action de la cellule sur le joueur
        newCell.applyCellAction(p);
        if (newCell instanceof GooseCell) {
            int gooseBounce = ((GooseCell) newCell).bounce(p, this);
            move(p, gooseBounce);
        }
    }
    
    /**Play the game
     */
    public void play(){
        while(!isGameFinished()){
            System.out.println("------------------Nouveau Tour------------------");
            for (Player player : this.thePlayers){
                Cell currentCell = player.getCell();
                if (currentCell != null && currentCell.canEscape()) {
                    int lance = player.twoDiceThrow();
                    System.out.println("Le joueur " + player + " lance les des et obtient : " + lance);
                    move(player, lance);
    
                    // Vérifier à nouveau si le joueur a gagné après le déplacement
                    if (player.getCell().getIndex() >= CASEMAX) {
                        System.out.println("Le joueur " + player + " a gagne !");
                        return;
                    }
                }
            }
        }
    }
    
    
    /**Tell if the game is finished or not
     * @return true if the game is finished
     */
    private boolean isGameFinished() {
    for (Player player : this.thePlayers) {
        if (player.getCell() != null && player.getCell().getIndex() >= CASEMAX) {
            System.out.println("Le joueur " + player + " a gagne !");
            return true;
        }
    }
    return false;
}
}
