// count words in a string.

package small_implementation_problems;
//import java.util.*;

public class B09_Count_Words_in_String {
    public static int countWords(String s) {
//        String[] words = s.split(" +");
        String[] words = s.split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        String s = "my name is jishu";
        System.out.println("words: "+ countWords(s));
    }
}

//" +" → only handles spaces
//"\\s+" → handles space, tab, newline ✅
