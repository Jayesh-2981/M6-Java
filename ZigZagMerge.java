import java.util.Arrays;

public class ZigZagMerge {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {6,7,8,9,10};

        System.err.println("First Array : "+Arrays.toString(arr1));
        System.err.println("Second Array : "+Arrays.toString(arr2));

        int size = arr1.length+arr2.length;
        int [] zigZag = new int [size];
        
        int index=0;
        for(int i=0; i<size;i++)
        {
            if(i<arr1.length)
            {
                zigZag[index++]=arr1[i];
            }

            if(i<arr2.length)
            {
                zigZag[index++]=arr2[i];
            }
        }
        
        System.err.println("Merged ZigZag Array : "+Arrays.toString(zigZag));
    }
}
