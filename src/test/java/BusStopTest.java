import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    Bus bus;
    Passenger passenger;
    BusStop busstop;

    @Before
    public void before(){
        bus = new Bus("Edinburgh");
        passenger = new Passenger();
        busstop = new BusStop("Usher Hall");
    }

    @Test
    public void queueEmpty(){
        assertEquals(0, busstop.queueCount());
    }

    @Test
    public void personJoinsQueue(){
        busstop.addPassenger(passenger);
        assertEquals(1, busstop.queueCount());
    }

    @Test
    public void personLeavesQueue(){
        busstop.addPassenger(passenger);
        busstop.removePassenger();
        assertEquals(0, busstop.queueCount());
    }
}
