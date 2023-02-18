import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CubeTest {

    @Test
    void surfaceArea() {
        double expected = 600.0;
        ThreeDimensionalShape cube = new Cube(10.0);
        double actual = cube.surfaceArea();
        assertEquals(expected, actual);
    }

    @Test
    void volume() {
        double expected = 1000.0;
        ThreeDimensionalShape cube = new Cube(10.0);
        double actual = cube.volume();
        assertEquals(expected, actual);
    }
}