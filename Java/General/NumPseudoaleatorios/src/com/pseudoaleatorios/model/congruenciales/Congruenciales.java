package com.pseudoaleatorios.model.congruenciales;

public class Congruenciales {
    public int mod(int x, int m) { return modP(x, m);
    } //Funcion que se encarga de compartir la logia del modulo.

    public double finalSeed(int mod, int m) { return finalSeedP(mod, m);
    }  //Funcion que se encarga de compartir la logia de ri.

    private int modP(int x, int m) { return minus(x, multiplication(division(x, m), m)); }

    private int division(int x, int m) { return x / m; }

    private int multiplication(int division, int m) { return division * m; }

    private int minus(int x, int multiplication) { return x - multiplication; }

    private double finalSeedP(int mod, int m) { return (double) mod / res(m); }

    private int res(int m) { return m - 1; }
}