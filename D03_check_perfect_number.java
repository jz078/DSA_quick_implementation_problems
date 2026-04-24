package small_implementation_problems;

public class D03_check_perfect_number {
    public static boolean isPerfect(int n) {
        if (n <= 1) return false;

        int sum = 1; // 1 is always a divisor

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }

        return sum == n;
    }
    public static void main(String[] args) {
        System.out.println(isPerfect(4));
    }
}

//👉 A number is perfect if:
//sum of divisors (excluding itself) = number
//👉 Example: 6 → 1+2+3 = 6 ✅