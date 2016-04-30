package primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> factorize(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        if(number % 2 == 0){
            factors.add(2);
            number /= 2;
        }
        if(number > 1){
            factors.add(number);
        }
        return factors;
    }
}
