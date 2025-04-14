package rental;

/*Car's class who represents cars of my rental agency */
public class Car extends Vehicle {
    /*numberPassager represents the number of passagers accepted in the car*/
    private int numberPassager;

    /**
     * Constructor of my class Car who create a car
     * @param brand the brand of my car
     * @param model the model of my car
     * @param year the year of my car
     * @param dailyPrice the price of my car
     * @param numberPassager the number of passager in my car 
     */
    public Car(String brand, String model, int year, double dailyPrice, int numberPassager){
        super(brand, model, year, numberPassager);
        this.numberPassager = numberPassager;
    }

    /**
     * @return the number of passagers in my car
     */
    public int getNumberPassager(){
        return this.numberPassager;
    }

    /**
     * print the toString methode which additionally displays the number of passengers
     */
    @Override
    public String toString(){
        String vehicleString = super.toString();
        return vehicleString + " " + numberPassager + " passagers";
    }
}
