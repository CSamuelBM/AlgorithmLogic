package com.pseudoaleatorios.controller.noCongruenciales;

import com.pseudoaleatorios.controller.IGenerateCtrl;
import com.pseudoaleatorios.model.noCongruenciales.CuadradosMediosMdl;
import com.pseudoaleatorios.view.noCongruenciales.CuadradosMediosView;

import java.util.List;

public class CuadradosMediosCtrl implements IGenerateCtrl {
    private final CuadradosMediosView view;
    private final CuadradosMediosMdl mdl;

    public CuadradosMediosCtrl(CuadradosMediosView view) {
        this.view = view;
        this.mdl = new CuadradosMediosMdl();
    }

    private void processDataP() {
        int quantityGenerate = view.getQuantityGenerate();
        int seed = view.getSeed();
        List<Double> r;

        mdl.setQuantityGenerate(quantityGenerate);
        mdl.setSeed(seed);

        r = mdl.generatorNumber();

        view.showData(r);
    }

    @Override
    public void processData() { processDataP(); }
}