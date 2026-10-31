package com.pseudoaleatorios.controller.congruenciales;

import com.pseudoaleatorios.controller.IGenerateCtrl;
import com.pseudoaleatorios.model.congruenciales.MultiplicativoMdl;
import com.pseudoaleatorios.view.congruenciales.MultiplicativoView;

import java.util.List;

public class MultiplicativoCtrl implements IGenerateCtrl  {
    private MultiplicativoView view;
    private MultiplicativoMdl mdl;

    public MultiplicativoCtrl(MultiplicativoView view) {
        this.view = view;
        mdl = new MultiplicativoMdl();
    }

    private void processDataP() {
        int seed = view.getSeed();
        int a = view.getA();
        int m = view.getM();
        List<Double> r;

        mdl.setSeed(seed);
        mdl.setA(a);
        mdl.setM(m);

        r = mdl.generatorNumber();

        view.showData(r);
    }

    @Override
    public void processData() { processDataP(); }
}