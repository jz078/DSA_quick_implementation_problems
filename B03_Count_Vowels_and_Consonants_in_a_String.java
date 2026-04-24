//vowels and consonants in a string.

package small_implementation_problems;
import java.util.*;

public class B03_Count_Vowels_and_Consonants_in_a_String {
    public static void find(String name, List<Character> list1, List<Character> list2) {
        name = name.toLowerCase();
        for(char ch : name.toCharArray()) {
            if(ch >= 97 && ch <= 122) { // or if(ch >= 'a' && ch <= 'z')
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') list1.add(ch);
                else list2.add(ch);
            }
        }
    }
    public static void main(String[] args) {
        String name = "jishu mahato";
        List<Character> Vowels = new ArrayList<>();
        List<Character> Consonants = new ArrayList<>();
        find(name, Vowels, Consonants);
        System.out.println("Vowels : " + Vowels);
        System.out.println("Consonants : " + Consonants);
    }
}
