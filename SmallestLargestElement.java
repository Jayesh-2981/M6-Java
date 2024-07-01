public class SmallestLargestElement {
    public static void main(String[] args) {
        int [] arr = {23,446,9,75,123,12,76,86};
        int i = arr[0];
        int j=arr[0];
        
        for(int k= 1;k<arr.length;k++)
        {
            if(i>arr[k])
            {
                i=arr[k];
            }
            if(j<arr[k])
            {
                j=arr[k];
            }
        }

        System.err.println("Smallest Element : "+i);
        System.err.println("Largest Element : "+j);
    }
    
}
