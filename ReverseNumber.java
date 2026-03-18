import java.util.Scanner;
public class ReverseNumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number :");
        int number = scan.nextInt();
        int reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("The reverse of the number is "+reverse);
        scan.close();
    }
}