package com.pseudoaleatorios.view.noCongruenciales;

import com.pseudoaleatorios.view.constants.TextMenuConst;
import com.pseudoaleatorios.view.interfaces.IData;

import java.util.List;
import java.util.Scanner;

public class ProductosMediosView implements IData {
    private Scanner cs = new Scanner(System.in);
    private int quantityGenerate;
    private int seed1;
    private int seed2;

    public int getQuantityGenerate() { return quantityGenerate; }
    public int getSeed1() { return seed1; }
    public int getSeed2() { return seed2; }

    private void insertDataP() {
        System.out.println(TextMenuConst.GENERATE_NUMBER);
        quantityGenerate = cs.nextInt();
        System.out.println(TextMenuConst.INITIAL_SEED + "1");
        seed1 = cs.nextInt();
        System.out.println(TextMenuConst.INITIAL_SEED + "2");
        seed2 = cs.nextInt();
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