package com.pseudoaleatorios.model.noCongruenciales;

import com.pseudoaleatorios.model.IGenerateMdl;

import java.util.ArrayList;
import java.util.List;

public class MultiplicadorConstanteMdl extends NoCongruenciales implements IGenerateMdl {
    private int quantityGenerate;
    private int seed;
    private int a;
    private int digit;
    private List<Double> r;

    public MultiplicadorConstanteMdl() {
        quantityGenerate = 0;
        seed = 0;
        a = 0;
        digit = 0;
        r = new ArrayList<>();
    }

    public int getQuantityGenerate() { return quantityGenerate; }
    public void setQuantityGenerate(int quantityGenerate) { this.quantityGenerate = quantityGenerate; }

    public int getSeed() { return seed; }
    public void setSeed(int seed) { this.seed = seed; }

    public int getA() { return a; }
    public void setA(int a) { this.a = a; }

    public int getDigit() { return digit; }
    public void setDigit(int digit) { this.digit = digit; }

    public List<Double> getR() { return r; }

    private List<Double> generatorNumberP() {
        this.getR().clear();
        int currentSeed = this.getSeed();
        this.setDigit(digits(currentSeed));
        for (int i = 0; i < this.getQuantityGenerate(); i++){
            String x = x(this.getA(), currentSeed, this.getDigit());
            double r = r(x);
            this.getR().add(r);
            currentSeed = Integer.parseInt(x);
        }
        return this.getR();
    }

    private String x(int a, int seed, int digit) { return validateSeed(multiplyConst(a, seed), digit); }

    private int multiplyConst(int a, int seed) { return Math.multiplyExact(a, seed); }

    private double r(String x) { return finalSeed(x); }

    @Override
    public List<Double> generatorNumber() { return generatorNumberP(); }
}