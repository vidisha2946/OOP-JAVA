import java.util.*;
public class LinearBinaryDemo {
    public static void main(String[] args) {
        int[] a = { 1, 2, 5, 4, 2, 6, 7, 8, 9, 8, 4, 3, 2, 1, 0 };
        System.out.println("Enter a search number: ");
        Scanner sc = new Scanner(System.in);
        int ValueFound = sc.nextInt();
        boolean isFound = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ValueFound) {
                System.out.println("Nuumber fount at " + i);
                isFound = true;
                // break;
            }
        }
        if (!isFound) {
            System.out.println("Number is not found");
        }

    }
}
