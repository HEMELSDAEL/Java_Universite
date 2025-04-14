package goosegame;

/** It's my class GoosegameMain */
public class GoosegameMain {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java -jar oie.jar <nombre_de_joueurs>");
            System.exit(1);
        }
        int numberOfPlayers = Integer.parseInt(args[0]);

        Board board = new ClassicalBoard();
        Game game = new Game(board);
        for (int i = 0; i < numberOfPlayers; i++) {
            Player player = new Player(""+(i + 1));
            game.addPlayers(player);
            player.setCell(board.getCell(0));
        }
        game.play();
    }
}


