import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(args[0]);
		
		if(isPalindrome(num))
		{
			System.out.println(num + " is a pal");
		}else {
			System.out.println(num + " is not a pal");
		}
	}
	
	private static boolean isPalindrome(int num) {
		int rev =0;
		int dup = num;
		
		while(num>=0)
		{
			int rem = num%10;
			rev = rem*10+rem;
			num/=10;
		}
		
		if(rev==dup)
			return true;
		return false;
	}

}
