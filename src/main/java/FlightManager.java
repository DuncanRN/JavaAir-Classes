public class FlightManager {
    private Flight flight;
    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Object calcWeightAllowedPerPassenger() {
        return(((this.flight.getWeight())/2)/this.flight.getCapacity());
//        return(((this.flight.getWeight())/2)/this.flight.getPassengers().size());
    }

    public int calcBaggageWeightAllocated() {
        return (Integer)(calcWeightAllowedPerPassenger()) * (this.flight.getPassengers().size());
    }

    public int calcBaggageWeightLeft() {
        return (Integer)(flight.getWeight() / 2) - calcBaggageWeightAllocated();
    }
}
