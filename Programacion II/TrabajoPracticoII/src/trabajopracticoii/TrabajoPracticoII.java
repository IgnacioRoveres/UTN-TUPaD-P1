package trabajopracticoii;

import java.util.Locale;
import java.util.Scanner;

public class TrabajoPracticoII {

    private static final double DESCUENTO_ESPECIAL = 0.10;
    private static final Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    // --------- Ejercicios (mismos que te pasé) ---------
    public static void ejercicio1() {
        System.out.print("Ingrese un año: ");
        int anio = leerEntero();
        boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        System.out.println("El año " + anio + (bisiesto ? " es" : " no es") + " bisiesto.");
    }

    public static void ejercicio2() {
        System.out.print("Ingrese el primer número: ");
        int a = leerEntero();
        System.out.print("Ingrese el segundo número: ");
        int b = leerEntero();
        System.out.print("Ingrese el tercer número: ");
        int c = leerEntero();
        int mayor = Math.max(a, Math.max(b, c));
        System.out.println("El mayor es: " + mayor);
    }

    public static void ejercicio3() {
        System.out.print("Ingrese su edad: ");
        int edad = leerEntero();
        if (edad < 12) System.out.println("Eres un Niño.");
        else if (edad < 18) System.out.println("Eres un Adolescente.");
        else if (edad < 60) System.out.println("Eres un Adulto.");
        else System.out.println("Eres un Adulto mayor.");
    }

    public static void ejercicio4() {
        System.out.print("Ingrese el precio del producto: ");
        double precio = leerDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String cat = sc.next().trim().toUpperCase();
        double desc = switch (cat) { case "A" -> 0.10; case "B" -> 0.15; case "C" -> 0.20; default -> -1; };
        if (desc < 0) { System.out.println("Categoría inválida."); return; }
        double precioFinal = precio * (1 - desc);
        System.out.println("Descuento aplicado: " + (int)(desc * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }

    public static void ejercicio5() {
        int suma = 0;
        while (true) {
            System.out.print("Ingrese un número (0 para terminar): ");
            int n = leerEntero();
            if (n == 0) break;
            if (n % 2 == 0) suma += n;
        }
        System.out.println("La suma de los números pares es: " + suma);
    }

    public static void ejercicio6() {
        int pos = 0, neg = 0, ceros = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int n = leerEntero();
            if (n > 0) pos++; else if (n < 0) neg++; else ceros++;
        }
        System.out.println("Resultados:");
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + ceros);
    }

    public static void ejercicio7() {
        int nota;
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = leerEntero();
            if (nota < 0 || nota > 10) System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente.");
    }

    public static void ejercicio8() {
        System.out.print("Ingrese el precio base del producto: ");
        double base = leerDouble();
        System.out.print("Ingrese el impuesto en porcentaje (Ej: 10 para 10%): ");
        double imp = leerDouble();
        System.out.print("Ingrese el descuento en porcentaje (Ej: 5 para 5%): ");
        double desc = leerDouble();
        double pf = calcularPrecioFinal(base, imp, desc);
        System.out.println("El precio final del producto es: " + pf);
    }

    public static double calcularPrecioFinal(double precioBase, double impuestoPct, double descuentoPct) {
        double imp = precioBase * (impuestoPct / 100.0);
        double desc = precioBase * (descuentoPct / 100.0);
        return precioBase + imp - desc;
    }

    public static void ejercicio9() {
        System.out.print("Ingrese el precio del producto: ");
        double precio = leerDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = leerDouble();
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = sc.next().trim();
        double costoEnvio = calcularCostoEnvio(peso, zona);
        if (costoEnvio < 0) { System.out.println("Zona inválida. Use 'Nacional' o 'Internacional'."); return; }
        double total = calcularTotalCompra(precio, costoEnvio);
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) return 5.0 * peso;
        if (zona.equalsIgnoreCase("Internacional")) return 10.0 * peso;
        return -1;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void ejercicio10() {
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = leerEntero();
        System.out.print("Ingrese la cantidad vendida: ");
        int vendida = leerEntero();
        System.out.print("Ingrese la cantidad recibida: ");
        int recibida = leerEntero();
        int nuevo = actualizarStock(stockActual, vendida, recibida);
        System.out.println("El nuevo stock del producto es: " + nuevo);
    }

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    public static void ejercicio11() {
        System.out.print("Ingrese el precio del producto: ");
        double precio = leerDouble();
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double finalConDesc = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + finalConDesc);
    }

    public static void ejercicio12() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        mostrarArrayForEach(precios);
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        mostrarArrayForEach(precios);
    }

    private static void mostrarArrayForEach(double[] arr) {
        for (double p : arr) System.out.println("Precio: $" + p);
    }

    public static void ejercicio13() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        imprimirArrayRec(precios, 0);
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        imprimirArrayRec(precios, 0);
    }

    private static void imprimirArrayRec(double[] arr, int i) {
        if (i == arr.length) return;
        System.out.println("Precio: $" + arr[i]);
        imprimirArrayRec(arr, i + 1);
    }

    private static int leerEntero() {
        while (!sc.hasNextInt()) { System.out.print("Valor inválido. Ingrese un entero: "); sc.next(); }
        return sc.nextInt();
    }

    private static double leerDouble() {
        while (!sc.hasNextDouble()) { System.out.print("Valor inválido. Ingrese un número (use punto): "); sc.next(); }
        return sc.nextDouble();
    }

    private static void mostrarMenu() {
        System.out.println("\n========= MENÚ TP Programación Estructurada =========");
        System.out.println(" 1) Año bisiesto");
        System.out.println(" 2) Mayor de tres números");
        System.out.println(" 3) Clasificación de edad");
        System.out.println(" 4) Descuento por categoría");
        System.out.println(" 5) Suma de pares (while)");
        System.out.println(" 6) Contador pos/neg/ceros (for)");
        System.out.println(" 7) Validación de nota (do-while)");
        System.out.println(" 8) Precio final con impuesto y descuento");
        System.out.println(" 9) Costo de envío y total (funciones)");
        System.out.println("10) Actualización de stock");
        System.out.println("11) Descuento especial (variable global)");
        System.out.println("12) Arrays: modificar y mostrar");
        System.out.println("13) Recursividad: imprimir array");
        System.out.println(" 0) Salir");
        System.out.print("Elegí una opción: ");
    }

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            int op = leerEntero();
            System.out.println();
            switch (op) {
                case 1 -> ejercicio1();
                case 2 -> ejercicio2();
                case 3 -> ejercicio3();
                case 4 -> ejercicio4();
                case 5 -> ejercicio5();
                case 6 -> ejercicio6();
                case 7 -> ejercicio7();
                case 8 -> ejercicio8();
                case 9 -> ejercicio9();
                case 10 -> ejercicio10();
                case 11 -> ejercicio11();
                case 12 -> ejercicio12();
                case 13 -> ejercicio13();
                case 0 -> { System.out.println("¡Listo! Éxitos con la entrega."); return; }
                default -> System.out.println("Opción inválida.");
            }
            System.out.println();
        }
    }
}
