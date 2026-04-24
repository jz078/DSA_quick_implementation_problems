package small_implementation_problems;
import java.util.Random;

public class D10_generate_random_number_between_range {
    public static int getRandom(int min, int max) {

//        ✅ Approach 1: Using Random/, import needed
//        Random rand = new Random();
//        return rand.nextInt(max - min + 1) + min;


//        ✅ Approach 2: Using Math.random()
        return (int)(Math.random() * (max - min + 1)) + min;

    }
    public static void main(String[] args) {
        System.out.println(getRandom(1, 10));
    }
}
