package small_implementation_problems;

public class C05_Cheek_if_Array_Sorted {
    public static boolean isSorted(int[] arr) {
        if(arr == null || arr.length <= 1) return true;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr)); // true
    }
}
