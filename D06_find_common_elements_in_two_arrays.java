package small_implementation_problems;
import java.util.*;

public class D06_find_common_elements_in_two_arrays {
    public static List<Integer> commonElements(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int num : a) set.add(num);

        for (int num : b) {
            if (set.contains(num)) {
                result.add(num);
                set.remove(num); // avoid duplicates
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 5, 4, 3, 1};
        int[] b = {5, 4, 2, 2, 4, 1, 1, 2, 4};
        List<Integer> result = commonElements(a, b);
        System.out.println(result);
    }
}
