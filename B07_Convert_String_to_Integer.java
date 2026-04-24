package small_implementation_problems;

public class B07_Convert_String_to_Integer {
    public static int atoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        boolean neg = false;
        long ans = 0;
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            // to handle the - or + sign
            if(i==0) {
                if(ch=='-') {
                    neg = true;
                    continue;
                }
                else if(ch=='+') {
                    neg = false;
                    continue;
                }
            }

            if(ch >= '0' && ch <= '9') {
                int digit = ch - '0';
                ans = ans * 10 + digit;

                // always check the overflow of the answer after answer increment
                if(neg && -ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
                if(!neg && ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            }
            else break;
        }

        return neg? (int)-ans : (int)ans;
    }
    public static int atioBuiltIn(String s) {
//        return Integer.parseInt(s);
        return Integer.valueOf(s);
    }
    public static void main(String[] args) {
        String input = "1234";
        System.out.println(atioBuiltIn(input));
    }
}
