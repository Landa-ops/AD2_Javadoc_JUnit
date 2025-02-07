package org.unir.javabeans;

import java.util.Scanner;

/**
 * Clase Multiplicacion que proporciona métodos para realizar operaciones matemáticas
 * relacionadas con la multiplicación y la potenciación, contemplando excepciones.
 *
 * @author Arantza Alcázar
 * @version 1.0
 */
public class MultiplicacionArantzaAlcazar {

    public MultiplicacionArantzaAlcazar() {
    }

    /**
            * Método principal para probar la clase Multiplicacion con entrada de usuario.
 */
    public void menuMultiplicacion() {
        Scanner scanner = new Scanner(System.in);
        MultiplicacionArantzaAlcazar calc = new MultiplicacionArantzaAlcazar();
        boolean salir = false;
        int opcion = 0;

        /**
         * Bucle para el que usuario pueda elegir una de las operaciones
         */
        while (!salir) {
            //Menu para que el usuario elija una opción
            System.out.println("Elige una de las opciones para operar : ");
            System.out.println("1. Multiplicación de dos números reales");
            System.out.println("2. Multiplicación de dos números enteros");
            System.out.println("3. Multiplicación de tres números reales");
            System.out.println("4. Potencia de un número real");
            System.out.println("5. Salir de la calculadora");
            opcion = scanner.nextInt();
            scanner.nextLine();

/**
 * Switch para que se ejecute la opción elegida. Cuando quiera terminar
 * las operaciones, existe la opción de salir para terminar.
 */
            switch (opcion) {
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
                    break;

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
                    break;

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
                    break;
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
                    break;
                case 5:
                    salir = true;
                    System.out.println("Espero haber servido de ayuda. Gracias");
                    break;
                default:
                    System.out.println("Esta opción no existe");
                    break;
            }

        }
    }


    /**
     * Método para multiplicar dos números reales.
     *
     * @param num1 Primer número real a multiplicar.
     * @param num2 Segundo número real a multiplicar.
     * @return El resultado de la multiplicación de num1 y num2.
     * @throws IllegalArgumentException si alguno de los valores es negativo.
     */
    public double multiDosReales(double num1, double num2) {

        if (num1 < 0 || num2 < 0) {
            throw new IllegalArgumentException("Los números no pueden ser negativos");
        }
        return num1 * num2;
    }

    /**
     * Método para multiplicar dos números enteros.
     *
     * @param num4 Primer número entero a multiplicar.
     * @param num5 Segundo número entero a multiplicar.
     * @return El resultado de la multiplicación de num1 y num2.
     * @throws ArithmeticException si alguno de los números es negativo.
     */
    public double multiDosEnteros(int num4, int num5) {

        if (num4 < 0 || num5 < 0) {
            throw new IllegalArgumentException("Los números no pueden ser negativos");
        }
        return num4 * num5;
    }

    /**
     * Método para multiplicar tres números reales.
     *
     * @param num1 Primer número real a multiplicar.
     * @param num2 Segundo número real a multiplicar.
     * @param num3 Tercer número real a multiplicar.
     * @return El resultado de la multiplicación de num1, num2 y num3.
     * @throws IllegalArgumentException si alguno de los valores es negativo.
     */
    public double multiTresReales(double num1, double num2, double num3) {

        if (num1 < 0 || num2 < 0 || num3 < 0) {
            throw new IllegalArgumentException("Los números no pueden ser negativos");
        }
        return num1 * num2 * num3;
    }

    /**
     * Método para calcular la potencia de un número.
     *
     * @param base      La base de la potencia.
     * @param exponente El exponente al que se elevará la base.
     * @return El resultado de elevar la base al exponente.
     * @throws IllegalArgumentException si la base y el exponente son negativos.
     */
    public double potencia(double base, int exponente) {
        if (base < 0 && exponente < 0) {
            throw new IllegalArgumentException("No se puede calcular la potencia de una base negativa con exponente negativo");
        }
        return Math.pow(base, exponente);
    }

}

