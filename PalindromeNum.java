import java.util.Scanner;

public class PalindromeNum 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int original = number;
        int reverse = 0;
        while (number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        if(original == reverse)
        {
            System.out.print("The given number is a palindrome");
        }
        else
        {
            System.out.println("The given number is not a palindrome");
        }
        scan.close();
    }
}
