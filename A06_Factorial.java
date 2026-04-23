package small_implementation_problems;

import java.util.Scanner;

public class A06_Factorial {

    // Iterative with overflow detection
    private static long factorial_iterative(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers.");

        long fact = 1;

        for (int i = 1; i <= n; i++) {

            // Overflow check
            if (fact > Long.MAX_VALUE / i) throw new ArithmeticException("Overflow occurs at i = " + i);

            fact *= i;
        }

        return fact;
    }

    // Recursive (safe only till n <= 20)
    private static long factorial_recursive(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers.");

        if (n == 0 || n == 1) return 1;

        long rec = factorial_recursive(n - 1);

        // Overflow check
        if (rec > Long.MAX_VALUE / n) throw new ArithmeticException("Overflow occurs at n = " + n); // *-1

        return n * rec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        try {
            long fact1 = factorial_iterative(n);
            long fact2 = factorial_recursive(n);

            System.out.println("Factorial (Iterative): " + fact1);
            System.out.println("Factorial (Recursive): " + fact2);

        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

    // *-1 -> need to understand this line
}