package com.pseudoaleatorios.controller.noCongruenciales;

import com.pseudoaleatorios.controller.IGenerateCtrl;
import com.pseudoaleatorios.model.noCongruenciales.MultiplicadorConstanteMdl;
import com.pseudoaleatorios.view.noCongruenciales.MultiplicadorConstanteView;

import java.util.List;

public class MultiplicadorConstanteCtrl implements IGenerateCtrl {
    private final MultiplicadorConstanteView view;
    private final MultiplicadorConstanteMdl mdl;

    public MultiplicadorConstanteCtrl(MultiplicadorConstanteView view) {
        this.view = view;
        mdl = new MultiplicadorConstanteMdl();
    }

    private void processDataP() {
        int quantityGenerate = view.getQuantityGenerate();
        int a = view.getA();
        int seed = view.getSeed();
        List<Double> r;

        mdl.setQuantityGenerate(quantityGenerate);
        mdl.setA(a);
        mdl.setSeed(seed);

        r = mdl.generatorNumber();

        view.showData(r);
    }

    @Override
    public void processData() { processDataP(); }
}