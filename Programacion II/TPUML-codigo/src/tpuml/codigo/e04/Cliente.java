package ar.edu.tup.uml.e04;


public class Cliente {
    private String nombre,dni; private TarjetaDeCredito tarjeta;
    public Cliente(String nombre,String dni){this.nombre=nombre;this.dni=dni;}
    void setTarjeta(TarjetaDeCredito t){tarjeta=t;}
}
