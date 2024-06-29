import java.util.Arrays;

public class EvenElementsOfArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.err.println("Given Array : "+Arrays.toString(arr));
        //For finding the count of even elements in array 
        int len=0;
        for(int i=0; i<arr.length;i++)
        {
            if(i%2>0)
                len++;
        }
        
        int [] evenArray = new int[len];

        //For storing the even elements in new Array
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i%2>0)
                evenArray[index++]=arr[i];
        }

        System.err.println("Array of Even Elements : "+Arrays.toString(evenArray));
    }
}
