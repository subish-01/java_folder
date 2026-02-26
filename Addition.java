import java.util.Scanner;
public class Addition
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number 1: "); // user input number 1
        Double num1 = scan.nextDouble();
        System.out.print("Enter the number 2: "); // user input number 2
        Double num2 = scan.nextDouble();
        Double sum = num1 + num2;
        System.out.println(sum);
        scan.close();
    }
}
