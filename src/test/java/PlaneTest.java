import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747, 100,  250);
    }

    @Test
    public void planeHasPlaneType() {
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

}
