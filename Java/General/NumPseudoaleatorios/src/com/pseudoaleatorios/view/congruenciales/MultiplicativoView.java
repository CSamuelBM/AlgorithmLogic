package com.pseudoaleatorios.view.congruenciales;

import com.pseudoaleatorios.view.constants.TextMenuConst;
import com.pseudoaleatorios.view.interfaces.IData;

import java.util.List;
import java.util.Scanner;

public class MultiplicativoView implements IData {
    private Scanner cs = new Scanner(System.in);
    private int seed;
    private int a;
    private int m;

    public int getSeed() {  return seed; }

    public int getA() { return a; }

    public int getM() { return m; }

    private void insertDataP() {
        validateSeed();
        System.out.println(TextMenuConst.CONST_MULTIPLICATIVA);
        a = cs.nextInt();
        System.out.println(TextMenuConst.MOD);
        m = cs.nextInt();
    }

    private void validateSeed() {
        while (true) {
            System.out.println(TextMenuConst.INITIAL_SEED);
            seed = cs.nextInt();
            if(seed % 2 == 0) { System.out.println("No se acepta una semilla par"); }
            else { return; }
        }
    }

    private void showDataP(List<Double> r) {
        int c = 1;
        for(double i : r) {
            System.out.printf("R%d %.4f%n", c, i);
            c++;
        }
    }

    @Override
    public void insertData() { insertDataP(); }

    @Override
    public void showData(List<Double> r) { showDataP(r); }
}