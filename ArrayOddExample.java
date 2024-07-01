import java.util.*;

class ArrayOddExample
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5,6,7,8};

		int count = 0;
		for(int i:arr)
		{
			if(i%2==1)
				count++;
		}

		int [] oddNumbers = new int[count];

		int index = 0;
		for(int i:arr)
		{
			if(i%2==1)
				oddNumbers[index++]=i;
		}

		System.out.println(Arrays.toString(oddNumbers));
	}
}