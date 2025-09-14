package com.mycompany.tppooii;

public class Empleado {

    // ==============================
    // 🔹 ATRIBUTOS
    // ==============================
    private int id;             // Identificador único
    private String nombre;      // Nombre completo
    private String puesto;      // Cargo que desempeña
    private double salario;     // Salario actual

    // Atributo estático → compartido por todas las instancias
    private static int totalEmpleados = 0;  

    // ==============================
    // 🔹 CONSTRUCTORES
    // ==============================

    /**
     * Constructor completo: recibe todos los parámetros.
     * Uso de this para diferenciar atributos de parámetros.
     */
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // cada vez que se crea un empleado, el contador aumenta
    }

    /**
     * Constructor sobrecargado: solo recibe nombre y puesto.
     * Asigna un ID automático y un salario por defecto.
     * @param nombre
     */
    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados;   // genera ID automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000;         // salario por defecto
    }

    // ==============================
    // 🔹 MÉTODOS SOBRECARGADOS
    // ==============================

    /**
     * Aumenta el salario en base a un porcentaje.
     */
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    /**
     * Aumenta el salario en una cantidad fija.
     */
    public void actualizarSalario(int cantidad) {
        this.salario += cantidad;
    }

    // ==============================
    // 🔹 toString()
    // ==============================
    @Override
    public String toString() {
        return "Empleado {" +
                "ID=" + id +
                ", Nombre='" + nombre + '\'' +
                ", Puesto='" + puesto + '\'' +
                ", Salario=" + salario +
                '}';
    }

    // ==============================
    // 🔹 MÉTODOS ESTÁTICOS
    // ==============================
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // ==============================
    // 🔹 GETTERS & SETTERS
    // ==============================
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public double getSalario() { return salario; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public void setSalario(double salario) { this.salario = salario; }
}
