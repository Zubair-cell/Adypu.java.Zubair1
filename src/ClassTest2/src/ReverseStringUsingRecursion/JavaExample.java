package ReverseStringUsingRecursion;

public class JavaExample {
    public static void main(String [] args ){
        String str = " I am learning Java";
        String reversed = reverseString(str);
        System.out.println("The reverse string is :" + reversed);
    }
    public static String reverseString(String str)
    {
        if(str.isEmpty())
            return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}