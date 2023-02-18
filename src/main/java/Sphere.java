public class Sphere extends Shape {

    private double radius;

    public Sphere() {                       //Constructor
        super();
        this.radius = 0.0;
    }

    public Sphere(double v) {
        super();
        this.radius = v;
    }

    public double getRadius() {             //Get radius
        return radius;
    }

    public void setRadius(double radius) {  //Set radius
        this.radius = radius;
    }

    public double surfaceArea() {           //Calculates surface area of a sphere
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    public double volume() {                //Calculates surface area of a sphere
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {              //Outputs sphere calculations
        final StringBuilder sb = new StringBuilder("Sphere {");
        sb.append("radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}