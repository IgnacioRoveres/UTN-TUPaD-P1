package ar.edu.tup.uml.e03;


public class Libro {
    private String titulo,isbn; private Autor autor; private Editorial editorial;
    public Libro(String titulo,String isbn,Autor autor,Editorial editorial){
        this.titulo=titulo; this.isbn=isbn; this.autor=autor; this.editorial=editorial;
    }
}
