package ar.edu.tup.uml.e06;


public class Reserva {
    private String fecha,hora; private Cliente cliente; private Mesa mesa;
    public Reserva(String fecha,String hora,Cliente cliente,Mesa mesa){this.fecha=fecha;this.hora=hora;this.cliente=cliente;this.mesa=mesa;}
}
