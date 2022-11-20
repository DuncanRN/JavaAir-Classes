public class Passenger extends Person{
    private int numberOfBags;
    private String flight;
    private int seatNumber;

    public Passenger(String name, int numberOfBags){
        super(name);
        this.numberOfBags  = numberOfBags;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
