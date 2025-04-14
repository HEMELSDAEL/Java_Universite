package Exercice3.src;

//Ecercice 3
public class recherche_occurence {
    public static void main(String[] args){
        if (args.length==0){
            System.out.println("0");

        }
        else{
        String s=args[0];
        char lettre = 'a';
        int occ = 0;
        for (int i =0; i<s.length(); i++){
            if (s.charAt(i)==lettre){
                occ++;
                }
        }
        System.out.println(occ);
    }
}
}
