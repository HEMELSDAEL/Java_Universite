package battleship;
import java.util.Scanner;

import battleship.util.Position;

public class Game {
    /*Attributes */
    private Sea sea;

    /**
     * Constructor of my class Sea
     * @param sea : sea of the game
     */
    public Game(Sea sea){
        this.sea = sea;
    }

    /**
     * get the current sea of the game
     * @return : the sea
     */
    public Sea getSea(){
        return this.sea;
    }

    /** Ask for a position to the player
     * @return the choosen position
     */
    private Position inputPosition() {
    try (Scanner saisieUtilisateur = new Scanner(System.in)) {
        System.out.println("Please enter a letter and number (for example :  A1) :");
        String input = saisieUtilisateur.nextLine().trim(); 

        if (input.matches("[A-J][0-9]")) {
            char letter = input.charAt(0);
            int digit = Character.getNumericValue(input.charAt(1));
            Position pos = new Position(letter - 'A', digit);
            return pos;
        } else {
            System.out.println("Invalid contact information. Please enter valid contact information.");
            return inputPosition();
        }
    }
    }   
    
    
    /*Play the game */
    public void play() throws InvalidShootException{
        while (sea.getRemainingLifePoints() != 0){
            sea.display(false);
            System.out.println(sea.Shoot(inputPosition()));
        }
        sea.display(false);
        System.out.println("Vous avez gagné, il n'y a plus de bateau sur le plateau");

    }  
}
