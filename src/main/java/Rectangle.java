public class Rectangle extends Shape {
    private double length;              //Set variables
    private double width;
    private double height;

    public Rectangle() {                //Constructors
        this.length = 0.0;
        this.width = 0.0;
        this.height = 0.0;
    }

    public Rectangle(double l, double w, double h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public double getLength() {         //Get length
        return length;
    }

    public double getWidth() {          //Get width
        return width;
    }

    public double getHeight() {         //Get height
        return height;
    }

    public void setLength(double l) {   //Sets length
        this.length = l;
    }

    public void setWidth(double w) {    //Sets width
        this.width = w;
    }

    public void setHeight(double h) {   //Sets height
        this.height = h;
    }

    public double surfaceArea() {       //Calculate surface area of a rectangle
        return 2 * ((width * length) + (height * length) + (height * width));
    }

    public String toString() {          //Outputs rectangle calculations
        final StringBuilder sb = new StringBuilder("Rectangle {");
        sb.append("length=").append(length);
        sb.append("width=").append(width);
        sb.append("height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }

    public double volume() {            //Calculate volume of a rectangle
        return width * height * length;
    }
}