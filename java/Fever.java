import java.util.Scanner;

public class Fever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a temperature: ");
        double temp = sc.nextDouble();
        if(temp>=103.5){
            System.out.println("fever");
        }
        else{
            System.out.println("no fever");
        }

    }
}
