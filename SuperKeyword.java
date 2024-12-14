import java.util.*;
class a
{
    public void r()
    {
        System.out.println("Hello Students");
    }
}
class b extends a
{
    public void r()
    {
        super.r();
        System.out.println("Hello Teachers");
    }
}
public class SuperKeyword
{
    public static void main(String []args)
    {
        b b1=new b();
        b1.r();
    }
}

