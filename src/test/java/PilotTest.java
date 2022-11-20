import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Jimmy", RankType.CAPTAIN, "PIL07 1234");
    }
    @Test
    public void pilotHasPilotLicenseNumber()
    {
        assertEquals("PIL07 1234", pilot.getPilotLicenseNumber());
    }

    @Test
    public void pilotHasName() {
        assertEquals("Jimmy", pilot.getName());
    }

    @Test
    public void pilotCanFlyPlane() {
        assertEquals("cleared for takeoff", pilot.flyPlane());
    }


}
