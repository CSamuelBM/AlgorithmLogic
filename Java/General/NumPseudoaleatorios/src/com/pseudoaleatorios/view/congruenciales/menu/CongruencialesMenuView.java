package com.pseudoaleatorios.view.congruenciales.menu;

import com.pseudoaleatorios.view.constants.TextMenuConst;
import com.pseudoaleatorios.view.interfaces.IMenu;

import java.util.Scanner;

public class CongruencialesMenuView implements IMenu {
    private LinealMenuView lMview = new LinealMenuView();
    private MultiplicativoMenuView mMView = new MultiplicativoMenuView();
    private AditivoMenuView aMView = new AditivoMenuView();
    private Scanner cs = new Scanner(System.in);

    @Override
    public void menu() {
        int opc;
        while (true) {
            System.out.println("1.- Lineal");
            System.out.println("2.- Multiplicativo");
            System.out.println("3.- Aditivo");
            System.out.println("4.- " + TextMenuConst.RETURN);
            opc = cs.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Lineal");
                    lMview.menu();
                    break;
                case 2:
                    System.out.println("Multiplicativo");
                    mMView.menu();
                    break;
                case 3:
                    System.out.println("Aditivo");
                    aMView.menu();
                    break;
                case 4:
                    return;
                default:
                    System.out.println(TextMenuConst.OPTION_NOT_VALID);
            }
        }
    }
}