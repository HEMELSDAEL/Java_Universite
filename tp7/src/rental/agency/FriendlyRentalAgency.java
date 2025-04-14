package rental.agency;

import rental.RentalAgency;
import rental.UnknownVehicleException;
import rental.Vehicle;
import rental.Client;


import java.util.HashMap;
import java.util.Map;



public class FriendlyRentalAgency  extends RentalAgency{
    /*remise applied after fidelity */
    public int remise;
    /* pourcentage of fidelity*/
    public int pourcentage;
    /*HashMap with my fidelity */
    private Map<Client, Integer> fidelity = new HashMap<Client, Integer>();

    /**
     * Constructor of my SuspiciousRentalAgency class
     * @param remise : the reduction
     * @param pourcentage : Percentage discount compared to discount
     */
    public FriendlyRentalAgency(int remise, int pourcentage){
        super();
        this.remise = remise;
        this.pourcentage = pourcentage;
    }

    /**
     * @return the remise 
     */
    public int getRemise(){
        return this.remise;
    }

    public void setRemise(int remise){
        this.remise = remise;
    }

    /**
     * @return the pourcentage
     */
    public int getPourcentage(){
        return this.pourcentage;
    }

    public void setPourcentage(int pourcentage){
        this.pourcentage = pourcentage ;
    }

    /**
     * 
     * @param client client of my agency
     * @return fidelity of my client
     */
    public int getFidelity(Client client){
        if (fidelity.containsKey(client)){
            return fidelity.get(client);
        }else{
            return 0;
        }

    }
    
    /**
     * calculate fidelity's client who will be applied after the remise
     * @param client fidelity of my client
     */
    public void addRentalClient(Client client){
        if (!fidelity.containsKey(client)){
            fidelity.put(client, 0);
        }
        int currentPoints = fidelity.get(client);
        fidelity.put(client, currentPoints + 1);
        if (currentPoints>=remise){
            double reduc = pourcentage/100.0;
            double nouveauprix = 1-reduc;
            System.out.println("Remise de " + pourcentage + "% appliquee pour le client " + client.getName() +
                ". Nouveau cout : " + nouveauprix);
        }
    }

    @Override
    public double rentVehicle(Client c, Vehicle v) throws UnknownVehicleException {
    double baseRentalPrice = super.rentVehicle(c, v);
    int currentPoints = getFidelity(c);

    if (currentPoints >= remise) {
        double reductionPercentage = pourcentage / 100.0;
        double reducedPrice = baseRentalPrice * (1 - reductionPercentage);
        System.out.println("Remise de " + pourcentage + "% appliquee pour le client " + c.getName() +
                ". Nouveau cout : " + reducedPrice);
        return Math.max(reducedPrice, 0);
    } 
    return baseRentalPrice;
    }
}



