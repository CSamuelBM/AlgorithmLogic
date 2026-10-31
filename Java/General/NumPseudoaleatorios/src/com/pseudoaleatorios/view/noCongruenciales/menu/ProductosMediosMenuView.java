package com.pseudoaleatorios.view.noCongruenciales.menu;

import com.pseudoaleatorios.controller.noCongruenciales.ProductosMediosCtrl;
import com.pseudoaleatorios.view.OptionMenuView;
import com.pseudoaleatorios.view.interfaces.IMenu;
import com.pseudoaleatorios.view.constants.TextMenuConst;
import com.pseudoaleatorios.view.noCongruenciales.ProductosMediosView;

public class ProductosMediosMenuView implements IMenu {
    private OptionMenuView oMView = new OptionMenuView();
    private ProductosMediosView view = new ProductosMediosView();
    private ProductosMediosCtrl ctrl = new ProductosMediosCtrl(view);

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