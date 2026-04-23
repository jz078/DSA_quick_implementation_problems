package small_implementation_problems;

public class A02_Palindrome_Number {
    private static boolean isPalindrome(int n) {
        if(n<0) return false;

        String original = String.valueOf(n);
        String reversed = new StringBuilder(original).reverse().toString();

        return original.equals(reversed);
    }
    private static boolean isPalindrome1(int n) {
        if(n<0) return false;

        int rev = reverseNumber(n);
        return n == rev;
    }
    private static int reverseNumber(int n) {
        int res = 0;
        while(n>0) {
            int digit = n%10;
            res *= 10;
            res += digit;
            n /= 10;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 121;
        System.out.println(isPalindrome1(n));
    }
}

/* Edge case awareness:
    1. n = 0 should return true (works fine here).
    2. Handles negatives correctly (n < 0 → false).
    3. Very large numbers near Integer.MAX_VALUE (like 2147483647) could cause overflow in reverseNumber.
        For interview discussion, you can mention “to handle large inputs safely, I’d use long instead of int for rev”. That shows depth.

super compact code
return String.valueOf(n)
       .equals(new StringBuilder(String.valueOf(n))
       .reverse()
       .toString());
 */
