import java.util.*;
public class Week
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number (1-7): ");
        int n = sc.nextInt();
        switch (n) 
        {
            case 1, 2, 3, 4, 5: 
            {
                System.out.println("weekday");
                break;
            }
            case 6, 7: 
            {
                System.out.println("weekend");
                break;
            }
            default: 
            {
                System.out.println("invalid number");
                break;
            }
        }
    }
}
