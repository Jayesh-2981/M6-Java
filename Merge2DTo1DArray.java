import java.util.Arrays;

public class Merge2DTo1DArray {
    public static void main(String[] args) {
        int [][] arr1 = {{1,2,3,4,5},{6,7,8,9,10}};
        System.out.println("2D Array : "+Arrays.deepToString(arr1));

        int [] first = arr1[0];
        int [] second = arr1[1];

        int [] mergedArray = new int[first.length+second.length];

        int index=0;
        for (int i=0; i<first.length;i++)
        {
            mergedArray[index++]=first[i];
        }

        for (int i=0; i<second.length;i++)
        {
            mergedArray[index++]=second[i];
        }

        System.err.println("Merged 1D array : "+Arrays.toString(mergedArray));
    }
}
