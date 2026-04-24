package small_implementation_problems;
import java.util.*;

public class B05_Find_First_Non_Repeating_Character_in_a_String {
    public static char find(String s) {
        LinkedHashMap<Character, Integer> mp = new LinkedHashMap<>();
        for(char ch : s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        for(var key : mp.keySet()) {
            if(mp.get(key) == 1) return key;
        }
        return '-';
    }
    public static void main(String[] args) {
        String input = "aabbcdde";
        System.out.println(find(input));
    }
}
