package com.mycompany.tpintroapoo;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = Math.max(0, Math.min(combustible, MAX_COMBUSTIBLE));
    }

    public void despegar() {
        int costo = 10;
        if (combustible >= costo) {
            combustible -= costo;
            System.out.println(nombre + " despegó.");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        if (distancia <= 0) {
            System.out.println("La distancia debe ser positiva.");
            return;
        }
        int consumo = distancia * 2;
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km.");
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " km.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a recargar debe ser positiva.");
            return;
        }
        combustible = Math.min(MAX_COMBUSTIBLE, combustible + cantidad);
        System.out.println("Combustible actual: " + combustible + "/" + MAX_COMBUSTIBLE);
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + MAX_COMBUSTIBLE);
    }
}
