package com.pseudoaleatorios.view.noCongruenciales;

import com.pseudoaleatorios.view.constants.TextMenuConst;
import com.pseudoaleatorios.view.interfaces.IData;

import java.util.List;
import java.util.Scanner;

public class MultiplicadorConstanteView implements IData {
    private Scanner cs = new Scanner(System.in);
    private int quantityGenerate;
    private int a;
    private int seed;

    public int getQuantityGenerate() { return quantityGenerate; }
    public int getA() { return a; }
    public int getSeed() { return seed; }

    private void insertDataP() {
        System.out.println(TextMenuConst.GENERATE_NUMBER);
        quantityGenerate = cs.nextInt();
        System.out.println(TextMenuConst.CONST_MULTIPLICATIVA);
        a = cs.nextInt();
        System.out.println(TextMenuConst.INITIAL_SEED);
        seed = cs.nextInt();
    }

    private void showDataP(List<Double> r) {
        int c = 1;
        for (Double i : r) {
            System.out.printf("R%d %.4f%n", c, i);
            c++;
        }
    }

    @Override
    public void insertData() { insertDataP(); }

    @Override
    public void showData(List<Double> r) { showDataP(r); }
}