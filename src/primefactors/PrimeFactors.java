package primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> factorize(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        int candidate = 2;
        while (number > 1) {
            while (number % candidate == 0) {
                factors.add(candidate);
                number /= candidate;
            }
            candidate++;
        }
        return factors;
    }
}
