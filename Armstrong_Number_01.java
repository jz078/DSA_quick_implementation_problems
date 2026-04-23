package small_implementation_problems;
//import java.util.*;

public class Armstrong_Number_01 {
    public static boolean ifArmstrong1(int num) {
//        int length = num == 0 ? 1 : (int)Math.log10(num) + 1;
        int length = String.valueOf(num).length(); // safer
        int result = 0;
        int orgnum = num;
        while(num > 0) {
            int digit = num%10;
            result += (int) Math.pow(digit, length);
            num /= 10;
        }
        return result == orgnum;
    }
    public static void main(String[] args) {
        int num = 0;
        System.out.println(ifArmstrong1(num));
    }



    private static int pow(int x, int y) {
        int res = 1;
        for(int i=1; i<=y; i++) {
            res *= x;
        }
        return res;
    }
    private static boolean ifArmstrong(int n) {
        if (n < 0) return false; // negatives are not Armstrong
//        int length = String.valueOf(n).length(); // avoid string conversion
        int length = (n==0)? 1 : (int) Math.log10(n) + 1; // log0 give -infinity value, handle seperately
        int res = 0;
        int num = n;
        while(num>0) {
            int digit = num%10;
//            res += pow(digit, length);
            res += (int) Math.pow(digit, length); // math.pow returns double value
            num /= 10;
        }
        return n==res;
    }
}

// Edge Case: 0
//Armstrong by definition (0^1 = 0). Your code works fine here, but mentioning it in an interview shows awareness.


//Using Math.log10(num) can be risky:
//For very large numbers → precision issues
//For num = 0