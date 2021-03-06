package primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> factorize(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int candidate = 2; number > 1; candidate++) {
            while (number % candidate == 0) {
                factors.add(candidate);
                number /= candidate;
            }
        }
        return factors;
    }
}
