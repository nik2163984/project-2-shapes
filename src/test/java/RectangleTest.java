import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void surfaceArea() {
        double expected = 550.0;
        ThreeDimensionalShape rectangle = new Rectangle(10.0,5.0,15.0);
        double actual = rectangle.surfaceArea();
        assertEquals(expected, actual);
    }

    @Test
    void volume() {
        double expected = 750.0;
        ThreeDimensionalShape rectangle = new Rectangle(10.0,5.0,15.0);
        double actual = rectangle.volume();
        assertEquals(expected, actual);
    }
}