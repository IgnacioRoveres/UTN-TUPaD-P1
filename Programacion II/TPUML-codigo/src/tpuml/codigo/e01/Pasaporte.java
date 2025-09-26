package ar.edu.tup.uml.e01;


public class Pasaporte {
    private String numero, fechaEmision;
    private Foto foto;
    private Titular titular;
    public Pasaporte(String numero, String fechaEmision, Foto foto, Titular titular){
        this.numero=numero; this.fechaEmision=fechaEmision;
        this.foto=foto; this.titular=titular;
        if (titular!=null) titular.setPasaporte(this);
    }
    public String getNumero(){return numero;}
    public Foto getFoto(){return foto;}
    public Titular getTitular(){return titular;}
}
