package light.src;

/**
 * class for LightBulb
 */

public class LightBulb {
    
    private int watt;
    private int lumen;
    private String color;
    private boolean on;

    public LightBulb(int watt, int lumen, String color){
        this.watt = watt;
        this.lumen = lumen;
        this.color = color;
        this.on = false;
    }
    //get this LightBulb Watt
    public int getWatt(){
        return this.watt;
    }
    //get this LightBulb Lumen
    public int getLumen(){
        return this.lumen;
    }
    //get this LightBulb Color
    public String getColor(){
        return this.color;
    }
    // turn this LightBulb on
    public void turnOn(){
        this.on = true;
    }
    // turn this LightBulb off
    public void turnOff(){
        this.on = false;
    }

    // returns whether the bulb is on or off
    public boolean isOn(){
        return this.on;
    }
    // provide a string representation for this LightBulb object
    public String toString(){
        if (this.on){
            return "LightBulb [Color = " + this.color + ", Lumens = " + this.lumen + ", Watts = " + this.watt + ", On = on"+ "]";        
        } else {
            return "LightBulb [Color = " + this.color + ", Lumens = " + this.lumen + ", Watts = " + this.watt + ", On = off"+ "]";        

        }
    }
}
