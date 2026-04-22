abstract class A
{
    public abstract void display();
}
public class InnerClass 
{
    public static void main(String[] args)
    {
       A obj = new A() //we are not creating the object of abstract class instead we create the object for inner class
       {
            public void display() //implementation part
            {
                System.out.println("Implemented the abstract method using anonymous inner class"); 
            }
       };
       obj.display();
    }
}
