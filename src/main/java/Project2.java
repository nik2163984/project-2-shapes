import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */
public class Project2 {
    public static void main(String[] args) {

        /*
        The following code works with the example design given.
         */

        ThreeDimensionalShape sphere = new Sphere(2.0);                 //Create shapes
        ThreeDimensionalShape cube = new Cube(5.0);
        ThreeDimensionalShape cylinder = new Cylinder(4.0, 1.0);
        ThreeDimensionalShape rectangle = new Rectangle(5.0, 5.0, 3.5);
        // We'll cover this stuff in module 4
        List<ThreeDimensionalShape> shapes = new ArrayList<>();         //Create array for shapes
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.add(rectangle);
        shapes.forEach(System.out::println);                            //Outputs shapes

        /*
        The following code works with the code given.
         */

        //Sphere sphere = new Sphere(2.0);
        //System.out.println(sphere);
    }
}
