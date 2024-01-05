import java.util.Scanner;
public class CircleAreaCalculator 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of circle is " + radius + " is: "+ area);
        scanner.close();
    }
}
