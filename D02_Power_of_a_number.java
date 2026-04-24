package small_implementation_problems;

public class D02_Power_of_a_number {
//    ✅ Approach 1: Brute Force
    public static long power(int x, int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }
//    ⏱ Time: O(n)
//    ✅ Approach 3: Iterative Fast Exponentiation (Best 💯)
    public static long power2(int x, int n) {
        long result = 1;
        long base = x;

        while (n > 0) {
            if ((n & 1) == 1) { // if n is odd
                result *= base;
            }
            base *= base;
            n = n >> 1; // divide by 2
        }

        return result;
    }
//    ✔️ Fast
//    ✔️ No recursion stack
//    👉 Best for interviews
    public static void main(String[] args) {
        System.out.println(power(2, 3));
        System.out.println(power2(2, 4));
    }
}
