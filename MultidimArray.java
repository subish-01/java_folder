import java.util.Scanner;
public class MultidimArray 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of arrays required :");
        int rows = scan.nextInt();
        System.out.print("Enter the number of elements required in an array :");
        int elements = scan.nextInt();
        int[][] array_2D = new int[rows][elements];
        for(int i = 0;i < rows; i++)
        {
            for(int j = 0;j < elements;j++)
            {
                array_2D[i][j] = scan.nextInt();
            }
        }
        for(int i = 0;i < rows; i++)
        {
            for(int j = 0;j < elements;j++)
            {
                System.out.print(array_2D[i][j]+ " ");
            }
            System.out.println();
        }



        //Printing the elements of multidimensional array using for-each loop
        for(int n[] : array_2D)
        {
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
