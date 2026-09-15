/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.composicion;

public class Computadora {
    private FuentePoder fuente; 

    public Computadora() {

        this.fuente = new FuentePoder(500);
    }

    public void encender() {
        System.out.println("Iniciando secuencia de encendido...");
        fuente.suministrar();
    }
}