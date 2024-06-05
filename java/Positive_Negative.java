import java.util.Scanner;
public class Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number: ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println(n +" : "+"negative");
        }
        else{
            System.out.println(n +" : "+"positive");
        }
    }
}
