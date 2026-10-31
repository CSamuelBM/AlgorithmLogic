package com.pseudoaleatorios.controller.congruenciales;

import com.pseudoaleatorios.controller.IGenerateCtrl;
import com.pseudoaleatorios.model.congruenciales.LinealMdl;
import com.pseudoaleatorios.view.congruenciales.LinealView;

import java.util.List;

public class LinealCtrl implements IGenerateCtrl  {
    private final LinealView view;
    private final LinealMdl mdl;

    public LinealCtrl(LinealView view) {
        this.view = view;
        mdl = new LinealMdl();
    }

    private void processDataP() {
        List<Double> r;

        mdl.setSeed(view.getSeed());
        mdl.setA(view.getA());
        mdl.setC(view.getC());
        mdl.setM(view.getM());

        r = mdl.generatorNumber();

        view.showData(r);
    }

    @Override
    public void processData() { processDataP(); }
}