package com.mycompany.tpintroapoo;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    public void setAnioPublicacion(int anio) {
        if (anio > 0 && anio <= 2025) {
            this.anioPublicacion = anio;
        } else {
            System.out.println("⚠️ Año inválido, se mantiene el anterior.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor +
                " | Año: " + anioPublicacion);
    }
}
