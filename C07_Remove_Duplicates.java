// remove duplidates from a sorted array.

package small_implementation_problems;

public class C07_Remove_Duplicates {
    public static int removeDuplidates(int[] arr) {
        int k = 0;

        for(int i=1; i<arr.length; i++) {
            if(arr[i] != arr[k]) {
                k++;
                arr[k] = arr[i];
            }
        }
        return k+1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 4, 5};
        int k = removeDuplidates(arr);
        for(int i=0; i<k; i++) System.out.printf("%d ", arr[i]);
    }
}
