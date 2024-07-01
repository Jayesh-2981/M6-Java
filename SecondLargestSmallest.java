public class SecondLargestSmallest 
{
    public static void main(String[] args) 
    {
        int[] a = { 4, 2, 6, 1, 7, 3, 5 };
        int total = a.length;

        for (int i = 0; i < total; i++) 
        {
            for (int j = i + 1; j < total; j++) 
            {
                if (a[i] > a[j]) 
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

    int secondSmallest = a[1];
    int secondLargest = a[total - 2];

    System.out.println("Second Smallest: " + secondSmallest);
    System.out.println("Second Largest: " + secondLargest);
  }
}