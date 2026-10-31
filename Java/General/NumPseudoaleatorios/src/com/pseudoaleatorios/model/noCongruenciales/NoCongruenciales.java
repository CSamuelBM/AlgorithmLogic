package com.pseudoaleatorios.model.noCongruenciales;

public class NoCongruenciales {
    public String validateSeed(int operationSeed, int digit) { return validateSeedP(operationSeed, digit);
    }  //Funcion que se encarga de compartir la logia de la semilla validada.

    public double finalSeed(String x) { return finalSeedP(x, x.length());
    } //Funcion que se encarga de compartir la logia de la semilla validada.

    public int digits(int seed) { return digitsP(seed);
    } //Funcion que se encarga de compartir la logia de la cantiada de digitos que tendra la semilla.

    private String validateSeedP(int operationSeed, int digits) {
        String seed = convertSeed(operationSeed);
        int sizeSeed = seed.length();
        return conditionSeed(seed, sizeSeed, digits);
    }

    private String conditionSeed(String seed, int sizeSeed, int digits) {
        if (digits > sizeSeed) { return null; }
        else if (sizeSeed == digits) { return seed; }
        else { return changeSeed(seed, sizeSeed, digits); }
    }

    private String changeSeed(String seed, int sizeSeed, int digits) {
        if (digits % 2 == 0) { return evenChangeSeed(seed, sizeSeed, digits); }
        else { return oddChangeSeed(seed, sizeSeed, digits); }
    }

    private String evenChangeSeed(String seed, int sizeSeed, int digits) {
        if (sizeSeed % 2 == 0 && digits != 2) { return firstFilterSeed(seed, sizeSeed, digits); }
        else { return secondFilterSeed(seed, digits); }
    }

    private String oddChangeSeed(String seed, int sizeSeed, int digits) {
        if(sizeSeed % 2 != 0) { return firstFilterSeed(seed, sizeSeed, digits); }
        else { return secondFilterSeed(seed, digits); }
    }

    private String firstFilterSeed(String seed, int sizeSeed, int digits) {
        return seed.substring((sizeSeed / digits), ((sizeSeed / digits) + digits));
    }

    private String secondFilterSeed(String seed, int digits) {
        int sizeSeed;
        seed = "0" + seed;
        sizeSeed = seed.length();
        return firstFilterSeed(seed, sizeSeed, digits);
    }

    private String convertSeed(int operationSeed) {
        return Integer.toString(operationSeed);
    }

    private double finalSeedP(String x, int digits) {
        double seed = Double.parseDouble(x);
        return seed / elevatedDigits(digits);
    }

    private double elevatedDigits(int digits) {
        return Math.pow(10, digits);
    }

    private int digitsP(int seed) { return Integer.toString(seed).length(); }
}