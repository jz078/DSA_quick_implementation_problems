// find the maximum and minimum element in array.

package small_implementation_problems;

public class C01_Find_Max_Min_Element {
    public static int[] findMinMax(int[] arr) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int el : arr) {
            if(el > max) max = el;
            if(el < min) min = el;
        }
        return new int[]{max, min};
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 6, 10};
        int[] ans = findMinMax(arr);
        System.out.println("Max: " + ans[0]);
        System.out.println("Min: " + ans[1]);
    }
}
