import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int [] arr = {2,4,5,4,7,3,7,6,4,6,5};

        System.err.println(Arrays.toString(arr));

        for(int i=arr.length-1; i>=0;i--)
        {
            System.err.print(arr[i]+" ");
        }
    }
}
