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
class c extends b
{
    public void r1()
    {
        System.out.println("Hello Professors"); 
    }
}
public class MultiLevelInheritance
{
    public static void main(String []args)
    {
        c c1=new c();
        c1.p1();
        c1.r();
        c1.r1();

    }
}
