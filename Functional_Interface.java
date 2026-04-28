@FunctionalInterface
interface A             //functional interface - interface which has only one abstract method
{
    void display();
}
class B implements A
{
    @Override
    public void display() 
    {
        System.out.println("display a message");
    }  
}
public class Functional_Interface 
{
    public static void main(String[] args) 
    {
        B obj = new B();
        obj.display();
    }
}
