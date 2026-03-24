import java.util.Scanner;
public class PerfectNumber 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sumofFactor = 1;
        if(number <= 0)
        {
            System.out.println("The given number is not a perfect number");
        }
        else
        {
            for(int i = 2; i<= number/2 ;i++)
            {
                if(number % i == 0)
                {
                    sumofFactor = sumofFactor + i;
                }
            }
        }
        if(number == sumofFactor)
        {
            System.out.println("The given number is a perfect number");
        }
        else
        {
            System.out.println("The given number is not a perfect number");
        }
        scan.close();
    }
}
