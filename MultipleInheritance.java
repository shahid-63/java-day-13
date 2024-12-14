import java.util.*;
interface a
{
    public void r();
}
interface b
{
    public void r1();
}
class c implements a,b
{
    public void r()
    {
        System.out.println("Hello Students"); 
    }
    public void r1()
    {
        System.out.println("Hello Professors"); 
    }
}
public class MultipleInheritance
{
    public static void main(String []args)
    {
        c c1=new c();
        c1.r();
        c1.r1();

    }
}
