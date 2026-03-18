import java.util.Scanner;
public class LargestNumber 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = scan.nextInt();
        System.out.print("Enter the number 3: ");
        int num3 = scan.nextInt();
        if((num1 > num2 ) && (num1 > num3))
        {
            System.out.println("The greatest number is "+num1);
        }
        else if((num2 > num1) && (num2 > num3))
        {
            System.out.println("The greatest number is "+num2);
        }
        else if(num1 == num2 && num2 == num3)
        {
            System.out.println("All numbers are equal");
        }
        else
        {
            System.out.println("The greatest number is "+num3);
        }
        scan.close();
    }
}
