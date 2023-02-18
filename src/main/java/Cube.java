public class Cube extends Shape {
    private double width;               //Sets variables

    public Cube() {                     //Constructors
        super();
        this.width = 0.0;
    }

    public Cube(double w) {
        super();
        this.width = w;
    }

    public double getWidth() {          //Gets width
        return width;
    }

    public void setWidth(double w) {    //Sets width
        this.width = w;
    }

    public double surfaceArea() {       //Calculates surface area for a cube
        return 6.0 * Math.pow(width,2);
    }

    public String toString() {          //Outputs cube calculations
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }

    public double volume() {            //Calculates volume of cube
        return Math.pow(width,3);
    }
}