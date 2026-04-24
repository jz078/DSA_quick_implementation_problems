package small_implementation_problems;

public class D01_swap_two_numbers {
    public static void main(String[] args) {
        int a = 5, b = 10;

        //✅ Approach 1: XOR (Best 💯)
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        //✔️ No overflow
        //✔️ No extra space
        //👉 Most preferred in interviews

//        ✅ Approach 1: Addition & Subtraction
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        ⚠️ Risk: Integer overflow (very important)


//        ✅ Approach 4: One-line trick (not recommended)
//        b = a + b - (a = b);
//        ⚠️ Confusing → avoid in interviews



        System.out.println(a + " " + b);
    }
}


//👉 Say: “XOR approach is safest and optimal”