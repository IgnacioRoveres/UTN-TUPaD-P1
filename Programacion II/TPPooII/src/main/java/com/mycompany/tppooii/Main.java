package com.mycompany.tppooii;
public class Main {
    public static void main(String[] args) {
        
        // Crear empleados con constructor completo
        Empleado e1 = new Empleado(1, "Ana Gómez", "Desarrolladora", 80000);
        Empleado e2 = new Empleado(2, "Carlos Pérez", "Analista", 75000);

        // Crear empleados con constructor sobrecargado (ID automático y salario por defecto)
        Empleado e3 = new Empleado("Lucía Martínez", "Tester");
        Empleado e4 = new Empleado("Pedro López", "Project Manager");

        // Aplicar aumentos de salario
        e1.actualizarSalario(10);   // +10%
        e2.actualizarSalario(5000); // +5000 fijos

        // Mostrar empleados con toString()
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        // Mostrar total de empleados creados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
