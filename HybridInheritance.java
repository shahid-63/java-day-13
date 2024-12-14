import java.util.*;
class gp
{
    public void r()
    {
        System.out.println("Hello iam Grandparent");
    }
}
class p1 extends gp
{
    public void r1()
    {
        System.out.println("Hello iam parent"); 
    }
}
interface p2
{
    void r2();
}
class d extends p1 implements p2
{
    public void r2()
    {
        System.out.println("Hello Parent2"); 
    }
    public void r3()
    {
        System.out.println("Hello iam child"); 
    }
}
public class HybridInheritance
{
    public static void main(String []args)
    {
        d d1=new d();
        d1.r();
        d1.r1();
        d1.r2();
        d1.r3();

    }
}
