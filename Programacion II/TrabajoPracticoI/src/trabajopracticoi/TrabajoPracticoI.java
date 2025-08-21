package trabajopracticoi;

/**
 *
 * @author Ignacio Roveres
 */
import java.util.Scanner;
public class TrabajoPracticoI {
    
//Ejercicio 2 
   public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola, Java!");
    }
}
// Ejerciocio 3
   public class VariablesEjemplo {
    public static void main(String[] args) {
        String nombre = "Ignacio";
        int edad = 26;
        double altura = 1.78;
        boolean estudiante = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("¿Es estudiante?: " + estudiante);
    }
}
// Ejercicio 4
   public class EntradaUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
// Ejercicio 5
   public class Operaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número entero: ");
        int a = sc.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int b = sc.nextInt();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));

        if (b != 0) {
            System.out.println("División: " + (a / b)); // división entera
        } else {
            System.out.println("División: error (no se puede dividir por cero)");
        }
    }
}

// Ejercicio 6
   public class Escapes {
    public static void main(String[] args) {
        System.out.println("Nombre: Juan Pérez\nEdad: 30 años\nDirección: \"Calle Falsa 123\"");
    }
}

// Ejercicio 7
   public class ExpresionesInstrucciones {
    public static void main(String[] args) {
        int x = 10;            // Instrucción de declaración+asignación (contiene la expresión literal 10)
        x = x + 5;             //  Instrucción de asignación (contiene la expresión x + 5)
        System.out.println(x); //  Instrucción (llamada a método)

        /*
         * Explicación breve:
         * - Expresiones: producen un valor (p.ej., 10, x + 5).
         * - Instrucciones: ordenan que algo se ejecute (declarar/asignar/imprimir).
         * Diferencia: la expresión evalúa a un valor; la instrucción realiza una acción
         * que puede incluir evaluar expresiones.
         */
    }
}

// Ejercicio 8
   
 public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número 1 (entero): ");
        int a = sc.nextInt();

        System.out.print("Número 2 (entero): ");
        int b = sc.nextInt();

        // División entera
        if (b != 0) {
            int divisionEntera = a / b;
            System.out.println("División entera (int/int): " + divisionEntera);
        } else {
            System.out.println("División entera: error (no se puede dividir por cero)");
        }

        // División real usando double
        if (b != 0) {
            double divisionReal = (double) a / (double) b;
            System.out.println("División real (double/double): " + divisionReal);
        } else {
            System.out.println("División real: error (no se puede dividir por cero)");
        }
    }
}
 
// Ejercicio 9
 
 public class ErrorEjemploCorregido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // Se usa nextLine() porque es texto

        System.out.println("Hola, " + nombre);

        /*
         * Error original:
         * String nombre = scanner.nextInt();
         * nextInt() devuelve un entero, no un String. Provocaba error de tipos.
         * Solución: usar nextLine() para leer cadenas de texto.
         */
    }
}
// ejercicio 10
 public class PruebaEscritorio {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int resultado = a / b; // división entera: 5/2 = 2

        System.out.println("Resultado: " + resultado);
        /*
         * Explicación:
         * Al ser ambos operandos int, la división es entera y descarta los decimales.
         * Por eso el resultado es 2 (no 2.5).
         */
    }
}
}
