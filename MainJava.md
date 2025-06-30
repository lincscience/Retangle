# Assignment2
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This program uses object-oriented principles to calculate the area and volume of various shapes.
 *
 * Purpose: To demonstrate the use of classes, objects, and methods for geometric calculations.
 * Function:
 * Part 1: Calculates the area of a rectangle based on user input.
 * Part 2: Calculates the volume of a cube, cylinder, and sphere based on user input.
 * It includes error handling for invalid user input.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- PART 1: RECTANGLE AREA ---
        System.out.println("--- Part 1: Rectangle Area Calculation ---");
        double length = getValidInput(scanner, "Enter length");
        double width = getValidInput(scanner, "Enter width");

        // Create an instance of the Rectangle class
        Rectangle myRectangle = new Rectangle(length, width);
        System.out.println("The area is " + myRectangle.getArea());
        System.out.println(); // Blank line for spacing

        // --- PART 2: VOLUME CALCULATIONS ---
        System.out.println("--- Part 2: Volume Calculations ---");

        // --- Cube ---
        System.out.println("First, the Cube.");
        double sideLength = getValidInput(scanner, "Enter the side length of the cube");
        Cube myCube = new Cube(sideLength);
        System.out.println("The volume of the cube is " + myCube.getVolume());
        System.out.println();

        // --- Cylinder ---
        System.out.println("Next, the Cylinder.");
        double cylinderRadius = getValidInput(scanner, "Enter cylinder radius");
        double cylinderHeight = getValidInput(scanner, "Enter cylinder height");
        Cylinder myCylinder = new Cylinder(cylinderRadius, cylinderHeight);
        System.out.println("The volume of the cylinder is " + myCylinder.getVolume());
        System.out.println();

        // --- Sphere ---
        System.out.println("Finally, the Sphere.");
        double sphereRadius = getValidInput(scanner, "Enter sphere radius");
        Sphere mySphere = new Sphere(sphereRadius);
        System.out.println("The volume of the sphere is " + mySphere.getVolume());
        System.out.println();

        System.out.println("All calculations are complete.");
        scanner.close();
    }

    /**
     * A helper method to get a valid number from the user.
     * It will re-prompt until a valid double is entered.
     * @param scanner The Scanner object to read input.
     * @param prompt The message to show the user.
     * @return A valid double entered by the user.
     */
    public static double getValidInput(Scanner scanner, String prompt) {
        double value;
        while (true) {
            System.out.println(prompt);
            try {
                value = scanner.nextDouble();
                return value; // Exit loop and return the valid number
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}
