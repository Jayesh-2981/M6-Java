import java.util.Arrays;

public class Printing2DArray 
{
    public static void main(String[] args) 
    {
        int [] [] arr = {{10,20,30},{50,60,70,80,90,100}};
        System.err.println();
        System.err.println("*** USing for Loop ***");

        for(int i=0; i<arr.length;i++)
        {
            for(int j=0; j<arr[i].length;j++)
            {
                System.err.print(arr[i][j]+" ");
            }
            System.err.println();
        }
        System.err.println();
        System.err.println("*** Using For Each Loop ***");

        for (int[] i : arr) 
        {
            for (int j : i) 
            {
                System.err.print(j+" ");   
            }    
            System.err.println();
        }

        System.err.println();
        System.err.println("*** Using While Loop ***");

        int i=0;
        while(i<arr.length)
        {
            int j=0;
            while (j<arr[i].length) 
            {
                System.err.print(arr[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        }

        System.err.println();
        System.err.println("*** Using Do While Loop ***");

        int a=0;
        do{
            int b=0;
            do{
                System.err.print(arr[a][b]+ " ");
                b++;
            }while(b<arr[a].length);
            System.err.println();
            a++;
        }while(a<arr.length);

        System.err.println();
        System.err.println("*** Using deepToString() ***");

        System.err.println(Arrays.deepToString(arr));
    }
}
