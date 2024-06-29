import java.util.Arrays;

public class ReverseArrayItself {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        for(int i=0; i<arr.length;i++)
        {
            for(int j=arr.length-1-i;j>=i;)
            {         
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                break;
            }
        }
        System.err.println(Arrays.toString(arr));
    }
}
