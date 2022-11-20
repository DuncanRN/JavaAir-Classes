import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Jeff", 16);
    }

    @Test
    public void passengerHasName() {
        assertEquals("Jeff", passenger.getName());
    }

    @Test
    public void passengerHasNumberOfBags() { assertEquals(16, passenger.getNumberOfBags() );}
}
