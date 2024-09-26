package com.jhonatan.ejemplo.models;

import com.jhonatan.ejemplo.anotaciones.Deportivo;

public class Aplicacion {
    public static void main(String[] args) {

        Automovil auto = new Automovil("rojo", 2012);

        /* quiero saber si el auto es deportivo */
        if (auto.getClass().getAnnotation(Deportivo.class) != null) {
            System.out.println("El auto es deportivo");
        } else {
            System.out.println(" El no auto es deportivo");
        }

    }
}
