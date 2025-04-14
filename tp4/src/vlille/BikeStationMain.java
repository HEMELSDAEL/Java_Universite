package vlille;
import vlille.util.BikeModel;

public class BikeStationMain {
    public static void main(String [] args){
        BikeStation station = new BikeStation("timoleon", 10);
        Bike bike1 = new Bike("b001", BikeModel.CLASSIC);
        Bike bike2 = new Bike("b002", BikeModel.ELECTRIC);
        station.dropBike(bike1);
        station.dropBike(bike2);
        if (args.length==1){
            try{
                System.out.println(station.takeBike(Integer.parseInt(args[0])).getId());
            } catch(BikeNotAvailableException error){
                System.out.println("No bike");
            }
        }else{
            System.out.println("lack of parameters");
        }
    }
}
