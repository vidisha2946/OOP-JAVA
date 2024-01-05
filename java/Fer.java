import java.util.Scanner;

public class Fer 
{
    public static void main(String[] args) 
    {
        Scanner f=new Scanner(System.in);
        System.out.println("enter a value of f: ");
        double F=f.nextDouble();
        System.out.println("calcius is = "+((F-32)*5/9));
    }
}
