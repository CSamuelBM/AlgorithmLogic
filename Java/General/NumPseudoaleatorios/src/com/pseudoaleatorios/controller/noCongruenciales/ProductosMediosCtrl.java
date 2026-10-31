package com.pseudoaleatorios.controller.noCongruenciales;

import com.pseudoaleatorios.controller.IGenerateCtrl;
import com.pseudoaleatorios.model.noCongruenciales.ProductosMediosMdl;
import com.pseudoaleatorios.view.noCongruenciales.ProductosMediosView;

import java.util.List;

public class ProductosMediosCtrl implements IGenerateCtrl {
    private final ProductosMediosView view;
    private final ProductosMediosMdl mdl;

    public ProductosMediosCtrl (ProductosMediosView view) {
        this.view = view;
        this.mdl = new ProductosMediosMdl();
    }

    private void processDataP() {
        int quantityGenerate = view.getQuantityGenerate();
        int seed1 = view.getSeed1();
        int seed2 = view.getSeed2();
        List<Double> r;

        mdl.setQuantityGenerate(quantityGenerate);
        mdl.setSeed1(seed1);
        mdl.setSeed2(seed2);

        r = mdl.generatorNumber();

        view.showData(r);
    }

    @Override
    public void processData() { processDataP(); }

}