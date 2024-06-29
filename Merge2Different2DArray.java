import java.util.Arrays;

public class Merge2Different2DArray {
    public static void main(String[] args) {
        int [][] arr1 = {{1,2,3},{4,5,6}};
        int [][] arr2 = {{7,8},{9,10,11},{12,13,14,15}};
        
        System.err.println("First 2D Array : "+Arrays.deepToString(arr1));
        System.err.println("Second 2D Array : "+Arrays.deepToString(arr2));
        
        int len1 = 0;
        int len2 = 0;

        //For length of First Array
        for(int[] i:arr1)
                len1+=i.length;                          

        //For length of Second Array
        for (int[] j : arr2) 
            len2+=j.length;
            
        int [] mergedArray = new int[len1+len2];
        int index=0;

        //For merging elements of First Array
        for (int [] i : arr1) 
            for (int j : i) 
                mergedArray[index++]=j;

        //For merging elements of Second Array
        for (int [] i : arr2) 
            for (int j : i) 
                mergedArray[index++]=j;    
           
        System.err.println("Merged Array : "+Arrays.toString(mergedArray));
    }
}
