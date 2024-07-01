import java.util.*;
/**
 * StartWith
 */
public class StartsWith_In_StringInt_Argument {
    static String str;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        str = sc.nextLine();

        System.out.println("Enter String to check : ");
        String str1 = sc.nextLine();

        System.out.println("Enter a index : ");
        int searchIndex = sc.nextInt();

        boolean op = userStartsWith(str1, searchIndex);
        System.out.println(str+" : "+op);
    }


    public static boolean userStartsWith(String str1, int searchIndex)
    {
        if(searchIndex<0 || searchIndex>str.length()-1)
        {
            throw new StringIndexOutOfBoundsException("Wrong Index"+searchIndex);
        }
        boolean flag = true;
        for(int i=searchIndex; i<str1.length();i++)
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


// import java.util.*;
// /**
//  * StartWith
//  */
// public class StartsWith_In_StringInt_Argument {
//     static String str;
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a String : ");
//         str = sc.nextLine();

//         System.out.println("Enter String to check : ");
//         String str1 = sc.nextLine();

//         System.out.println("Enter a index : ");
//         int searchIndex = sc.nextInt();

//         boolean op = userStartsWith(str1, searchIndex);
//         System.out.println(str + " : " + op);
//     }


//     public static boolean userStartsWith(String str1, int searchIndex)
//     {
//         if(searchIndex<0 || searchIndex > str.length()-1)
//         {
//             throw new StringIndexOutOfBoundsException("Wrong Index " + searchIndex);
//         }
//         // Ensure the part of the string to be checked is not out of bounds
//         if (searchIndex + str1.length() > str.length()) {
//             return false;
//         }

//         for (int i = 0; i < str1.length(); i++) {
//             if (str.charAt(searchIndex + i) != str1.charAt(i)) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }
