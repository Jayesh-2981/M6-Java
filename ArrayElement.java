import java.util.*;

class ArrayProgram
{
    int arr [];

    static Scanner input = new Scanner(System.in);

    public void storeElement(int arr [])
    {
        this.arr = arr;
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=input.nextInt();
		}
    }

    public void findEvenNumbers()
    {
        
    }

    public void findOddNumbers()
    {

    }

    public void negativeNumbers()
    {

    }

    public void findElement()
    {

    }

}
class ArrayElement 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        ArrayProgram obj = new ArrayProgram();
        boolean exit=true;
        while(exit)
        {
            System.out.println("Select Options : ");
            System.out.println("1. Store Elements : ");
            System.out.println("2. Find Even Numbers : ");
            System.out.println("3. Find Odd Numbers : ");
            System.out.println("4. Fetch Negative Numbers : ");
            System.out.println("5. Find Element : ");
            System.out.println("Exit");
            int options = input.nextInt();
            
            switch(options)
            {
                case 1:
                {
                    System.out.println("Enter The size of Array : ");
					int size = input.nextInt();
					System.out.println("Enter The Numbers : ");
					int arr [] = new int[size];
					obj.storeElement(arr);
                }

                case 2:
                {

                }

                case 3:
                {

                }

                case 4:
                {

                }

                case 5:
                {

                }

                case 6:
                {

                }

                default :
                {
                    System.out.println("Invalid Options");
                }
            }
        }
        obj.findEvenNumbers();
    }
}
