package small_implementation_problems;

public class C09_Missing_Number_from_1toN {
    public static int missingNumber(int[] arr) {
        int n = arr.length+1, total = (n*(n+1))/2, sum = 0;
        for(var el : arr) {
            sum += el;
        }
        return total - sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.printf("Missing Number : %d", missingNumber(arr));
    }
}
