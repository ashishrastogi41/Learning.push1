class a
{
    public void printa()
    {
        System.out.println("Class A");
    }
}
class b extends a
{
    public void printb()
    {
        System.out.println("Class B");
    }
}
class c extends a
{
    public void printc()
    {
        System.out.println("Class C");
    }
}
class d extends a
{
    public void printd()
    {
        System.out.println("Class D");
    }
}
public class inheritance{
    public static void main(String[] args)
    {
        b obj =new b();
        obj.printa();
        obj.printb();
        c obj1=new c();
        obj1.printa();
        obj1.printc();
        d obj2=new d();
        obj2.printa();
        obj2.printd();
    }
}