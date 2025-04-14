package rental;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class RentalAgencyTest {
    
    private RentalAgency agency;
    private Client client;
    private Vehicle vehicle;

    @BeforeEach
    public void creation(){
        agency = new RentalAgency();
        client = new Client("blabla", 20);
        vehicle = new Vehicle("audi", "rs6", 2020, 145.00);
        agency.addVehicle(vehicle);
        agency.hasRentedAVehicle(client);
    }

    @Test
    public void testAddVehicle(){
        agency.addVehicle(vehicle);
        assertTrue(agency.getAllVehicles().contains(vehicle));
    }

    @Test
    public void testRemoveVehicle() throws UnknownVehicleException{
        agency.addVehicle(vehicle);
        assertTrue(agency.getAllVehicles().contains(vehicle));
        agency.removeVehicle(vehicle);
        assertTrue(agency.getAllVehicles().contains(vehicle));
    }

    @Test
    public void testHasRentedAVehicle() throws IllegalStateException, UnknownVehicleException{
        assertFalse(agency.hasRentedAVehicle(client));
        agency.rentVehicle(client, vehicle);
        assertTrue(agency.hasRentedAVehicle(client));
    }

    @Test
    public void testRentVehicle() throws IllegalStateException, UnknownVehicleException{
        double rentalPrice = agency.rentVehicle(client, vehicle);
        assertTrue(agency.isRented(vehicle));
        assertEquals(vehicle.getDailyPrice(), rentalPrice);
        assertTrue(agency.hasRentedAVehicle(client));
    }

    @Test
    public void testRentUnknownVehicle() {
        assertThrows(UnknownVehicleException.class, () -> {
            agency.rentVehicle(client, new Vehicle("Unknown", "Model", 2022, 60.0));
        });
    }

    @Test
    public void testReturnVehicle() throws UnknownVehicleException{
        agency.addVehicle(vehicle);
        agency.rentVehicle(client, vehicle);
        agency.returnVehicle(client);
        assertFalse(agency.isRented(vehicle));
    }

}
