package com.pseudoaleatorios.model.noCongruenciales;


import com.pseudoaleatorios.model.IGenerateMdl;

import java.util.ArrayList;
import java.util.List;

public class CuadradosMediosMdl extends NoCongruenciales implements IGenerateMdl {
    private int quantityGenerate;
    private int seed;
    private int digit;
    private List<Double> r;

    public CuadradosMediosMdl() {
        this.r = new ArrayList<>();
    }

    public int getQuantityGenerate() {
        return quantityGenerate;
    }
    public void setQuantityGenerate(int quantityGenerate) {
       this.quantityGenerate = quantityGenerate;
    }

    public int getSeed() {
        return seed;
    }
    public void setSeed(int seed) {
        this.seed = seed;
    }

    public int getDigit() { return digit; }
    public void setDigit(int digit) { this.digit = digit; }

    public List<Double> getR() {
        return r;
    }

    private List<Double> generatorNumberP() {
        this.getR().clear();
        int currentSeed = this.getSeed();
        this.setDigit(digits(currentSeed));
        for (int i = 0; i < this.getQuantityGenerate(); i++) {
            String x = x(currentSeed, this.getDigit());
            double r = r(x);
            this.getR().add(r);
            currentSeed = Integer.parseInt(x);
        }
        return this.getR();
    }

    private String x(int seed, int digit) { return validateSeed(squareSeed(seed), digit); }

    private int squareSeed(double seed) { return (int) Math.pow(seed, 2); }

    private double r(String x) { return finalSeed(x); }

    @Override
    public List<Double> generatorNumber() { return generatorNumberP(); }
}