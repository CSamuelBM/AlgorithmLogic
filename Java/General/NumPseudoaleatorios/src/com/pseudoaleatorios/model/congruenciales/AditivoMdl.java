package com.pseudoaleatorios.model.congruenciales;

import com.pseudoaleatorios.model.IGenerateMdl;

import java.util.ArrayList;
import java.util.List;

public class AditivoMdl extends Congruenciales implements IGenerateMdl {
    private int quantityGenerate;
    private List<Integer> sequenceNumber;
    private int m;
    private List<Double> r;

    public AditivoMdl() {
        quantityGenerate = 0;
        sequenceNumber = new ArrayList<>();
        m = 0;
        r= new ArrayList<>();
    }

    public int getQuantityGenerate() { return quantityGenerate; }
    public void setQuantityGenerate(int quantityGenerate) { this.quantityGenerate = quantityGenerate; }

    public List<Integer> getSequenceNumber() { return sequenceNumber; }
    public void setSequenceNumber(List<Integer> sequenceNumber) { this.sequenceNumber = sequenceNumber; }

    public int getM() { return m; }
    public void setM(int m) { this.m = m; }

    public List<Double> getR() { return r; }

    private List<Double> generatorNumberP() {
        this.getR().clear();
        int currentSeed1 = this.getSequenceNumber().getLast();
        int currentSeed2 = this.getSequenceNumber().getFirst();
        for (int i = 0; i < this.getQuantityGenerate(); i++) {
            int mod = x(currentSeed1, currentSeed2, this.getM());
            this.getR().add(r(mod, this.getM()));
            this.getSequenceNumber().add(mod);
            currentSeed1 = mod;
            currentSeed2 = this.getSequenceNumber().get(i + 1);
        }
        return this.getR();
    }

    private int x(int seed1, int seed2, int m) { return mod(sum(seed1, seed2), m); }

    private int sum(int seed1, int seed2) { return seed1 + seed2; }

    private double r(int mod, int m) { return finalSeed(mod, m); }

    @Override
    public List<Double> generatorNumber() { return generatorNumberP(); }
}