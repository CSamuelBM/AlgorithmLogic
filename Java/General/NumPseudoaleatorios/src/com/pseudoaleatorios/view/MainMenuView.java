package com.pseudoaleatorios.view;

import com.pseudoaleatorios.view.congruenciales.menu.CongruencialesMenuView;
import com.pseudoaleatorios.view.constants.TextMenuConst;
import com.pseudoaleatorios.view.interfaces.IMenu;
import com.pseudoaleatorios.view.noCongruenciales.menu.NoCongruencialesMenuView;

import java.util.Scanner;

public class MainMenuView implements IMenu {
    private Scanner cs = new Scanner(System.in);
    private NoCongruencialesMenuView nCMView = new NoCongruencialesMenuView();
    private CongruencialesMenuView cMView = new CongruencialesMenuView();

    private void menuP() {
        int opc;
        while (true) {
            System.out.println("1.- No Congruenciales");
            System.out.println("2.- Congruenciales");
            System.out.println("3.- Salir De La App");
            opc = cs.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("No Congruenciales");
                    nCMView.menu();
                    break;
                case 2:
                    System.out.println("Congruenciales");
                    cMView.menu();
                    break;
                case 3:
                    System.out.print("Gracias vuelve pronto");
                    return;
                default:
                    System.out.println(TextMenuConst.OPTION_NOT_VALID);
            }
        }
    }

    @Override
    public void menu() { menuP(); }
}