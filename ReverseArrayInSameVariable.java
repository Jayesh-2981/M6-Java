import java.util.Arrays;

public class ReverseArrayInSameVariable {
    public static void main(String[] args) {
        int [] arr = {2,6,3,5,4};
        System.err.println(Arrays.toString(arr));
        for(int i=0; i<arr.length;i++)
        {
            for(int j=arr.length-1-i; j>=i;)
            {
                if(i==j)
                break;

                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                break;
            }
        }
        System.err.println(Arrays.toString(arr));
    }
}
