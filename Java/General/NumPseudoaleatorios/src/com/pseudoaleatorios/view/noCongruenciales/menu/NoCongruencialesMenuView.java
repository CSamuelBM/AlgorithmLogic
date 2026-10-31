package com.pseudoaleatorios.view.noCongruenciales.menu;

import com.pseudoaleatorios.view.interfaces.IMenu;
import com.pseudoaleatorios.view.constants.TextMenuConst;

import java.util.Scanner;

public class NoCongruencialesMenuView implements IMenu {
    private static Scanner cs = new Scanner(System.in);
    private static CuadradosMediosMenuView cMMView = new CuadradosMediosMenuView();
    private static ProductosMediosMenuView pMMView = new ProductosMediosMenuView();
    private static MultiplicadorConstanteMenuView mCMView = new MultiplicadorConstanteMenuView();

    private void menuP() {
        int opc;
        while (true) {
            System.out.println("1.- Cuadrados Medios");
            System.out.println("2.- Productos Medios");
            System.out.println("3.- Multiplicador Constante");
            System.out.println("4.- " + TextMenuConst.RETURN);
            opc = cs.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Cuadrados Medios");
                    cMMView.menu();
                    break;
                case 2:
                    System.out.println("Productos Medios");
                    pMMView.menu();
                    break;
                case 3:
                    System.out.println("Multiplicador Constante");
                    mCMView.menu();
                    break;
                case 4:
                    return;
                default:
                    System.out.println(TextMenuConst.OPTION_NOT_VALID);
            }
        }
    }

    @Override
    public void menu() { menuP(); }
}