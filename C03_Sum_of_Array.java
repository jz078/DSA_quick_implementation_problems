// find the sum of array

package small_implementation_problems;


public class C03_Sum_of_Array {
    public static int sum(int[] arr) {
        int sum = 0;

        for(int el : arr) {
            sum += el;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println("Sum: " + sum(arr)); // 10
    }
}
