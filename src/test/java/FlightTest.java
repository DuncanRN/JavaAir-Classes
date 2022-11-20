import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Date departureTime;
    Flight flight;
    Pilot pilot;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    ArrayList<CabinCrewMember> crewMembers;

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    ArrayList<Passenger> passengers;

    Plane plane;
    @Before
    public void before(){

        departureTime = new Date();
        pilot = new Pilot("Jerry",  RankType.CAPTAIN, "PIL07 551");
        cabinCrewMember1 = new CabinCrewMember("Annie", RankType.PURSER);
        cabinCrewMember2 = new CabinCrewMember("Gill", RankType.FIRSTOFFICER);
        crewMembers = new ArrayList<>();
        crewMembers.add(cabinCrewMember1);
        crewMembers.add(cabinCrewMember2);

        passenger1 = new Passenger("Tony", 5);
        passenger2 = new Passenger("Angela", 1);
        passenger3 = new Passenger("Tommy", 2);
        passengers = new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger2);


        plane = new Plane(PlaneType.CESSNA172, 150, 600);

        flight = new Flight(pilot, crewMembers, passengers, plane, "TR112", "MEL", "GlA", departureTime);



    }

    @Test
    public void canGetPilot(){
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void canGetCrewMembers(){
        assertEquals(crewMembers, flight.getCrewMembers());
    }


    @Test
    public void canPassengers(){
        assertEquals(passengers, flight.getPassengers());
    }

    @Test
    public void canReturnNumberOfAvailableSeats(){
        assertEquals(148, flight.numberOfSpareSeats());
    }

    @Test
    public void canAddNewPassenger(){
        flight.bookNewPassenger(passenger3);
        assertEquals(147, flight.numberOfSpareSeats());
    }


}
