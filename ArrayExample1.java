import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayExample1
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an Array : ");
		int size = scanner.nextInt();
		
		int [] arr = new int[size];
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element "+(i+1)+" : ");
			arr[i]=scanner.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
