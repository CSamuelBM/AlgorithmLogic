package com.pseudoaleatorios.model.noCongruenciales;

import com.pseudoaleatorios.model.IGenerateMdl;

import java.util.ArrayList;
import java.util.List;

public class ProductosMediosMdl extends NoCongruenciales implements IGenerateMdl {
    private int quantityGenerate;
    private int seed1;
    private int seed2;
    private int digit;
    private List<Double> r;

    public ProductosMediosMdl() {
        quantityGenerate = 0;
        seed1 = 0;
        seed2 = 0;
        digit = 0;
        r = new ArrayList<>();
    }

    public int getQuantityGenerate() {
        return quantityGenerate;
    }
    public void setQuantityGenerate(int quantityGenerate) { this.quantityGenerate = quantityGenerate; }

    public int getSeed1() {
        return seed1;
    }
    public void setSeed1(int seed1) { this.seed1 = seed1; }

    public int getSeed2() {
        return seed2;
    }
    public void setSeed2(int seed2) { this.seed2 = seed2; }

    public int getDigit() { return digit; }
    public void setDigit(int digit) { this.digit = digit; }

    public List<Double> getR() { return r; }

    private List<Double> generatorNumberP() {
        this.getR().clear();
        int currentSeed1 = this.getSeed1();
        int currentSeed2 = this.getSeed2();
        this.setDigit(digits(currentSeed1));
        for(int i = 0; i < this.getQuantityGenerate(); i++) {
            String x = x(currentSeed1, currentSeed2, this.getDigit());
            double r = r(x);
            this.getR().add(r);
            currentSeed1 = currentSeed2;
            currentSeed2 = Integer.parseInt(x);
        }
        return r;
    }

    private String x(int seed1, int seed2, int digit) { return validateSeed(multiplySeed(seed1, seed2), digit); }

    private int multiplySeed(int seed1, int seed2) { return Math.multiplyExact(seed1, seed2); }

    private double r(String x) {
        return finalSeed(x);
    }

    @Override
    public List<Double> generatorNumber() { return generatorNumberP(); }
}