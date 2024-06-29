import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};

        int [] reverse = new int [arr1.length];

        int index=0;
        for(int i=arr1.length-1; i>=0;i--)
            reverse[index++]=arr1[i];

        System.err.println("Original Array : "+Arrays.toString(arr1));
        System.err.println("Reversed Array : "+Arrays.toString(reverse));
    }
}
