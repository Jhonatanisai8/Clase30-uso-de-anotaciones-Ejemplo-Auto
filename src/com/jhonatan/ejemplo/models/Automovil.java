package com.jhonatan.ejemplo.models;

public class Automovil {
    private String color;
    private int modelo;
    private String marca;

    public Automovil(String color, int modelo) {
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void establecerMarca() {
        this.marca = "HONDA";
    }


}
