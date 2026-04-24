// check if a string contains only digits.

package small_implementation_problems;

public class B10_Check_String_Contains_Digits {
    public static boolean checkContainsOnlyDigit(String s) {

        if(s == null || s.length() == 0) return false; // edge case

        for(char ch : s.toCharArray()) {
//            if(ch >= 48 && ch <= 57) continue;
            if(ch >= '0' && ch <= '9') continue;
            else return false;
        }
        return true;
    }
    public static boolean checkContainsOnlyDigit1(String s) {

        if(s == null || s.length() == 0) return false; // edge case

        for(char ch : s.toCharArray()) {
            if(Character.isDigit(ch)) continue;
            else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String input1 = "23221";
        String input2 = "aaade";

        System.out.println(checkContainsOnlyDigit1(input2));
    }
}
