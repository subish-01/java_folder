//DYNAMIC METHOD DISPATCH -- RUN TIME POLYMORPHISM

//POLYMORMISM -- MANY FORMS
class A
{
    public void show()
    {
        System.out.println("In A show");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("In B show");
    }
}
class C extends A
{
    public void show()
    {
        System.out.println("In C show");
    }
}
public class DynamicDispatch 
{
    public static void main(String[] args)
    {
        A obj = new A();  //Type is of class A object is of class A
        obj.show();

        //Possible only in inheritance
        obj = new B();  //Type is of class A object is of class B
        obj.show();

        obj = new C();  //Type is of class A object is of class C
        obj.show();


        //Run-time polymorphism,which method to execute will be decided on the run time
    }
}
