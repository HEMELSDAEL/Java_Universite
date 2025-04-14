package light.src;


public class LightString {

    private LightBulb [] tab;

public LightString(int number){
    tab = new LightBulb[number];
    for (int i=0; i<number; i++){
        LightBulb ampoule = new LightBulb(1, 100, "blanche");
        tab[i] = ampoule;
    }
   }
   public LightBulb getLightBulb(int indice){
    if (indice > tab.length || indice < 0 ){
        return null;
    }else{
        return tab[indice-1];
    }

   }

   /**replace the n-th lightbulb of the light string by the given lightbulb
    * Nothing happens if i is not a valid index
    * @param i the number of the lightbulb to be changed (first has number 1)
    * @param theBulb the new lightbulb
    */
    public void changeLightbulb(int i, LightBulb thebulb){
       this.tab[i] = thebulb;
    }

    public int getConsumedPower(){
        int Watt_total = 0;
        for(int i=0; i<tab.length; i++){
            if (tab[i].isOn()==true){
                Watt_total = Watt_total + tab[i].getWatt();
            }
        }  
        return Watt_total ;
    }

    public void turnOn(){
        for (int i=0; i<tab.length; i++){
            this.tab[i].turnOn();;
        }
    }

    public void turnOff(){
        for (int i=0; i<tab.length; i++){
            this.tab[i].turnOff();;
        }
    }
}
