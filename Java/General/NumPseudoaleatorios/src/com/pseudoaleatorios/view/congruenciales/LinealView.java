package com.pseudoaleatorios.view.congruenciales;

import com.pseudoaleatorios.view.constants.TextMenuConst;
import com.pseudoaleatorios.view.interfaces.IData;

import java.util.List;
import java.util.Scanner;

public class LinealView implements IData {
    private Scanner cs = new Scanner(System.in);
    private int seed;
    private int a;
    private int c;
    private int m;

    public int getSeed() { return seed; }

    public int getA() { return a; }

    public int getC() { return c; }

    public int getM() { return m; }

    private void insertDataP() {
        this.seed = validate(TextMenuConst.INITIAL_SEED, "No se acepta la semilla negativa");
        this.a = validate(TextMenuConst.CONST_MULTIPLICATIVA, "No se acepta la constante multiplicativa negativa");
        this.c = validate("Constante aditiva", "No se aceptan la constante aditiva negativa");
        this.m = validate(TextMenuConst.MOD, "No se acepta el mod negativo");
    }

    private int validate(String textMC1, String textMC2) {
        int n;
        while (true) {
            System.out.println(textMC1);
            n = cs.nextInt();
            if(n < 0) { System.out.println(textMC2); }
            else { return n; }
        }
    }

    private void showDataP(List<Double> r) {
        int c = 1;
        for(Double i : r) {
            System.out.printf("R%d %.4f%n", c, i);
            c++;
        }
    }

    @Override
    public void insertData() { insertDataP(); }

    @Override
    public void showData(List<Double> r) { showDataP(r); }
}