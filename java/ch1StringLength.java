import java.util.Scanner;
public class ch1StringLength 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str =  sc.nextLine();
        int length = str.length();
        sc.close();
        System.out.println("Lenght of the string is : "+length);
        System.out.println("<----Half of the string is---->");
        System.out.println(str.substring(0,length/2));
    }
}
