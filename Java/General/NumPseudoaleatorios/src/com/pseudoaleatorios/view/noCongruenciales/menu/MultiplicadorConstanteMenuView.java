package com.pseudoaleatorios.view.noCongruenciales.menu;

import com.pseudoaleatorios.controller.noCongruenciales.MultiplicadorConstanteCtrl;
import com.pseudoaleatorios.view.OptionMenuView;
import com.pseudoaleatorios.view.interfaces.IMenu;
import com.pseudoaleatorios.view.constants.TextMenuConst;
import com.pseudoaleatorios.view.noCongruenciales.MultiplicadorConstanteView;

public class MultiplicadorConstanteMenuView implements IMenu {
    private OptionMenuView oMView = new OptionMenuView();
    private MultiplicadorConstanteView view = new MultiplicadorConstanteView();
    private MultiplicadorConstanteCtrl ctrl = new MultiplicadorConstanteCtrl(view);

    private void menuP() {
        while (true) {
            switch (oMView.option()) {
                case 1:
                    view.insertData();
                    break;
                case 2:
                    ctrl.processData();
                    break;
                case 3:
                    return;
                default:
                    System.out.println(TextMenuConst.OPTION_NOT_VALID);
            }
        }
    }

    @Override
    public void menu() { menuP(); }
}