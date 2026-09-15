package com.mycompany.encapsulamiento;

public class Encapsulamiento {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Laura Gómez", 20, 4.5);

        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Promedio: " + estudiante.getPromedio());

        // Usamos el setter para actualizar el promedio
        estudiante.setPromedio(4.8);
        System.out.println("Nuevo promedio: " + estudiante.getPromedio());

        // Intento de asignar un valor inválido: el setter lo rechaza
        estudiante.setEdad(-5);
    }
}
