package com.mycompany.encapsulamiento;

public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        setEdad(edad);
        setPromedio(promedio);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    // Setters (con validación)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad inválida, no se pudo actualizar.");
        }
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0.0 && promedio <= 5.0) {
            this.promedio = promedio;
        } else {
            System.out.println("Promedio fuera de rango, no se pudo actualizar.");
        }
    }
}
