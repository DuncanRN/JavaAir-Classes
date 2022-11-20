public class Plane {
    private PlaneType planeType;
    private int capacity;
    private int weight;


    public Plane(PlaneType planeType, int capactity, int weight){
        this.planeType = planeType;
        this.capacity = capactity;
        this.weight = weight;
    }
    public PlaneType getPlaneType() {
        return this.planeType;
    }


    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
