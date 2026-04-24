package small_implementation_problems;

public class D04_decimal_to_binary {

//    decimal to binary
    public static String decimalToBinary(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }

        return sb.reverse().toString();
    }

//    binary to decimal
//    1011 = 1×2³ + 0×2² + 1×2¹ + 1×2⁰ = 11
    public static int binaryToDecimal(String bin) {
        int result = 0;
        int power = 0;

        for (int i = bin.length() - 1; i >= 0; i--) {
            int digit = bin.charAt(i) - '0';
            result += digit * Math.pow(2, power);
            power++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(10));
        System.out.println(binaryToDecimal("1011")); // 11
    }
}
