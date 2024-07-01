// Write a java program to merger two arrays into one single array
import java.util.*;
public class MergeTwoArrays 
{
    public static void main(String[] args) 
    {
        //1st Array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Array Size of Array 1 : ");
        int size1 = sc.nextInt();
        System.out.print("Enter Array Elements of Array 1 : ");
        int [] arr1 = new int[size1];  

        for(int i=0; i<size1;i++)
        {
            arr1[i] = sc.nextInt(); 
        }
        
        //2nd Array
        System.out.print("Enter The Array Size of Array 2 : ");
        int size2 = sc.nextInt();
        System.out.print("Enter Array Elements of Array 2 : ");
        int [] arr2 = new int[size2];
        
        for(int i=0; i<size2;i++)
        {
            arr2[i] = sc.nextInt(); 
        }

        // Merged Array
        int mergedArraySize = size1+size2;
        int mergedArray[] = new int[mergedArraySize];
        for(int i=0; i<size1; i++)
        {
            mergedArray[i]=arr1[i];
        }
        
        for(int i=0; i<size2;i++)
        {
            mergedArray [size1+i]=arr2[i];
        }


        System.out.println("First Array : "+Arrays.toString(arr1));
        System.out.println("Second Array : "+Arrays.toString(arr2));
        System.out.println("Merged Array : "+Arrays.toString(mergedArray));


        sc.close();
    }
}
