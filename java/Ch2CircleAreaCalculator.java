import java.util.Scanner;

class Circle {
    double radius;

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Ch2CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Create Circle object using parameterized constructor
        Circle circle = new Circle(radius);

        // Calculate and print the area of the circle
        double area = circle.calculateArea();
        System.out.println("Area of the circle: " + area);

        scanner.close();
    }
}

