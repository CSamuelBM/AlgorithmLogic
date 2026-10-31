package com.pseudoaleatorios.view.congruenciales;

import com.pseudoaleatorios.view.constants.TextMenuConst;
import com.pseudoaleatorios.view.interfaces.IData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AditivoView implements IData {
    private final Scanner cs = new Scanner(System.in);
    private int quantityGenerate;
    private final List<Integer> sequenceNumber = new ArrayList<>();
    private int m;

    public int getQuantityGenerate() { return quantityGenerate; }

    public List<Integer> getSequenceNumber() { return sequenceNumber; }

    public int getM() { return m; }

    private void insertDataP() {
        int n;
        System.out.println(TextMenuConst.GENERATE_NUMBER);
        quantityGenerate = cs.nextInt();
        System.out.println("Cantidad de semillas iniciales");
        n = cs.nextInt();
        saveSequenceNumber(n);
        System.out.println(TextMenuConst.MOD);
        m = cs.nextInt();
    }

    private void saveSequenceNumber(int n) {
        for(int i = 0; i < n; i++) { sequenceNumber.add(cs.nextInt()); }
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