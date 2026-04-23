package small_implementation_problems;

import java.util.Scanner;

public class A08_Count_Number_of_Digits {
    // count digits method
    private static int method1(int num) {
        if(num == 0) return 1;
        int count = 0;
        while(num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
    // log method
    private static int method2(int num) {
        if(num == 0) return 1;
        return (int) Math.log10(num) + 1;
    }
    private static int method3(int num) {
        return String.valueOf(num).length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        num = Math.abs(num); // *-1
        System.out.println("length from iterative method : " + method1(num));
        System.out.println("length from log method : " + method2(num));
        System.out.println("length from string conversion method : " + method3(num));
    }
}

// *-1 -> converts to positive number
// * -> cannot handle Integer.MIN_VALUE, ask chatgpt later, why
