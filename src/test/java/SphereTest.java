import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SphereTest {

    @Test
    void surfaceArea() {
        double expected = 615.7521601035994;
        ThreeDimensionalShape sphere = new Sphere(7.0);
        double actual = sphere.surfaceArea();
        assertEquals(expected, actual);
    }

    @Test
    void volume() {
        double expected = 1436.7550402417319;
        ThreeDimensionalShape sphere = new Sphere(7.0);
        double actual = sphere.volume();
        assertEquals(expected, actual);
    }
}