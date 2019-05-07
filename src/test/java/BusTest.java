import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Passenger passenger;

    @Before
    public void before(){
        bus = new Bus();
        passenger = new Passenger();
    }

    @Test
    public void busStartsEmpty(){
        bus.passengerCount();
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(passenger);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void checkBusCapacity(){
        assertEquals(5, bus.checkCapacity());
    }

    @Test
    public void busAtCapcity(){
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        assertEquals(true, bus.isFull());
        assertEquals(5, bus.passengerCount());
    }

    @Test
    public void busRemovePassenger(){
        bus.addPassenger(passenger);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }

}
