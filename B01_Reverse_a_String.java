// reverse a string (without built-in reverse)

package small_implementation_problems;


public class B01_Reverse_a_String {
    public static String reverseString(String st) {
        char[] arr = st.toCharArray();

        int start = 0, end = st.length()-1;
        while(start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);  // wrong -> return arr.toString();
    }
    public static void main(String[] args) {
        String st = "jishu";
        String rev = reverseString(st);
        System.out.println("Reversed string: " + rev);
    }
}
