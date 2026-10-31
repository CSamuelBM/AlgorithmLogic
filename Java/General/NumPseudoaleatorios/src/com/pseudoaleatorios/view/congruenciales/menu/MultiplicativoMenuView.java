package com.pseudoaleatorios.view.congruenciales.menu;

import com.pseudoaleatorios.controller.congruenciales.MultiplicativoCtrl;
import com.pseudoaleatorios.view.OptionMenuView;
import com.pseudoaleatorios.view.congruenciales.MultiplicativoView;
import com.pseudoaleatorios.view.interfaces.IMenu;
import com.pseudoaleatorios.view.constants.TextMenuConst;

public class MultiplicativoMenuView implements IMenu {
    private OptionMenuView oMView = new OptionMenuView();
    private final MultiplicativoView view = new MultiplicativoView();
    private final MultiplicativoCtrl ctrl = new MultiplicativoCtrl(view);

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