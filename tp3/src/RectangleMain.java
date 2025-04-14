public class RectangleMain {
    public static void main(String [] args){
        if (args.length == 2){
            int param1 = Integer.parseInt(args[0]);
            int param2 = Integer.parseInt(args[1]);
            Rectangle rectangle1 = new Rectangle(param1, param2);
            Rectangle rectangle2 = new Rectangle(15, 15);
            System.out.println(rectangle1.toString());
            System.out.println(rectangle2.toString());
            System.out.println("L'aire du rectangle1 est de : " + rectangle1.aire());
            System.out.println("Le perimetre de ce rectangle2 est de : " + rectangle2.perimetre());
            if ((rectangle1.carre_ou_non()==true)||(rectangle2.carre_ou_non()==true)){
                System.out.println("L'un des deux rectangles est un carre");
            }else if((rectangle1.carre_ou_non()==true)&&(rectangle2.carre_ou_non()==true)){
                System.out.println("Les deux rectangles sont carres");
            }else{
                System.out.println("Aucun n'est carre ");
            }
            System.out.println(rectangle1.equals(rectangle2) + " : Les deux rectangles ne sont pas egaux");
        }else if (args.length==1){
            System.out.println("Le rectangle est un carre");
        }else{
            System.out.println("Erreur il faut saisir soit 1 parametre ou alors 2 parametres");
        }
    }
}
