package small_implementation_problems;

import java.util.Scanner;

public class A04_prime_Numbers_upto_n {
    private static boolean isPrime(int num) {
        if(num<2) return false;

        int limit = (int) Math.sqrt(num);
        for(int i=2; i<= limit; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
    private static void helper(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) System.out.println(i);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        helper(n);
    }
}
