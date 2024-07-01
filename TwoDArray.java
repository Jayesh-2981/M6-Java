import java.util.*;
public class TwoDArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter Number of Columns : ");
        int cols = sc.nextInt();

        int [] [] arr = new int[rows][cols];
        System.out.println("Enter Elements in Array : ");

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                arr [i][j]= sc.nextInt();
            }
        }

        for(int i=0; i<rows;i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
