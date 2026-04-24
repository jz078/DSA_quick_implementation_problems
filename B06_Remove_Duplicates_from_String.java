package small_implementation_problems;
import java.util.*;

public class B06_Remove_Duplicates_from_String {
    public static String remove(String s) {
        Set<Character> set = new LinkedHashSet<>();

        for(char ch : s.toCharArray()) set.add(ch);

        StringBuilder result = new StringBuilder();
        for(char ch : set) result.append(ch);

        return result.toString();
    }
    public static void main(String[] args) {
        String input = "aabbbccdeee";
        System.out.println(remove(input));
    }
}
