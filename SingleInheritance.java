class calculator
{
    public int add(int num1 , int num2)
    {
        return num1 + num2;
    }
    public int subtraction(int num1, int num2)
    {
        return num1 - num2;
    }
}
class advanceCalc extends calculator
{
    public int multiply(int num1,int num2)
    {
        return num1 * num2;
    }
    public int div(int num1, int num2)
    {
        return num1 / num2;
    }
}
public class SingleInheritance 
{
    public static void main(String[] args)
    {
        advanceCalc obj = new advanceCalc();
        System.out.println(obj.add(8, 4));
        System.out.println(obj.subtraction(9, 4));
        System.out.println(obj.multiply(3, 3));
        System.out.println(obj.div(8,4));
    }
}
