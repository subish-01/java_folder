import java.util.Scanner;

public class PrimeNumber 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scan.nextInt();
        boolean isprime = true;
        if(number <= 1)
        {
            isprime = false;
        }
        else
        {
            for(int i = 2; i*i <= number;i++)
            {
                if(number % i == 0)
                {
                    isprime = false;
                }
            }
        }
        if(isprime)
        {
            System.out.println("The given number is a prime number");
        }
        else
        {
            System.out.print("The given number is not a prime number");
        }
        scan.close();
    }
}
