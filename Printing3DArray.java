import java.util.Arrays;

public class Printing3DArray {
    public static void main(String[] args) 
    {
        int [] [] [] arr = {{{10,20,30},{40,50,60,70},{80,90,100}}};
        System.err.println();
        System.err.println("*** USing for Loop ***");

        for(int i=0; i<arr.length;i++)
        {
            for(int j=0; j<arr[i].length;j++)
            {
                for(int k=0; k<arr[i][j].length;k++)
                {
                    System.err.print(arr[i][j][k]+" ");
                }
                System.err.println();
            }
            System.err.println();
        }

        System.err.println("*** Using For Each Loop ***");

        for (int[][] i : arr) 
        {
            for (int j []: i) 
            {
                for(int k :j)
                {
                    System.err.print(k +" ");
                } 
                System.err.println(); 
            }    
            System.err.println();
        }

        System.err.println("*** Using While Loop ***");

        int i=0;
        while(i<arr.length)
        {
            int j=0;
            while (j<arr[i].length) 
            {
                int k=0;
                while (k<arr[i][j].length) 
                {
                    System.err.print(arr[i][j][k]+" ");
                    k++;
                }
                System.err.println();
                j++;
            }
            System.out.println();
            i++;
        }

        System.err.println("*** Using Do While Loop ***");

        int a=0;
        do{
            int b=0;
            do{
                int c=0;
                do{
                    System.err.print(arr[a][b][c]+" ");
                    c++;
                }while(c<arr[a][b].length);

                System.err.println();
                b++;
            }while(b<arr[a].length);

            System.err.println();
            a++;

        }while(a<arr.length);

        System.err.println("*** Using deepToString() ***");

        for (int[][] s : arr) {
            System.err.println(Arrays.deepToString(arr));
        }
    }
}
