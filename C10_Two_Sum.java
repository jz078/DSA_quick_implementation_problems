package small_implementation_problems;
import java.util.*;

public class C10_Two_Sum {
    public static int[] twoSum(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static int[] twoSum2(int[] arr, int target) {
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            int rem = target-arr[i];
            if(mp.containsKey(rem)) return new int[]{arr[mp.get(rem)], arr[i]};
            mp.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int[] arr1 = {7, 11, 15};
        int target = 9;
        int[] ans = twoSum2(arr1, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
