interface A
{
    int age = 19;                //In interface every variable is static and final by default 
    String name = "Subish";      //so while declaring variables we must initalize them because of final
    void display();              //In interface every method by default is - public abstract
    void show();
}
class B implements A
{
    public void display()
    {
        System.out.println("displaying Implementation of the abstract method");
    }
    public void show()
    {
        System.out.println("Showing implementation of the abstract method");
    }
}
public class InterfacePractice 
{
    public static void main(String[] args)
    {
        //we cannot create object for interface
        B obj = new B();
        obj.display();
        obj.show();  
        //A.age = 20;      shows error because of final
        System.out.println(A.age);
        System.out.println(A.name);
    }
}
