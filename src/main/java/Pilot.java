public class Pilot extends CabinCrewMember{
    private String pilotLicenseNumber;

    public Pilot(String name, RankType rankType, String pilotLicenseNumber){
        super(name, rankType);
        this.pilotLicenseNumber = pilotLicenseNumber;
    }

    public String getPilotLicenseNumber() {
        return pilotLicenseNumber;
    }

    public String flyPlane() {
        return "cleared for takeoff";
    }
}
