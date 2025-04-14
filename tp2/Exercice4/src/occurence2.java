package Exercice4.src;

public class occurence2 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Utilisation : java CompteCaractere <chaine> <caractere>");
            System.exit(1);
        }
        String chaine = args[0];
        char caractere = args[1].charAt(0);

        int resultat = compteCaractere(chaine, caractere);
        System.out.printf("Le caractère '%c' apparaît %d fois dans la chaîne '%s'.%n", caractere, resultat, chaine);
    }

    public static int compteCaractere(String chaine, char caractere) {
        int count = 0;
        for (int i = 1; i < chaine.length(); i++) {
            if (chaine.charAt(i) == caractere) {
                count++;
            }
        }
        return count;
    }
}