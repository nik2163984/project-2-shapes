public class Cylinder extends Shape {
    private double height;              //Sets variables
    private double radius;

    public Cylinder() {                 //Constructor
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cylinder(double h, double r) {
        this.height = h;
        this.radius = r;
    }

    public double getHeight() {         //Gets height
        return height;
    }

    public double getRadius() {         //Gets radius
        return radius;
    }

    public void setHeight(double h) {   //Sets height
        this.height = h;
    }

    public void setRadius(double r) {   //Sets radius
        this.radius = r;
    }

    public double surfaceArea() {       //Calculates surface area of a cylinder
        return (2 * Math.PI * height * radius) + (2 * Math.PI * Math.pow(radius, 2));
    }

    public String toString() {          //Outputs cylinder calculations
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("height=").append(height);
        sb.append("radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }

    public double volume() {            //Calculates volume of a cylinder
        return Math.PI * Math.pow(radius, 2) * height;
    }
}