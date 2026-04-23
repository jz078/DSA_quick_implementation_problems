// reverse a number without using string

package small_implementation_problems;
import java.util.*;

public class A10_Reverse_a_Number {
    public static int reverseNumber(int n) {
        int rev = 0;
        while(n>0) {
            int digit = n%10;

            rev *= 10;
            rev += digit;

            n /= 10;
        }

        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number to reverse: ");
        int n = sc.nextInt();
        int rev = reverseNumber(n);
        System.out.println("reversed number: " + rev);
        System.out.println(n==rev);
        sc.close();
    }
}
