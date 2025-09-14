package com.mycompany.tpintroapoo;

public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() {
        this.huevosPuestos++;
    }

    public void envejecer() {
        this.edad++;
    }

    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina +
                " | Edad: " + edad +
                " | Huevos puestos: " + huevosPuestos);
    }
}
