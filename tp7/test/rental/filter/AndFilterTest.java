package rental.filter;

import org.junit.jupiter.api.*;

import rental.Vehicle;
import rental.VehicleFilter;

import static org.junit.jupiter.api.Assertions.*;

public class AndFilterTest{
    @Test
    public void addFilterTest(){
        AndFilter andFilter = new AndFilter();
        VehicleFilter filter1 = new MaxPriceFilter(100);
        VehicleFilter filter2 = new BrandFilter("peugeot");
        andFilter.addFilter(filter1);
        andFilter.addFilter(filter2);
        
    }   

    @Test
    public void AcceptTest(){
        VehicleFilter filtre1 = new MaxPriceFilter(500);
        VehicleFilter filtre2 = new BrandFilter("audi");
        AndFilter andfilter = new AndFilter();
        andfilter.addFilter(filtre1);
        andfilter.addFilter(filtre2);
        Vehicle vehicle1 = new Vehicle("audi", "blabla", 2003, 134.00);
        Vehicle vehicle2 = new Vehicle("toyota", "blibli", 2001, 432.21);
        assertTrue(andfilter.accept(vehicle1));
        assertFalse(andfilter.accept(vehicle2));

    }
}