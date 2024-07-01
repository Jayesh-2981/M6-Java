import java.util.*;
/**
 * StartWith
 */
public class StartsWith_In_Single_Argument {
    static String str;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a String : ");
        str = sc.nextLine();

        System.err.println("Enter String to check : ");
        String str1 = sc.nextLine();

        boolean op = userStartsWith(str1);
        System.err.println(str+ " : "+op);
    }

    public static boolean userStartsWith(String str1)
    {
        boolean flag = true;
        for(int i = 0; i<str1.length();i++)
        {
            char ch = str1.charAt(i);
            if(ch!=str.charAt(i))
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
    
}