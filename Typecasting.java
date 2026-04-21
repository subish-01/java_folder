class A
{
    public void show1()
    {
        System.out.println("In A show");
    }
}
class B extends A
{
    public void show2()
    {
        System.out.println("In B show");
    }
}
public class Typecasting 
{
    public static void main(String[] args) 
    {
        A obj = new B(); //upcasting refering to the parent class(implicitly done by compiler)
        obj.show1();

        B obj1 = (B) obj; //downcasting refering to the child class(explicitly done by user)
        obj1.show2();
    }
}
