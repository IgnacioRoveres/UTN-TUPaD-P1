package ar.edu.tup.uml.e12;


public class Impuesto { private double monto; private Contribuyente contribuyente;
    public Impuesto(double monto,Contribuyente c){this.monto=monto;this.contribuyente=c;}
    public double getMonto(){return monto;} }
