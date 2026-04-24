package small_implementation_problems;

public class D08_reverse_words_in_a_sentence {
//    ✅ Approach 1: Using split
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }

        return sb.toString().trim();
    }
//    ✅ Approach 2: Without split (interview)
    public static String reverseWords2(String str) {
        char[] arr = str.toCharArray();
        int n = arr.length;

        // reverse whole string
        reverse(arr, 0, n - 1);

        int start = 0;
        for (int end = 0; end <= n; end++) {
            if (end == n || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }

        return new String(arr);
    }
//    👉 This is very strong interview answer
    private static void reverse(char[] arr, int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
    public static void main(String[] args) {
        String str = "my name is jishu mahato";
        System.out.println(reverseWords(str));
        System.out.println(reverseWords2(str));
    }
}
