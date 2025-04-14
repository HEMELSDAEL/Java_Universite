package light.src;

public class LightStringMain {
    public static void main(String[] args){
        if (args.length>0){
            int param = Integer.parseInt(args[0]);
            LightString guirlande = new LightString(param);
            guirlande.turnOn();
            System.out.println("La puissance de la guirlande est de " + guirlande.getConsumedPower()+ " Watts");
            LightBulb ampoule = new LightBulb(2, 120, "jaune");
            guirlande.changeLightbulb(4, ampoule);
            System.out.println("La puissance de la guirlande avec la 4eme ampoule eteinte est de " + guirlande.getConsumedPower()+ " Watts");
            guirlande.turnOn();
            System.out.println("La puissance de la guirlande avec la 4eme ampoule allumee est de " + guirlande.getConsumedPower()+ " Watts");
        }else{
            System.out.println("Il n'y a pas de parametres");
        }
}
}
