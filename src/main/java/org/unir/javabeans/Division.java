package org.unir.javabeans;

/**
 * Clase que implementa operaciones relacionadas con la división
 *
 * @author César A. Alcázar
 * @version alfa 0.1
 */

public class Division {

    /**
     * Realizamos la división de dos números reales.
     *
     * @param num1 Este es el dividendo de un número real.
     * @param num2 Este es el divisor de un número real.
     * @return Mostramos el resultado de la división de números reales, o NaN si el divisor es cero.
     */

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

