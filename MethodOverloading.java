/* 
    Method overloading can be done by
    1)number of parameter
    2)Order of parameter
    3)Type of parameter
 */
class addition
{
    public int subtract(int num1,int num2)
    {
        return num1 - num2;
    }
    public int subtract(int num1 , int num2 , int num3)         //overloading
    {
        return num1 - num2 - num3;
    }
}
public class MethodOverloading 
{
    public static void main(String[] args)
    {
        addition obj = new addition();
        int res1 = obj.subtract(3,5);
        int res2 = obj.subtract(4,3,1);
        System.out.print(res1 + res2);
    }
}
