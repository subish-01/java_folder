@FunctionalInterface
interface A             //functional interface - interface which has only one abstract method
{
    void display();
}
public class Functional_Interface 
{
    public static void main(String[] args) 
    {
        A obj = new A() 
        {
            public void display()
            {
                System.out.println("display message using inner class");
            }
        };
        obj.display();
    }
}
