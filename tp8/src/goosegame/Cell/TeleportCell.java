package goosegame.Cell;
import goosegame.Player;
import goosegame.Board;

/** TeleportCell class */
public class TeleportCell extends Cell {

    /** Constructor of my TeleportCell */
    public TeleportCell() {
        super();
    }

    /** Calculates the bounce
     * @param player player of my game
     * @return the bounce
     */
    public int bounce(Player player) {
        if (this.index == 5) {
            return 11;
        } else if (this.index == 41) {
            return 41;
        } else {
            return this.index;
        }
    }

    /** move or not
     * @return true if we can move
     */
    @Override
    public boolean canEscape() {
        return true;
    }

    /**applies cell action to game
     * @param player player of my game
     * @param board board of my game
     */
    public void applyCellAction(Player player, Board board) {
        System.out.println("Le joueur " + player + " est sur une cellule de teleportation.");
        int newPosition = bounce(player);

        player.getCell().unsetPlayer();

        // Assurez-vous que la nouvelle position est valide
        if (newPosition < 0 || newPosition >= board.getNbOfCells()) {
            System.out.println("La nouvelle position calculee apres la teleportation n'est pas valide.");
            return;
        }

        player.setCell(board.getCell(newPosition));
        player.getCell().setPlayer(player);
    }
    
}
