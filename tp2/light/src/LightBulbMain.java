package light.src;

public class LightBulbMain{
    public static void main(String[] args) {
       LightBulb ampoule = new LightBulb(4, 1200, "blanche");
       LightSwitch interrupteur = new LightSwitch(ampoule);
       ampoule.turnOff();
       interrupteur.push();
       System.out.println(ampoule);
    }
}