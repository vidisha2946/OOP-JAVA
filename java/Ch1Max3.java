import java.util.*;

public class Ch1Max3 {
    public static void main(String[] args) {
        System.out.println("enter a value of A: ");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        System.out.println("enter a value of B: ");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        System.out.println("enter a value of C: ");
        Scanner sc3 = new Scanner(System.in);
        int c = sc3.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("A is greter");
            } else {
                System.out.println("Bb is greater");
            }
        } else {
            if (b > c) {
                System.out.println("B is greater");
            } else {
                System.out.println("C is greter");
            }
        }
    }
}
