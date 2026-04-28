@FunctionalInterface
interface A
{
    void show();
}
public class Lambda 
{
    public static void main(String[] args)
    {
        A obj = () ->   //lambda expression
            {
                System.out.println("Hello world");
            };
        obj.show();
    }
}
