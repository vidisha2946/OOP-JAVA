// Write a java program to create own exception for negative value exception ifthe user enter negative value
    import java.util.Scanner;
// Custom exception class for negative values
class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}
// Main class to demonstrate custom exception handling
public class Ch4NegativeExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a positive number: ");
            int number = scanner.nextInt();
            if (number < 0) {
                throw new NegativeValueException("Negative values are not allowed");
            }
            System.out.println("You entered: " + number);
        } catch (NegativeValueException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error: Invalid input");
        } finally {
            scanner.close();
        }
    }
}
