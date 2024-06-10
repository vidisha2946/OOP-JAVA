import java.util.*;
public class Ch1PerfectNumber
{
    public static boolean isPerfect(int n){;
    int sum=0;
    for(int i=1;i<n;i++){
        if(n%i==0)
        {
           sum += i;
        }
    }
        return sum==n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        int n = sc.nextInt();
        if(isPerfect(n))
        {
            System.out.println(n+" "+"is perfect");
        }
        else
        {
            System.out.println(n+" "+"is not perfect");
        }
    }
}