import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Jerry", RankType.FLIGHTATTENDANT);
    }

    @Test
    public void crewMemberHasRankType(){
        assertEquals(RankType.FLIGHTATTENDANT, cabinCrewMember.getRankType());
    }

    @Test
    public void canRelyMessages() { assertEquals("Please remain seated with your seat belt fastened and keep the aisle clear until we are parked at the gate.", cabinCrewMember.relayMessage());}

}
