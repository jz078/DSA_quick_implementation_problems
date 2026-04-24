// find the frequency of each element.

package small_implementation_problems;
import java.util.*;

public class C06_Find_Frequency_of_each_Element {
    public static void findFrequency(int[] arr, Map<Integer, Integer> mp) {
        for(int el : arr) {
            mp.put(el, mp.getOrDefault(el, 0) + 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 2, 3, 4, 3};
        Map<Integer, Integer> mp = new HashMap<>();
        findFrequency(arr, mp);
        System.out.println(mp);
    }
}
