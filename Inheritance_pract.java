class A                   //super class
{
    public A()
    {
        System.out.println("In A");
    }
}
class B extends A       //sub class
{
    public B()
    {
        System.out.println("In B");
    }
    public B(int n)
    {
        this();
        System.out.println("In B int");
    }
}
public class Inheritance_pract 
{
    public static void main(String[] args)
    {
        B obj = new B(10);
    }
}
