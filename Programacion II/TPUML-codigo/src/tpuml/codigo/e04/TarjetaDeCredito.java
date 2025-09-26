package ar.edu.tup.uml.e04;


public class TarjetaDeCredito {
    private String numero, fechaVencimiento; private Cliente cliente; private Banco banco;
    public TarjetaDeCredito(String numero,String fechaVencimiento,Cliente cliente,Banco banco){
        this.numero=numero;this.fechaVencimiento=fechaVencimiento;this.cliente=cliente;this.banco=banco;
        if(cliente!=null)cliente.setTarjeta(this);
    }
}
