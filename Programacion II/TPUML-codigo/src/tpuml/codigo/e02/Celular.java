package ar.edu.tup.uml.e02;


public class Celular {
    private String imei, marca, modelo;
    private Bateria bateria; private Usuario usuario;
    public Celular(String imei,String marca,String modelo,Bateria bateria,Usuario usuario){
        this.imei=imei;this.marca=marca;this.modelo=modelo;this.bateria=bateria;this.usuario=usuario;
        if (usuario!=null) usuario.setCelular(this);
    }
}
