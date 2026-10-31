package com.pseudoaleatorios.model.congruenciales;

import com.pseudoaleatorios.model.IGenerateMdl;

import java.util.ArrayList;
import java.util.List;

public class MultiplicativoMdl extends Congruenciales implements IGenerateMdl {
    private int seed;
    private int a;
    private int m;
    private List<Double> r;

    public MultiplicativoMdl() {
        seed = 0;
        a = 0;
        m = 0;
        r = new ArrayList<>();
    }

    public int getSeed() { return seed; }
    public void setSeed(int seed) { this.seed = seed; }

    public int getA() { return a; }
    public void setA(int a) { this.a = a; }

    public int getM() { return m; }
    public void setM(int m) { this.m = m; }

    public List<Double> getR() { return r; }

    private List<Double> generateNumberP() {
        this.getR().clear();
        int n = quantityGenerate(this.getM());
        int currentSeed = this.getSeed();
        for (int i = 0; i < n; i++) {
            int mod = x(this.getA(), currentSeed, this.getM());
            this.getR().add(r(mod, this.getM()));
            currentSeed = mod;
        }
        return this.getR();
    }

    private int x(int a, int seed, int m) {
        return mod(multiply(a, seed), m);
    }

    private int multiply(int a, int seed) {
        return Math.multiplyExact(a, seed);
    }

    private double r(int mod, int m) { return finalSeed(mod, m); }

    public int quantityGenerate(int m) { return m / 4; }

    @Override
    public List<Double> generatorNumber() { return generateNumberP(); }
}