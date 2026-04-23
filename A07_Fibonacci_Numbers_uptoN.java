package small_implementation_problems;
import java.util.Scanner;

public class A07_Fibonacci_Numbers_uptoN {
    // print all fibonacci number upto n
    private static void fib(int n) {
        if(n<0) return;

        var prev = 0;
        var curr = 1;
        System.out.println(0);
        System.out.println(1);

        while(true) {
            var sum = curr + prev;
            if(sum > n) break;
            System.out.println(sum);
            prev = curr;
            curr = sum;
        }
    }
    // print first n fibonacci numbers
    // ???


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        fib(n);
    }
}
