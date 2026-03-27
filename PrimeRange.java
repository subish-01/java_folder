import java.util.Scanner;
public class PrimeRange 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the starting value: ");
        int start = scan.nextInt();
        System.out.print("Enter the Ending value :");
        int end = scan.nextInt();
        for(int i = start; i <= end; i++)
        {
            if(i < 2)
            {
                continue;
            }
            boolean isprime = true;

            for(int j = 2; j*j <= i;j++)
            {
                if(i % j == 0)
                {
                    isprime = false;
                }
            }
            if(isprime)
            {
                System.out.println(i);
            }
        }
    }
}
