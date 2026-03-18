import java.util.Scanner;
public class SumOfDigits
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the number : ");
        int number = scan.nextInt();
        while(number != 0)
        {
            int remainder = number % 10;
            sum = sum + remainder;
            number = number / 10;
        }
        System.out.println("Sum of digits is "+sum);
        scan.close();
    }
}