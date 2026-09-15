

package com.mycompany.composicion;

public class FuentePoder {
    private int voltaje;

    public FuentePoder(int voltaje) {
        this.voltaje = voltaje;
    }

    public void suministrar() {
        System.out.println("Energía suministrada correctamente a " + voltaje + "V.");
    }
}