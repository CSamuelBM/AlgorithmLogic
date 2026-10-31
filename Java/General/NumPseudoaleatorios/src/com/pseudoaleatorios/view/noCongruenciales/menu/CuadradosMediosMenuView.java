package com.pseudoaleatorios.view.noCongruenciales.menu;

import com.pseudoaleatorios.controller.noCongruenciales.CuadradosMediosCtrl;
import com.pseudoaleatorios.view.OptionMenuView;
import com.pseudoaleatorios.view.interfaces.IMenu;
import com.pseudoaleatorios.view.constants.TextMenuConst;
import com.pseudoaleatorios.view.noCongruenciales.CuadradosMediosView;

public class CuadradosMediosMenuView implements IMenu {
    private OptionMenuView oMView = new OptionMenuView();
    private CuadradosMediosView view = new CuadradosMediosView();
    private CuadradosMediosCtrl ctrl = new CuadradosMediosCtrl(view);

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