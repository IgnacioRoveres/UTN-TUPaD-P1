package ar.edu.tup.uml.e07;


public class Vehiculo {
    private String patente,modelo; private Motor motor; private Conductor conductor;
    public Vehiculo(String patente,String modelo,Motor motor,Conductor conductor){
        this.patente=patente;this.modelo=modelo;this.motor=motor;this.conductor=conductor;
        if(conductor!=null)conductor.setVehiculo(this);
    }
}
