import java.util.Arrays;

public class ArrayExample3 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        
        for(int i=0; i<arr.length;i++)
            arr[i]=(int)(Math.random()*9);
        
        System.out.println(Arrays.toString(arr));
    }
}
