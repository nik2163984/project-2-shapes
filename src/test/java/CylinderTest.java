import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void surfaceArea() {
        double expected = 471.23889803846896;
        ThreeDimensionalShape cylinder = new Cylinder(10.0,5.0);
        double actual = cylinder.surfaceArea();
        assertEquals(expected, actual);
    }

    @Test
    void volume() {
        double expected = 785.3981633974483;
        ThreeDimensionalShape cylinder = new Cylinder(10.0,5.0);
        double actual = cylinder.volume();
        assertEquals(expected, actual);
    }
}