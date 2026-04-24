package small_implementation_problems;

public class D07_Count_number_of_set_bits_in_a_Integer {
//    ✅ Approach 1: Basic
    public static int countSetBits(int n) {
        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1) count++;
            n = n >> 1;
        }

        return count;
    }
//    ✅ Approach 2: Brian Kernighan’s Algorithm (Best 💯)
    public static int countSetBits2(int n) {
        int count = 0;

        while (n > 0) {
            n = n & (n - 1); // removes last set bit
            count++;
        }

        return count;
    }
//    👉 Faster when bits are less
//    👉 Very important trick 🔥
    public static void main(String[] args) {
        System.out.println(countSetBits(5));
        System.out.println(countSetBits2(58));
    }
}
