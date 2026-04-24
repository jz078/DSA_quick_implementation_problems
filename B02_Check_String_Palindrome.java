// check if a string is palindrome.

package small_implementation_problems;

public class B02_Check_String_Palindrome {
    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    public static boolean isPalindrome1(String str) {
        int start = 0, end = str.length()-1;
        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "abcba";
        String str1 = "jishu";
        System.out.println(str1 + " is: " + (isPalindrome1(str1)? "Palindrome" : "Not Palindrome"));
    }
}
