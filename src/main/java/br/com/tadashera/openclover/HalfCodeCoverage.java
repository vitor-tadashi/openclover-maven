package br.com.tadashera.openclover;

public class HalfCodeCoverage {
    public static void main(String[] args) {
        System.out.println("Half code coverage");
    }

    public void noCodeCoverageMethod() {
        System.out.println("No code coverage");
    }

    public void noCodeCoverageAgainMethod() {
        System.out.println("No code coverage");
    }

    public void testThisMethod() {
        System.out.println("Got you");
    }
}
