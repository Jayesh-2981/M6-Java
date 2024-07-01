import java.util.Arrays;

class Printing1DArray
{
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int l = arr.length;
        
        System.err.println("*** Using For Loop ***");
        
        for(int i=0; i<l;i++)
        {
            System.out.println(arr[i]);
        }
        
        System.err.println();
        System.out.println("*** Using while loop ***");

        int j=0;
        while (j<l) 
        {
            System.err.println(arr[j]);
            j++;
        }

        System.err.println();
        System.out.println("*** Using do while loop ***");
        
        int k=0;
        do{
            System.err.println(arr[k]);
            k++;
        }while(k<l);

        System.err.println();
        System.out.println("*** Using for each loop ***");

        for (int m : arr) 
        {
            System.err.println(m);   
        }

        System.err.println();
        System.err.println("*** Using toString() ***");
        
        System.err.println(Arrays.toString(arr));
    }
}