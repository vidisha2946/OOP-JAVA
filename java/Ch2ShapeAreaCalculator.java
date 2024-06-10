class AreaCalculator {
    // Method to calculate area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    // Method to calculate area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }
    // Method to calculate area of a triangle
    public double calculateArea(double base, double height, String shape) {
        if (shape.equalsIgnoreCase("triangle")) {
            return 0.5 * base * height;
        } else {
            System.out.println("Invalid shape specified. Cannot calculate area.");
            return 0.0;
        }
    }
}
public class Ch2ShapeAreaCalculator {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // Calculate area of circle
        double circleArea = calculator.calculateArea(5.0);
        System.out.println("Area of circle: " + circleArea);

        // Calculate area of rectangle
        double rectangleArea = calculator.calculateArea(4.0, 6.0);
        System.out.println("Area of rectangle: " + rectangleArea);

        // Calculate area of triangle
        double triangleArea = calculator.calculateArea(3.0, 4.0, "triangle");
        System.out.println("Area of triangle: " + triangleArea);
    }
}
