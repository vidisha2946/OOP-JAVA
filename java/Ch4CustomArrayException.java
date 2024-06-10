import java.util.Scanner;

// Custom exception class for array index out of bounds
class ArrayIndexOutOfBoundsException extends Exception {
    public ArrayIndexOutOfBoundsException(String message) {
        super(message);
    }
}

public class Ch4CustomArrayException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define an array of size 5
        int[] array = new int[5];

        try {
            // Input index from the user
            System.out.print("Enter index (0 to 4): ");
            int index = scanner.nextInt();

            // Check if index is out of bounds
            if (index < 0 || index >= array.length) {
                throw new ArrayIndexOutOfBoundsException("Array index out of bounds");
            }

            // Access the element at the specified index
            int value = array[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error: Invalid input");
        } finally {
            scanner.close();
        }
    }
}
