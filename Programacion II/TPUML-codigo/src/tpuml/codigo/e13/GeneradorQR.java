package ar.edu.tup.uml.e13;


public class GeneradorQR { public void generar(String valor,Usuario u){ CodigoQR qr=new CodigoQR(valor,u);
    System.out.println("QR generado"); } }
