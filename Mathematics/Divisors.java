import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Divisors {
    public static void main(String[] args) {
        int number = 36;
        List<Integer> divisors = findDivisors(number);
        
        // Print the divisors
        System.out.println("Divisors of " + number + ": " + divisors);
    }

    public static List<Integer> findDivisors(int number) {
        List<Integer> divisors = new ArrayList<>();
        int sqrt = (int) Math.sqrt(number);

        for (int i = 1; i <= sqrt; i++) {
            if (number % i == 0) {
                divisors.add(i);
                if (i != number / i) {
                    divisors.add(number / i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }
}
