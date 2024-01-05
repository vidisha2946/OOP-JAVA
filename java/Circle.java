import java.util.Scanner;
public class Circle 
{
    public static void main(String[] args) 
    {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter r num: ");
        double R=r.nextDouble();
        System.out.println("Area of circle is = "+(3.14*R*R));
    }
}
