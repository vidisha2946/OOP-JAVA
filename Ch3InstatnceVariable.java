import java.util.*;
abstract class vegetable{
    String color;
    String veginame;
    abstract public String toString();
}
class Potato extends vegetable
{
    Potato(String c)
    {
        super.color=c;
        super.veginame="Potato";
    }
    public String toString()
    {
        return "color= " + super.color+" veginame= " +super.veginame;
    }
}
class Tamato extends vegetable
{
    Tamato(String c)
    {
        super.color=c;
        super.veginame="Tomato";
    }
    public String toString()
    {
        return "color= " + super.color+" veginame= " +super.veginame;
    }
}
class Brinjal extends vegetable
{
    Brinjal(String c)
    {
        super.color=c;
        super.veginame="Brinjal";
    }
    public String toString()
    {
        return "color= " + super.color+" veginame= " +super.veginame;
    }
}
public class ch3InstatnceVariable{
    public static void main(String[] args){
        Potato p1 = new Potato("Brown");
        System.out.println(p1);
        Tamato t1 = new Tamato("Red");
        System.out.println(t1);
        Brinjal b1 = new Brinjal("Purple");
        System.out.println(b1);
    }
}

