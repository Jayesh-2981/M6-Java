import java.util.*;
public class SumProduct 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Array Size : ");
        int size = sc.nextInt();
        System.out.print("Enter Array Elements : ");
        int [] arr = new int[size];

        int sum =0;
        int product = 1;

        //inserting array elements dynamically
        for(int i=0; i<size;i++)
        {
            arr[i] = sc.nextInt();   
            sum=sum+arr[i];
            product = product*arr[i];     
        }

        System.out.println("Sum : "+sum);
        System.out.println("Product : "+product);

        sc.close();
    }    
}