package org.unir.javabeans;

import java.util.Scanner;

/**
 * Clase que implementa operaciones relacionadas con la división
 *
 * @author César A. Alcázar
 * @version alfa 0.1
 */

public class DivisionCesarAAlcazarRomero {

    /**
     * Realizamos la división de dos números reales.
     *
     * @param num1 Este es el dividendo de un número real.
     * @param num2 Este es el divisor de un número real.
     * @return Mostramos el resultado de la división de números reales, o NaN si el divisor es cero.
     */

    public void menuDivision() {
        DivisionCesarAAlcazarRomero division = new DivisionCesarAAlcazarRomero();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        /**
         Creamos un bucle del menú para poder hacer todas las operaciones que
         deseemos hasta seleccionar la opción "Salir"
         */


        while (!salir) {
            // Menú para que el usuario elija la operación
            System.out.println("\n**************************************");
            System.out.println("*   Vamos a operar con números   *");
            System.out.println("**************************************");
            System.out.println("1.- División de dos números reales");
            System.out.println("2.- División de dos números enteros");
            System.out.println("3.- Inverso de un número real");
            System.out.println("4.- Raíz cuadrada de un número");
            System.out.println("5.- Salir");
            System.out.print("Seleccione la opción deseada: ");
            int opcion = scanner.nextInt();

            /**
             * Creamos un switch después del menú para tratar cada
             * operación de manera individualizada
             */

            /**
             * En la opción 1 pedimos y operamos con números reales
             */

            switch (opcion) {
                case 1:
                    System.out.print("Es usted tan amable de darme el primer número real: ");
                    double num1Real = scanner.nextDouble();
                    System.out.print("Me podría dar un segundo número real: ");
                    double num2Real = scanner.nextDouble();
                    double resultadoReal = division.divisionReales(num1Real, num2Real);
                    if (!Double.isNaN(resultadoReal)) {
                        System.out.println("\n##########################");
                        System.out.println("El resultado de la operación es: " + resultadoReal);
                        System.out.println("##########################");
                    }
                    break;

                /**
                 * En la opción 2 pedimos y operamos con números enteros
                 */

                case 2:
                    System.out.print("Es usted tan amable de darme el primer número entero: ");
                    int num1Entero = solicitarEntero(scanner);
                    System.out.print("Es usted tan amable de darme el segundo número entero: ");
                    int num2Entero = solicitarEntero(scanner);
                    double resultadoEntero = division.divisionEnteros(num1Entero, num2Entero);
                    if (!Double.isNaN(resultadoEntero)) {
                        System.out.println("\n##########################");
                        System.out.println("El resultado de la operación es: " + resultadoEntero);
                        System.out.println("##########################");
                    }
                    break;

                /**
                 * En la opción 3 pedimos un número y calculamos el número inverso de ese número
                 */

                case 3:
                    System.out.print("Ingrese un número real para calcular su inverso: ");
                    double numInverso = scanner.nextDouble();
                    double resultadoInverso = division.inversoReal(numInverso);
                    if (!Double.isNaN(resultadoInverso)) {
                        System.out.println("\n##########################");
                        System.out.println("El resultado de la operación es: " + resultadoInverso);
                        System.out.println("##########################");
                    }
                    break;

                /**
                 * En la opción 4 pedimos un número y calculamos la raíz cuadrada de ese número
                 */

                case 4:
                    System.out.print("Ingrese un número para calcular su raíz cuadrada: ");
                    double numRaiz = scanner.nextDouble();
                    double resultadoRaiz = division.raiz(numRaiz);
                    if (!Double.isNaN(resultadoRaiz)) {
                        System.out.println("\n##########################");
                        System.out.println("El resultado de la operación es: " + resultadoRaiz);
                        System.out.println("##########################");

                    }
                    break;

                /**
                 En la opción 5 salimos del menú si es true y mostramos mensaje de despedida
                 */

                case 5:
                    salir = true;
                    System.out.println("\n#################################");
                    System.out.println("Esto es todo, muchas gracias por colaborar...");
                    System.out.println("#################################");
                    break;

                /**
                 * En esta opción contemplamos la introducción de una opción
                 * no contemplada y mostramos un mensaje de aviso
                 */

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        }
    }

    /**
     * Pedimos un número entero, evitando la entrada de números no válidos.
     *
     * @param scanner Para leer la entrada del usuario.
     * @return El número entero introducido.
     */

    private static int solicitarEntero(Scanner scanner) {
        while (true) {

            if (scanner.hasNextInt()) {
                return scanner.nextInt(); // Retorna el número entero ingresado
            } else {
                System.out.println("Error: Debe ingresar un número entero. Intente de nuevo.");
                scanner.next(); // Limpia la entrada inválida
            }
        }
    }
    public double divisionReales(double num1, double num2) {
        if (num2 == 0 ) {
            System.out.println("#################################");
            System.out.println("#  Lo siento, No se puede dividir entre cero.  #");
            System.out.println("#################################");
            return Double.NaN;
        }
        return num1 / num2;
    }

    /**
     * Realiza la división de dos números enteros.
     *
     * @param num1 Este es el dividendo de un número entero).
     * @param num2 Este es el divisor de un número entero).
     * @return Convertimos el número a double y mostramos el resultado de la división
     * de números enteros, o NaN si el divisor es cero.
     */

    public double divisionEnteros(int num1, int num2) {
        if (num2 == 0 ) {
            System.out.println("#################################");
            System.out.println("#  Lo siento, no se puede dividir entre cero.  #");
            System.out.println("#################################");
            return Double.NaN;
        }
        return (double) num1 / num2;
    }

    /**
     * Realiza el cálculo del inverso de un número real.
     *
     * @param num Este es el número real del cual calcularemos el inverso.
     * @return Mostramos el inverso del número real, o NaN si el número es cero.
     */

    public double inversoReal(double num) {
        if (num == 0) {
            System.out.println("########################################");
            System.out.println("#  Lo siento, no se puede calcular el inverso de cero.  #");
            System.out.println("########################################");
            return Double.NaN;
        }
        return 1 / num;
    }

    /**
     * Realiza el cálculo de la raíz cuadrada de un número.
     *
     * @param num Este es el número del cual se calculará la raíz cuadrada.
     * @return Mostramos la raíz cuadrada del número real introducido, o NaN si el número es negativo.
     */

    public double raiz(double num) {
        if (num < 0) {
            System.out.println("#################################################");
            System.out.println("#  Lo siento, no se puede calcular la raíz de un número negativo.  #");
            System.out.println("#################################################");
            return Double.NaN;
        }
        return Math.sqrt(num);
    }


}

