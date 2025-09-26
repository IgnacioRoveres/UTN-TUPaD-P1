package ar.edu.tup.uml.e05;


public class Computadora {
    private String marca,numeroSerie; private PlacaMadre placaMadre; private Propietario propietario;
    public Computadora(String marca,String numeroSerie,PlacaMadre placaMadre,Propietario propietario){
        this.marca=marca;this.numeroSerie=numeroSerie;this.placaMadre=placaMadre;this.propietario=propietario;
        if(propietario!=null)propietario.setComputadora(this);
    }
}
