import java.util.Scanner;

public class Ch1MatrixAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input number of rows and columns for the matrices
        System.out.print("Enter the number of rows for the matrices: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns for the matrices: ");
        int columns = input.nextInt();
        // Initialize matrices
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] sumMatrix = new int[rows][columns];
        // Input elements of first matrix
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                matrix1[i][j] = input.nextInt();
            }
        }
        // Input elements of second matrix
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                matrix2[i][j] = input.nextInt();
            }
        }        
        // Add the matrices
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        // Display the result
        System.out.println("Sum of the matrices:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
