package test;

import org.junit.Test;
import primefactors.PrimeFactors;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {
    @Test
    public void oneShouldNotHavePrimeFactors() {
        assertEquals(Collections.emptyList(), PrimeFactors.factorize(1));
    }

    @Test
    public void twoShouldHaveOnlyItselfAsAFactor() {
        assertEquals(Collections.singletonList(2), PrimeFactors.factorize(2));
    }

    @Test
    public void threeShouldHaveOnlyItselfAsAFactor() {
        assertEquals(Collections.singletonList(3), PrimeFactors.factorize(3));
    }

    @Test
    public void fourShouldHaveTwoTimesTwoAsFactors() {
        assertEquals(Arrays.asList(2, 2), PrimeFactors.factorize(4));
    }

    @Test
    public void fiveShouldHaveOnlyItselfAsAFactor() {
        assertEquals(Collections.singletonList(5), PrimeFactors.factorize(5));
    }

    @Test
    public void sixShouldHaveTwoAndThreeAsFactors() {
        assertEquals(Arrays.asList(2, 3), PrimeFactors.factorize(6));
    }
}
