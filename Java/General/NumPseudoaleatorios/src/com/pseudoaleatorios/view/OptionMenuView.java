package com.pseudoaleatorios.view;

import com.pseudoaleatorios.view.constants.TextMenuConst;

import java.util.Scanner;

public class OptionMenuView {
    private Scanner cs = new Scanner(System.in);

    private int optionP() {
        int opc;
        System.out.println("1.- Ingresar Datos");
        System.out.println("2.- Mostrar Datos");
        System.out.println("3.- " + TextMenuConst.RETURN);
        opc = cs.nextInt();
        return opc;
    }

    public int option() { return optionP(); }
}