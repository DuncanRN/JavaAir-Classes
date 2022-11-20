import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

public class Flight {

    Pilot pilot;
    ArrayList<CabinCrewMember> crewMembers;
    ArrayList<Passenger> passengers;
    Plane plane;
    String flightNumber;
    String destination;
    String departureAirport;
    Date departureTime;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> crewMembers, ArrayList<Passenger> passengers, Plane plane, String flightNumber, String destination, String departureAirport, Date departureTime){
        this.pilot = pilot;
        this.crewMembers = crewMembers;
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return this.pilot;
    }

    public ArrayList<CabinCrewMember> getCrewMembers() {
        return this.crewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    public int numberOfSpareSeats() {
        return (plane.getCapacity()- this.passengers.size());
    }

    public void bookNewPassenger(Passenger passenger) {
        if(this.numberOfSpareSeats()>0){

            int randomNum = (int) (Math.random() * this.plane.getCapacity());
            AtomicBoolean seatTaken = new AtomicBoolean(false);
            passengers.forEach((p) -> { if( p.getSeatNumber() == randomNum){ seatTaken.set(true); } } );

            if(!seatTaken.get()){
                passengers.add(passenger);
                passenger.setSeatNumber(randomNum);
                passenger.setFlight(this.flightNumber);
            }
        }
    }


    public int getWeight() {
        return this.plane.getWeight();
    }

    public int getCapacity() {
        return this.plane.getCapacity();
    }
}
