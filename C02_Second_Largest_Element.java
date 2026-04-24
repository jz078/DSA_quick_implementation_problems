// find the second largest element in array

package small_implementation_problems;

public class C02_Second_Largest_Element {
    public static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE, idx = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }
        arr[idx] = Integer.MIN_VALUE;
        max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int secondLargest2(int[] arr) {
        int max = Integer.MIN_VALUE;
        int max2nd = max;

        for(int el : arr) {
            if(el > max) {
                max2nd = max;
                max = el;
            }
            else if(el > max2nd && el < max) {
                max2nd = el;
            }
        }

        return max2nd;
    }
    public static void main(String[] args) {
        int[] arr = {1, 24, 2, 1, 342};
        System.out.println("2nd largest: " + secondLargest2(arr));
    }
}
