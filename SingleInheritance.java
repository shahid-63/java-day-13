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
public class SingleInheritance
{
    public static void main(String []args)
    {
        a a1=new a();
        a1.p1();
        b b1=new b();
        b1.p1();
        b1.r();

    }
}
