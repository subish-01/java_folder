import java.util.Scanner;
public class EvenOdd 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        if((number & 1) == 1)
        {
            System.out.println("The given number is Odd");
        }
        else
        {
            System.out.println("The given number is even");
        }
        scan.close();
    }
}
