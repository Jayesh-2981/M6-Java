import java.util.Arrays;
public class ZigZagMerging {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = {4,5,6,7,8,9};

        int size = a.length+b.length;
        int [] narr = new int [size];

        int index=0;
        for(int i=0; i<size;i++)
        {
            if(i<a.length)
                narr[index++]=a[i];

            if(i<b.length)
                narr[index++]=b[i];
        }
        System.err.println(Arrays.toString(narr));
    }
}

// public class ZigZagMerging {
//     public static void main(String[] args) {
//         int [] a = {1,2,3};
//         int [] b = {4,5,6,7,8,9};

//         //Creating new Array using both arrays length
//         int [] narr = new int [a.length+b.length];

           //Creating a loop which will iterate till largest arrays length
//         int index=0;
           //Check if inderx is less than i or else AIOOBE
//         for(int i=0,j=0; i<b.length;i++)
//         {
//             if(i<a.length)
//                 narr[j++]=a[i];
                //storing element directly from bigger length array
//                 narr[j++]=b[i];    
//         }
//         System.err.println(Arrays.toString(narr));
//     }
// }
