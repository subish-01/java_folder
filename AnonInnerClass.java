class A
{
    public void show()
    {
        System.out.println("In A show");
    }
}
public class AnonInnerClass 
{
    public static void main(String[] args)
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("In A show with new implementation");
            }
        };
        obj.show();
    }
}
