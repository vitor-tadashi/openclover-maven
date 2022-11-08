package br.com.tadashera.openclover;

import org.junit.Test;

public class HalfCodeCoverageTest {

    @Test
    public void shouldPrint() {
        HalfCodeCoverage.main(null);
    }

    @Test
    public void shouldTestAnotherMethod() {
        HalfCodeCoverage halfCodeCoverage = new HalfCodeCoverage();
        halfCodeCoverage.testThisMethod();
    }

    @Test
    public void shouldTestAnotherMethod2() {
        HalfCodeCoverage halfCodeCoverage = new HalfCodeCoverage();
        halfCodeCoverage.testThisMethod();
    }

    @Test
    public void shouldTestAnotherMethod3() {
        HalfCodeCoverage halfCodeCoverage = new HalfCodeCoverage();
        halfCodeCoverage.testThisMethod();
    }
}
