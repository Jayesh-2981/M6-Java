import java.util.Arrays;

public class ArrayExample2 {
    public static void main(String[] args) {
        int [] arr = new int[30];

        for(int i=10,j=0; i<=300;i+=10)
        {
            arr[j++]=i;
        }

        System.out.println(Arrays.toString(arr));
    }
}
