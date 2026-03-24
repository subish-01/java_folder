import java.util.Scanner;
public class Strongnumber 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sum = 0;
        int temp = number;
        if(number < 0)
        {
            System.out.println("Enter a valid number");
        }
        else
        {
            while(number != 0)
            {
                int remainder = number % 10;
                int fact = 1;
                for(int i = remainder; i>0;i--)
                {
                    fact = fact * i;
                }
                sum = sum + fact;
                number = number / 10;
            }
        }
        if(temp == sum)
        {
            System.out.println("The given number is an strong number");
        }
        else
        {
            System.out.println("The given number is not a strong number");
        }
    }
}
