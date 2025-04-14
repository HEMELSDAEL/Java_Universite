package light.src;

public class LightSwitch {

    private LightBulb lightBulb;

    public LightSwitch (LightBulb lightBulb){
        this.lightBulb = lightBulb;
    }

    /**
     * @return l'objet LightSwitch
     */
    public LightBulb getLightBulb(){
        return this.lightBulb;
    }

    /**
     * permet d'éteindre ou d'allumer LightSwitch
     */
    public void push(){
        if (this.lightBulb.isOn()){
            this.lightBulb.turnOff();
        } else {
            this.lightBulb.turnOn();
        }

    }
}
