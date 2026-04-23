package small_implementation_problems;

public class GCD_And_HCF_3 {

    // gcd iterative
    // Function to find GCD using Euclidean algorithm
    private static int gcd(int a, int b) {
        while(b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to find LCM using relation: lcm(a, b) = (a * b) / gcd(a, b)
    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    //    gcd recursive
    private static int gcd1(int a, int b) {
        if(b == 0) return a;
        return gcd1(b, a%b);
    }


    public static void main(String[] args) {
        int a = 15, b = 20;
        System.out.printf("GCD of (%d, %d) = %d\n", a, b, gcd(a, b));
        System.out.printf("LCM of (%d, %d) = %d", a, b, lcm(a, b));
    }
}