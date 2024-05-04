import java.lang.String;
import java.util.*;
class Complex{
    int  re;
    int im;
    Complex(int re,int im)
    {
        this.re=re;
        this.im=im;
    }
    void add(Complex c){
        int re = this.re+c.re;
        int im = this.im+c.im;
        System.out.println(re+" + "+im+"i");
    }
}
public class Ch2ComplexAndImaginary
{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int re = 0;
        int im = 0;
        System.out.print("Enter a REAL NO(1) : ");
        re = s1.nextInt();
        System.out.print("Enter IMAGINARY NO(2) : ");
        im = s1.nextInt();
        Complex c1= new Complex(re,im);
        System.out.print("Enter a REAL NO(1) : ");
        re = s1.nextInt();
        System.out.print("Enter IMAGINARY NO(2) : ");
        im = s1.nextInt();
        Complex c2 = new Complex(re,im);
        c1.add(c2);
    }
}
