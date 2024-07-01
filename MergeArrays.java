import java.util.Arrays;

public class MergeArrays 
{
    public static void main(String[] args) 
    {
        int [] a = {1,2,3,4,5};
        int [] b = {6,7,8,9,10};
        int [] c = new int[(a.length)+(b.length)];

        int index = 0;
        for(int i : a)
            c[index++]=i;
        
        for(int i : b)
           c[index++]=i;

        System.err.println(Arrays.toString(c));
    }    
}
