package ar.edu.tup.uml.e01;


public class Titular {
    private String nombre,dni;
    private Pasaporte pasaporte;
    public Titular(String nombre,String dni){this.nombre=nombre;this.dni=dni;}
    void setPasaporte(Pasaporte p){this.pasaporte=p;}
    public Pasaporte getPasaporte(){return pasaporte;}
}
