package small_implementation_problems;
import java.util.*;

public class A09_Sum_of_Digits {
    private static int sumOfDigits(int n) {
        int sum = 0;
        while(n!=0) {
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number to find sum of digits: ");
        int n = sc.nextInt();
        System.out.println("sum of digits : " + sumOfDigits(n));
        sc.close();
    }
    private static int sumOfDigitsHandleNegatives(int n) {
        boolean neg = false;
        if(n<0) neg = true;
        n = Math.abs(n);

        int sum = 0;
        while(n!=0) {
            sum += n%10;

            n /= 10;
        }
        return (neg)? -sum : sum;
    }
}
