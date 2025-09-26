package ar.edu.tup.uml.e02;


public class Usuario {
    private String nombre,dni; private Celular celular;
    public Usuario(String nombre,String dni){this.nombre=nombre;this.dni=dni;}
    void setCelular(Celular c){this.celular=c;}
}
