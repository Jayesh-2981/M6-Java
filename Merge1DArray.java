import java.util.Arrays;

/**
 * Merge1DArray
 */
public class Merge1DArray {

    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};  
        int [] arr2 = {6,7,8,9,10};

        System.err.println("Array 1 : "+ Arrays.toString(arr1));
        System.err.println("Array 2 : "+ Arrays.toString(arr2));

        int size = arr1.length+arr2.length;
        int [] mergedArray = new int[size];
        int index =0;

        for(int i : arr1)
            mergedArray[index++]=i;

        for(int i : arr2)
            mergedArray[index++]=i;

        System.out.println("Merged Array : "+Arrays.toString(mergedArray));
    }
}