package small_implementation_problems;
import java.util.Scanner;

public class factorial_6 {
    private static long factorial_iterative(int n) {
        long fact = 1;
        for(int i=1; i<=n; i++) {
            fact *= i;
        }
        return fact;
    }

    private static long factorial_recursive(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        if(n==1 || n==0) return 1;
        long rec = factorial_recursive(n-1);
        return n * rec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        long fact1 = factorial_iterative(n);
        long fact2 = factorial_recursive(n);

        if(fact1 > Integer.MAX_VALUE) System.out.println(true); // *-0

        System.out.println("factorial iterative : " + fact1);
        System.out.println("factorial recursive : " + fact2);
    }
}
// *-0 (int capacity exceeds from here(n=13))
