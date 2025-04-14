package rental.agency;

import rental.RentalAgency;
import rental.UnknownVehicleException;
import rental.Client;
import rental.Vehicle;

/*SuspiciousRentalAgency who inherits of RentalAgency */
public class SuspiciousRentalAgency extends RentalAgency{
    private static final double SURCOUT = 0.10;

    /*Constructor of my class SuspiciousRentalAgency */
    public SuspiciousRentalAgency(){
        super();
    }
    
    @Override
    /** client rents a vehicle with a modification about the age
    * @param client the renter
    * @param v the rented vehicle
    * @return the daily rental price for client for vehicle v
    * @exception UnknownVehicleException   if v is not a vehicle of this agency  
    * @exception IllegalStateException if v is already rented or client rents already another vehicle
    */
    public double rentVehicle(Client c, Vehicle v) throws IllegalStateException, UnknownVehicleException{
        double coutlocation = super.rentVehicle(c, v);
        if (c.getAge()<25){
            double surcout = v.getDailyPrice()*SURCOUT;
            return surcout + coutlocation;
        }else {
            return coutlocation;
        }

    }
    
    
}

