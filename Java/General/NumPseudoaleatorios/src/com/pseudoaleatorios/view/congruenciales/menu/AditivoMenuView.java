package com.pseudoaleatorios.view.congruenciales.menu;

import com.pseudoaleatorios.controller.congruenciales.AditivoCtrl;
import com.pseudoaleatorios.view.OptionMenuView;
import com.pseudoaleatorios.view.congruenciales.AditivoView;
import com.pseudoaleatorios.view.constants.TextMenuConst;
import com.pseudoaleatorios.view.interfaces.IMenu;

public class AditivoMenuView implements IMenu {
    private OptionMenuView oMView = new OptionMenuView();
    private AditivoView view = new AditivoView();
    private AditivoCtrl ctrl = new AditivoCtrl(view);

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