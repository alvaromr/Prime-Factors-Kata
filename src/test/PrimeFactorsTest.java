package test;

import org.junit.Test;
import primefactors.PrimeFactors;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {
    @Test
    public void oneShouldNotHavePrimeFactors(){
        assertEquals(Collections.emptyList(), PrimeFactors.factorize(1));
    }

    @Test
    public void twoHasOnlyItselfAsAFactor(){
        assertEquals(Collections.singletonList(2), PrimeFactors.factorize(2));
    }
}
