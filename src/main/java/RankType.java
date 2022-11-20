public enum RankType {
    CAPTAIN(1),
    FIRSTOFFICER(2),
    PURSER(3),
    FLIGHTATTENDANT(4);

    private final int value;
    RankType(int value) { this.value = value; }

    public int getValue(){
        return this.value;
    }
}
