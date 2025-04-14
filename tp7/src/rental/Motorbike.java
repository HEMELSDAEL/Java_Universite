package rental;

/* Motorbike's  class who represents motorbikes of a rental agency */
public class Motorbike extends Vehicle{
    /*cylindree represents the power of the motocycle*/
    private int cylindree;

    /**
     * Constructor of my class MotorBike who create a motorbike
     * @param brand the brand of my motorbike
     * @param model the model of my motorbike
     * @param year the year of my motorbike
     * @param dailyPrice the price of my motorbike
     * @param cylindree the power of my motorbike
     */
    public Motorbike(String brand, String model, int year, double dailyPrice, int cylindree){
        super(brand, model, year, dailyPrice);
        this.cylindree = cylindree;
    }

    /**
     * @return the motorbike's power
     */
    public int getCylindree(){
        return this.cylindree;
    }

    /**
     * print the toString methode 
     */
    @Override
    public String toString(){
        String MotorString = super.toString();
        return MotorString + " cylindree : " + this.cylindree + "cm3";
    }

}
