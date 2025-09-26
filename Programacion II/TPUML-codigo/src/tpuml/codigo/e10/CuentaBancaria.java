package ar.edu.tup.uml.e10;


public class CuentaBancaria {
    private String cbu; private double saldo; private ClaveSeguridad clave; private Titular titular;
    public CuentaBancaria(String cbu,double saldo,ClaveSeguridad clave,Titular titular){this.cbu=cbu;this.saldo=saldo;this.clave=clave;this.titular=titular;
        if(titular!=null)titular.setCuenta(this);
    }
}
