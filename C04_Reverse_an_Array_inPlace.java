// reverse an array in place

package small_implementation_problems;

public class C04_Reverse_an_Array_inPlace {
    public static void reverseArray(int[] arr) {
        if(arr == null || arr.length <= 1) return;
        int start = 0, end = arr.length-1;

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
        for(int el : arr) System.out.printf("%d ", el);
    }
}
