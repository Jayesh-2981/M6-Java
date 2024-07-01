import java.util.Arrays;

public class Merger2DArrays {
    public static void main(String[] args) 
    {
        int [][] a = {{10,20,30},{40,50,60,70},{80,90},{100}};    

        // to get length of 2D Arrays
        int len = 0;
        for(int [] i:a)
            len+=i.length;
        
        //New Array created using length
        int [] narr = new int [len];
        int index=0;

        // Iterating 2D array using for each loop and initializing the elements
        for(int [] i :a)      
            for (int j : i)      
                narr[index++]=j;    
                
        //Printing Using toString();
        System.err.println(Arrays.toString(narr));
    }
}
