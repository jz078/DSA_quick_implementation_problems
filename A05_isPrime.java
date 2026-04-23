package small_implementation_problems;
import java.util.Scanner;

public class A05_isPrime {
    private static boolean is_prime(int num) {
        if(num <= 1) return false;
        if(num == 2) return true; // *-0

        int limit = (int) Math.sqrt(num);
        for(int i=2; i<=limit; i++) {
            if(num%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        System.out.println(is_prime(n));
        sc.close();
    }
}
// *-0 (2 is prime number, handle separately)

// instead of writing the math.sqrt function in the for loop, we write it outside
// it saved lots of time by not recalculating the sqrt function again and again
