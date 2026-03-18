import java.util.Scanner;

public class swap 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();
        System.out.println("Numbers before swapping are "+num1+" and "+num2);
        // swap numbers
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Numbers after swapping "+num1+" are "+num2);
        scan.close();
    }
}
