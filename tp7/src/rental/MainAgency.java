package rental;

import rental.agency.FriendlyRentalAgency;
import rental.agency.SuspiciousRentalAgency;
import rental.filter.*;

public class MainAgency {
    public static void main(String[] args) throws IllegalStateException, UnknownVehicleException {
        RentalAgency agence = new RentalAgency();
        Vehicle vehicle1 = new Vehicle("marque1", "model1", 2003, 140);
        Vehicle vehicle2 = new Vehicle("brand2", "model2", 2001, 345);
        Vehicle vehicle3 = new Vehicle("brand3", "model3", 2020, 45000);
        Car car = new Car("Peugeot", "3008", 2021, 35000, 5);
        Motorbike moto = new Motorbike("Honda", "blabla", 2022, 70.0, 500);
        agence.addVehicle(vehicle1);
        agence.addVehicle(vehicle2);
        agence.addVehicle(vehicle3);
        agence.addVehicle(car);
        agence.addVehicle(moto);

        Client client1 = new Client("loueur1", 23);
        Client client2 = new Client("loueur2", 40);

        System.out.println("Tous les vehicules disponibles :" );
        agence.displayAllVehicles();
        
        BrandFilter brandFilter = new BrandFilter("brand2");
        System.out.println("Vehicules de la marque brand2 ");
        agence.displaySelection(brandFilter);

        MaxPriceFilter maxPriceFilter = new MaxPriceFilter(200);
        System.out.println("Vehicules avec un prix maximal de 200 :");
        agence.displaySelection(maxPriceFilter);

        AndFilter andFilter = new AndFilter();
        andFilter.addFilter(brandFilter);
        andFilter.addFilter(maxPriceFilter);
        System.out.println("Vehicule de la marque 'brand2' avec un prix maximal de 200 :");
        agence.displaySelection(andFilter);

        try{
            double rentalPrice = agence.rentVehicle(client1, vehicle2);
            double rentalPrice2 = agence.rentVehicle(client2, vehicle3);
            System.out.println(client1.getName() +  " a loue le vehicule : " + vehicle2 );
            System.out.println("Le prix de location est " + rentalPrice);
            System.out.println(client2.getName() +  " a loue le vehicule : " + vehicle3 );
            System.out.println("Le prix de location est " + rentalPrice2);
        }catch (UnknownVehicleException | IllegalStateException e){
            System.out.println("Erreur lors de la location");
        }

        System.out.println("Vehicules actuellement loues");
        for (Vehicle rentedVehicle : agence.allRentedVehicles()){
            System.out.println(rentedVehicle);
        }

        System.out.println(client1.getName() + " a retourne le vehicule");
        agence.returnVehicle(client1);

        System.out.println("Vehicules actuellement loues apres le retour :");
        for (Vehicle rentedVehicle : agence.allRentedVehicles()){
            System.out.println(rentedVehicle);
        }

        MaxPriceFilter maxPriceFilter2 = new MaxPriceFilter(200);
        System.out.println("Voici les vehicules avec un prix maximal de 200 :");
        agence.displaySelection(maxPriceFilter2);

        SuspiciousRentalAgency suspiciousAgency = new SuspiciousRentalAgency();
        suspiciousAgency.addVehicle(vehicle1);
        suspiciousAgency.addVehicle(vehicle2);
        suspiciousAgency.addVehicle(moto);
        try {
            double rentalPrice5 = suspiciousAgency.rentVehicle(client1, vehicle2);
            System.out.println(client1.getName() + " a loue le vehicule : " + vehicle2 + " avec SuspiciousRentalAgency");
            System.out.println(client1.getName() + " a paye un surcout de 10%.");
            System.out.println("Le prix de location est " + rentalPrice5);
            
            double rentalPrice6 = suspiciousAgency.rentVehicle(client2, moto);
            System.out.println(client2.getName() + " a loue le vehicule : " + moto + " avec SuspiciousRentalAgency");
            System.out.println("Le prix de location est " + rentalPrice6);
        } catch (UnknownVehicleException | IllegalStateException e) {
            System.out.println("Erreur lors de la location avec SuspiciousRentalAgency");
        }

        FriendlyRentalAgency friendlyAgency = new FriendlyRentalAgency(2, 10);
        friendlyAgency.addVehicle(vehicle1);
        friendlyAgency.addVehicle(vehicle2);
        friendlyAgency.addVehicle(vehicle3);
        try {
            friendlyAgency.addRentalClient(client1);
            friendlyAgency.addRentalClient(client1);
            double rentalPrice3 = friendlyAgency.rentVehicle(client1, vehicle2);
            System.out.println(client1.getName() + " a loue le vehicule : " + vehicle2 + " avec FriendlyRentalAgency");
            System.out.println("Le prix de location est " + rentalPrice3);
            friendlyAgency.addRentalClient(client2);
            double rentalPrice4 = friendlyAgency.rentVehicle(client2, vehicle3);
            System.out.println(client2.getName() + " a loue le vehicule : " + vehicle3 + " avec FriendlyRentalAgency");
            System.out.println("Le prix de location est " + rentalPrice4);            
        } catch (UnknownVehicleException | IllegalStateException e) {
            System.out.println("Erreur lors de la location avec FriendlyRentalAgency");
        }
    }
}
