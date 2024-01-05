// import java.util.*;
import java.util.Scanner;
public class S 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String str=sc.next();
        if(str.equals("+"))
        {
            System.out.println(a+b);
        }
        else if(str.equals("-"))
        {
            System.out.println(a-b);
        }
        else if(str.equals("*"))
        {
            System.out.println(a*b);
        }
        else if(str.equals("/"))
        {
            System.out.println(a/b);
        }
    }
}
