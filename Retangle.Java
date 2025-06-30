/**
 * Represents a Rectangle. This class holds the dimensions
 * and provides a method to calculate the area.
 */
public class Rectangle {
    private double length;
    private double width;

    // Constructor to initialize a new Rectangle object
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate and return the area
    public double getArea() {
        return this.length * this.width;
    }
}
