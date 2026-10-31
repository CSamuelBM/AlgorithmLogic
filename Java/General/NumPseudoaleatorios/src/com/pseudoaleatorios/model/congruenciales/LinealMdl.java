package com.pseudoaleatorios.model.congruenciales;

import com.pseudoaleatorios.model.IGenerateMdl;

import java.util.ArrayList;
import java.util.List;

public class LinealMdl extends Congruenciales implements IGenerateMdl {
    private int seed;
    private int a;
    private int c;
    private int m;
    private List<Double> r;

    public LinealMdl() {
        seed = 0;
        a = 0;
        c = 0;
        m = 0;
        r = new ArrayList<>();
    }

    public int getSeed() { return seed; }
    public void setSeed(int seed) { this.seed = seed; }

    public int getA() { return a; }
    public void setA(int a) { this.a = a; }

    public int getC() { return c; }
    public void setC(int c) { this.c = c; }

    public int getM() { return m; }
    public void setM(int m) { this.m = m; }

    public List<Double> getR() { return r; }

    private List<Double> generatorNumberP() {
        this.getR().clear();
        int currentSeed = this.seed;
        for(int i = 0; i < this.getM(); i++) {
            int mod = x(this.getA(), currentSeed, this.getC(), this.getM());
            this.getR().add(r(mod, this.getM()));
            currentSeed = mod;
        }
        return this.getR();
    }

    private int x(int a, int seed, int c, int m) { return mod(multiplySum(a, seed, c), m); }

    private int multiplySum(int a, int seed, int c) { return Math.multiplyExact(a, seed) + c; }

    private double r(int mod, int x) { return finalSeed(mod, x); }

    @Override
    public List<Double> generatorNumber() { return generatorNumberP(); }
}