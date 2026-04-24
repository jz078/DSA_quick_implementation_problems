package small_implementation_problems;
import java.util.*;

public class B04_Check_String_Anagram {
    public static boolean usingMap(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;

        HashMap<Character, Integer> mp1 = new HashMap<>();
        HashMap<Character, Integer> mp2 = new HashMap<>();

        for(int i=0; i<s1.length(); i++) {
            char ch1 = s1.charAt(i);
            mp1.put(ch1, mp1.getOrDefault(ch1, 0) + 1);
        }

        for(int i=0; i<s2.length(); i++) {
            char ch2 = s2.charAt(i);
            mp2.put(ch2, mp2.getOrDefault(ch2, 0) + 1);
        }

        return mp1.equals(mp2);
    }
    public static boolean usingArrayMapping(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] count = new int[26]; // for a-z

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        for (int i = 0; i < s1.length(); i++) count[s1.charAt(i) - 'a']++;

        for (int i = 0; i < s2.length(); i++) count[s2.charAt(i) - 'a']--;

        for (int c : count) if (c != 0) return false;

        return true;
    }

    public static boolean usingSorting(String s1, String s2) {
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
    public static void main(String[] args) {
        String str1 = "jishu";
        String str2 = "shuij";
        String str12 = "jishu";
        String str22 = "lkjas";
        System.out.println(usingMap(str12, str22));
    }
}
