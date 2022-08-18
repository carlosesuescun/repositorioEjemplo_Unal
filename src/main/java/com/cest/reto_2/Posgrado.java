/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cest.reto_2;

/**
 *
 * @author carlo
 */
public class Posgrado extends Estudiante {
    private final String modalidad;

    public Posgrado(String nombre, String programa, String tipo_etnia, int edad, String modalidad) {
        super(nombre, programa, tipo_etnia, edad);
        this.modalidad = modalidad;
    }

    public String toString() {
        return "\n\tEstudiante Posgrado\n" + super.toString() + "\n\tModalidad: " + modalidad;
    }
}