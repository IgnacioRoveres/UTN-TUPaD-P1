package ar.edu.tup.uml.e07;


public class Conductor { private String nombre,licencia; private Vehiculo vehiculo;
    public Conductor(String nombre,String licencia){this.nombre=nombre;this.licencia=licencia;}
    void setVehiculo(Vehiculo v){vehiculo=v;}
}
