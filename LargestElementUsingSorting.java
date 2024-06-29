import java.util.Arrays;

public class LargestElementUsingSorting {
    public static void main(String[] args) {
        int [] a = {4,5,3,6,547,3,6,54,54,454};
        System.err.println(Arrays.toString(a));

        for(int i=0; i<a.length;i++)
        {
            for(int j=0; j<a.length-1;j++)
            {
                if(a[i]<a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // for Largest element in array 
        System.err.println("Largest Element in Array : "+a[a.length-1]);

        // for 2nd Largest Element in Array 
        System.err.println("2nd Largest Element in Array : "+a[a.length-2]);
    }
}
