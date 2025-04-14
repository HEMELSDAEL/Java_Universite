package rental.agency;

import org.junit.jupiter.api.*;

import rental.Client;
import rental.UnknownVehicleException;
import rental.Vehicle;

import static org.junit.jupiter.api.Assertions.*;

public class FriendlyRentalAgencyTest {
    
    private FriendlyRentalAgency agency;
    private Client client;
    private Vehicle vehicle;

    @BeforeEach
    public void creation(){
        agency = new FriendlyRentalAgency(1, 10);
        client = new Client("blabla", 20);
        vehicle = new Vehicle("audi", "rs6", 2020, 145.00);
        agency.addVehicle(vehicle);
    }

    @Test
    public void testGetRemise(){
        assertEquals(1, agency.getRemise());
        agency.setRemise(3);
        assertEquals(3, agency.getRemise());
    }

    @Test
    public void testGetPourcentage(){
        assertEquals(10, agency.getPourcentage());
        agency.setPourcentage(30);
        assertEquals(30, agency.getPourcentage());
    }

    @Test
    public void getFidelity() throws UnknownVehicleException{
        assertEquals(0, agency.getFidelity(client));
        agency.addRentalClient(client);
        assertEquals(1, agency.getFidelity(client));
        agency.addRentalClient(client);
        assertEquals(2, agency.getFidelity(client));
    }

    @Test
    public void testAddRentalClientWithRemise(){
        for (int i = 0; i < agency.getRemise(); i++) {
            agency.addRentalClient(client);
        }
        assertEquals(1, agency.getFidelity(client));
    }

    @Test 
    public void testAddRentalClientWithoutRemise(){
        agency.addRentalClient(client);
        assertEquals(1, agency.getFidelity(client));
    }

    @Test
    public void testAddRentalClientManyTimes(){
        for (int i = 0; i < 5; i++) {
            agency.addRentalClient(client);
        }
        assertEquals(5, agency.getFidelity(client));
    }


}
