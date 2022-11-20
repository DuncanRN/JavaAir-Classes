public class CabinCrewMember extends Person {

    private RankType rankType;
    private String name;

    public CabinCrewMember(String name,  RankType rankType){
        super(name);
        this.rankType = rankType;

    }
    public RankType getRankType() {
        return rankType;
    }

    public String relayMessage() {
        return"Please remain seated with your seat belt fastened and keep the aisle clear until we are parked at the gate.";
    }
}
