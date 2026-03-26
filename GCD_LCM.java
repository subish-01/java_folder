import java.util.Scanner;
public class GCD_LCM 
{

    int GCD(int a, int b)
    {
        while(b != 0)
        {
            int temp = b;           
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = scan.nextInt();
        GCD_LCM obj = new GCD_LCM();
        int GCD_value = obj.GCD(num1,num2);
        int LCM_value = (num1 * num2) / GCD_value;
        System.out.println("The GCD of two numbers is "+GCD_value);
        System.out.println("The LCM of two numbers is "+LCM_value);
        scan.close();
    }
}
