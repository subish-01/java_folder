import java.util.Scanner;

public class Armstrong 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int number = scan.nextInt();
        int sum = 0;
        int digits = 0;
        int temp = number;
        while(number != 0)
        {
            number = number / 10;
            digits++;
        }
        number = temp;
        while(number != 0)
        {
            int remainder = number % 10;
            sum = sum + (int)Math.pow(remainder,digits);
            number = number / 10;
        }
        if(temp == sum)
        {
            System.out.println("The given number is an armstrong number");
        }
        else
        {
            System.out.println("The given number is not an armstrong number");
        }
    }
}
