package goosegame.Cell;
import goosegame.Game;
import goosegame.Player;

/** GooseCell class that extends Cell */
public class GooseCell extends Cell {

    /** Constructor of my class GooseCell */
    public GooseCell() {
        super();
    }

    /** Calculate the bounce
     * @param player the player bouncing
     * @param game my game
     * @return the new position after the bounce
     */
    public int bounce(Player player, Game game) {
        System.out.println("Le joueur rebondit car il est tombe sur une case oie");
    
        int newPosition = player.getCell().getIndex();
        int diceRoll;
    
        do {
            diceRoll = player.twoDiceThrow(); // Lancer de dés supplémentaire
            newPosition += diceRoll;
    
            // Appliquer les règles spéciales pour les cases oies
            if (isGooseCell(newPosition)) {
                System.out.println("Action speciale pour la case oie a la position " + newPosition + " !");
                newPosition += diceRoll;  // Effectuer un deuxième saut en cas de case oie
            }
        } while (isGooseCell(newPosition) && newPosition != 63); // Continuer à rebondir tant que la position est une case oie, sauf si on atteint la case 63
    
        // Si la nouvelle position dépasse la case 63, reculer du nombre en trop
        if (newPosition > 63) {
            int overshoot = newPosition - 63;  // nombre en trop
            newPosition = 63 - overshoot;
    
            System.out.println("Le joueur " + player + " a depasse la case 63 ! Recule de " + overshoot + " cases.");
        }
    
        return newPosition;
    }
    

    /** Move or not
     * @return true if we can move
     */
    @Override
    public boolean canEscape() {
        return true;
    }

    /** Applies cell action to the game
     * @param player player of my game
     * @param game my game
     */
    public void applyCellAction(Player player, Game game) {
        System.out.println("Le joueur " + player + " est sur une cellule oie.");
        int newPosition = bounce(player, game);

        // Déplacement du joueur
        player.getCell().unsetPlayer();
        player.setCell(game.getBoard().getCell(newPosition));
        player.getCell().setPlayer(player);
    }

    /** Check if the cell is a GooseCell
     * @param position the position to check
     * @return true if the cell is a GooseCell
     */
    private boolean isGooseCell(int position) {
        return position == 9 || position == 18 || position == 27 || position == 36 || position == 45 || position == 54;
    }
}
