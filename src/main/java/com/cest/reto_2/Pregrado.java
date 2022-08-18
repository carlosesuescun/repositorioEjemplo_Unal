/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cest.reto_2;

/**
 *
 * @author carlo
 */
public class Pregrado extends Estudiante {
    private final int cantidad_creditos;

    public Pregrado(String nombre, String programa, String tipo_etnia, int edad, int cantidad_creditos) {
        super(nombre, programa, tipo_etnia, edad);
        this.cantidad_creditos = cantidad_creditos;
    }

    public String toString() {
        return "\n\tEstudiante Pregrado\n" + super.toString() + "\n\tCreditos aprobados: " + cantidad_creditos;
    }
}