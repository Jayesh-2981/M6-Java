// Write a java program to store even and odd elements in an array

import java.util.*;;
public class StoreEvenOdd 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Array Size : ");
        int size = sc.nextInt();
        System.out.print("Enter Array Elements : ");
        int [] arr = new int[size];

        //Inserting array Elements Dynamically
        for(int i=0; i<size;i++)
        {
            arr[i] = sc.nextInt(); 
        }

        int evenCount=0;
        int oddCount=0;
        for (int i=0; i<size;i++)
        {
            if(arr[i]%2==0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }

        int evenArray [] = new int[evenCount];
        int oddArray [] = new int[oddCount];


        int index1=0;
        int index2=0;
        for(int i=0; i<size;i++)
        {
            if(arr[i]%2==0)
            {
                evenArray[index1++]=arr[i];
            }
            else
            {
                oddArray[index2++]=arr[i];
            }
        }

        System.out.println("Even Array is : "+Arrays.toString(evenArray));
        System.out.println("Odd Array is : "+Arrays.toString(oddArray));
        sc.close();
    }    
}
