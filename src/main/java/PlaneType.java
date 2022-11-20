public enum PlaneType {
    BOEING747(1),
    CESSNA172(2),
    DOUGLASDC3(2),
    AITBUSA320(3);

    private final int value;
    PlaneType(int value) { this.value = value; }

    public int getValue(){
        return this.value;
    }
}
