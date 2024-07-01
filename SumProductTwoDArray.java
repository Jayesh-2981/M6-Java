import java.util.Scanner;

public class SumProductTwoDArray
{
    public static void main(String[] args) 
    {
        int sum =0;
        int product=1;
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
                sum=sum+arr[i][j];
                product = product*arr[i][j];   
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

        System.out.println("Enter Total sum : "+sum);
        System.out.println("Enter Product : "+product);

        sc.close();
    }
}
