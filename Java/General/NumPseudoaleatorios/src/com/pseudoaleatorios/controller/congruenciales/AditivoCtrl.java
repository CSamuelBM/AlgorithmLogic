package com.pseudoaleatorios.controller.congruenciales;

import com.pseudoaleatorios.controller.IGenerateCtrl;
import com.pseudoaleatorios.model.congruenciales.AditivoMdl;
import com.pseudoaleatorios.view.congruenciales.AditivoView;

import java.util.List;

public class AditivoCtrl implements IGenerateCtrl {
    private final AditivoView view;
    private final AditivoMdl mdl;

    public AditivoCtrl(AditivoView view) {
        this.view = view;
        mdl = new AditivoMdl();
    }

    private void processDataP() {
        List<Double> r;

        mdl.setQuantityGenerate(view.getQuantityGenerate());
        mdl.setSequenceNumber(view.getSequenceNumber());
        mdl.setM(view.getM());

        r = mdl.generatorNumber();

        view.showData(r);
    }

    @Override
    public void processData() { processDataP(); }
}