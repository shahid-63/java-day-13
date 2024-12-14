import java.util.*;
class a
{
    public void p1()
    {
        System.out.println("Hello Students");
    }
}
class b extends a
{
    public void r()
    {
        System.out.println("Hello Teachers"); 
    }
}
class c extends a
{
    public void r1()
    {
        System.out.println("Hello Professors"); 
    }
}
public class HieraricalInheritance
{
    public static void main(String []args)
    {
        b b1=new b();
        b1.p1();
        b1.r();
        c c1=new c();
        c1.r1();
        c1.p1();

    }
}
