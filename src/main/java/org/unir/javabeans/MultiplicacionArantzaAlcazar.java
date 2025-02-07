package org.unir.javabeans;

/**
 * Clase Multiplicacion que proporciona métodos para realizar operaciones matemáticas
 * relacionadas con la multiplicación y la potenciación, contemplando excepciones.
 *
 * @author Arantza Alcázar
 * @version 1.0
 */
public class MultiplicacionArantzaAlcazar {

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
     * @param base La base de la potencia.
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
