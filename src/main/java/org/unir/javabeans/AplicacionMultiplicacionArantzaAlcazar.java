import org.unir.javabeans.MultiplicacionArantzaAlcazar;

import java.util.Scanner;

/**
 * Método principal para probar la clase Multiplicacion con entrada de usuario.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    MultiplicacionArantzaAlcazar calc = new MultiplicacionArantzaAlcazar();
    boolean salir = false;
    int opcion = 0;

    /**
     * Bucle para el que usuario pueda elegir una de las operaciones
     */
    while (!salir){
        //Menu para que el usuario elija una opción
        System.out.println("Elige una de las opciones para operar : ");
        System.out.println("1. Multiplicación de dos números reales");
        System.out.println("2. Multiplicación de dos números enteros");
        System.out.println("3. Multiplicación de tres números reales");
        System.out.println("4. Potencia de un número real");
        System.out.println("5. Salir de la calculadora");
    }

/**
 * Switch para que se ejecute la opción elegida. Cuando quiera terminar
 * las operaciones, existe la opción de salir para terminar.
 */
 switch(opcion){
    case 1:
        // Solicitar datos para el producto de dos números reales
        System.out.print("Introduce el primer número real: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: Debes introducir un número real.");
            scanner.next(); // Limpiar el valor incorrecto
            System.out.print("Introduce el primer número real: ");
        }
        double real1 = scanner.nextDouble();

       System.out.print("Introduce el segundo número real: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: Debes introducir un número real.");
            scanner.next(); // Limpiar el valor incorrecto
            System.out.print("Introduce el segundo número real: ");
        }
        double real2 = scanner.nextDouble();

        // Calcular y mostrar el producto de dos números reales
        System.out.println("Producto de dos reales: " + calc.multiDosReales(real1, real2));

    case 2:
        // Solicitar datos para el producto de dos números enteros
        System.out.print("Introduce el primer número entero: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debes introducir un número entero.");
            scanner.next(); // Limpiar el valor incorrecto
            System.out.print("Introduce el primer número entero: ");
        }
        int entero1 = scanner.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debes introducir un número entero.");
            scanner.next(); // Limpiar el valor incorrecto
            System.out.print("Introduce el segundo número entero: ");
        }
        int entero2 = scanner.nextInt();

        // Calcular y mostrar el producto de dos números enteros
        System.out.println("Producto de dos enteros: " + calc.multiDosEnteros(entero1, entero2));

    case 3:
        // Solicitar datos para el producto de dos números reales
        System.out.print("Introduce el primer número real: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: Debes introducir un número real.");
            scanner.next(); // Limpiar el valor incorrecto
            System.out.print("Introduce el primer número real: ");
        }
        double real3 = scanner.nextDouble();

        System.out.print("Introduce el segundo número real: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: Debes introducir un número real.");
            scanner.next(); // Limpiar el valor incorrecto
            System.out.print("Introduce el segundo número real: ");
        }
        double real4 = scanner.nextDouble();

        // Solicitar datos para el producto de tres números reales
        System.out.print("Introduce el tercer número real: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: Debes introducir un número real.");
            scanner.next(); // Limpiar el valor incorrecto
            System.out.print("Introduce el tercer número real: ");
        }
        double real5 = scanner.nextDouble();

        // Calcular y mostrar el producto de tres números reales
        System.out.println("Producto de tres reales: " + calc.multiTresReales(real3, real4, real5));

    case 4:
        // Solicitar datos para la potencia
        System.out.print("Introduce la base (número real): ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: Debes introducir un número real.");
            scanner.next(); // Limpiar el valor incorrecto
            System.out.print("Introduce la base (número real): ");
        }
        double base = scanner.nextDouble();

        System.out.print("Introduce el exponente (número entero): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debes introducir un número entero.");
            scanner.next(); // Limpiar el valor incorrecto
            System.out.print("Introduce el exponente (número entero): ");
        }
        int exponente = scanner.nextInt();

        // Calcular y mostrar la potencia
        System.out.println("Potencia: " + calc.potencia(base, exponente));

    case 5:
        salir = true;
        System.out.println("Espero haber servido de ayuda. Gracias");
    default:
        System.out.println("Esta opción no existe");
        break;
}
     // Cerrar el scanner
    scanner.close();
}
