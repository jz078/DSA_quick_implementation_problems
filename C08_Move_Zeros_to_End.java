// move all zeros to the end

package small_implementation_problems;

public class C08_Move_Zeros_to_End {
    public static void moveZeros(int[] arr) {
        int k = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                swap(arr, i, k);
                k++;
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 0, 3, 0, 0, 4, 5};
        moveZeros(arr);
        for(int el : arr) System.out.printf("%d ", el);
    }
}
