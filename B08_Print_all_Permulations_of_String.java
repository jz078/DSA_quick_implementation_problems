package small_implementation_problems;


public class B08_Print_all_Permulations_of_String {
    public static void permute(char[] arr, int idx) {
        if(idx == arr.length) {
            System.out.println(new String(arr));
            return;
        }

        for(int i = idx; i < arr.length; i++) {
            swap(arr, idx, i);
            permute(arr, idx + 1);
            swap(arr, idx, i); // backtrack
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        permute("abc".toCharArray(), 0);
    }
}
