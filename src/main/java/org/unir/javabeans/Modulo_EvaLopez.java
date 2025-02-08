package org.unir.javabeans;

import java.util.Scanner;

public class Modulo_EvaLopez {

    /**
     *
     * Clase que realiza cálculo de módulos dentro
     * de una calculadora. Módulo es el resto de una división.
     *
     * @author Eva López
     * @version 0.1
     */

    /**
     * Metodo inherente a la clase
     */
    public Modulo_EvaLopez() {
    }

    /**
     * Metodo para el menú de módulo. Switch con 3 opciones:
     * 1. calcularModulo
     * 2. calcularValorAbsoluto
     */
    Scanner leer = new Scanner(System.in);
    public void menuModulo(){
        int opcion = 1;
        do{
            System.out.println("Selecciona: ");
            System.out.println("1. Modulo");
            System.out.println("2. Valor absoluto");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    calcularModulo();
                    break;
                case 2:
                    calcularValorAbsoluto();
                    break;
            }
        } while(
            opcion != 1 && opcion != 2);

        System.out.println("Opción incorrecta. Seleccione 1 o 2.");
    }


    /**
     * Metodo para calcular el módulo
     * Entrada: int a, int b
     * Salida: int (el residuo de la división de a entre b)
     * Fórmula:
     * Residuo: M = a % b
     */
    public int calcularModulo() {
        System.out.println("Inserta el dividendo: ");
        int dividendo = leer.nextInt();
        System.out.println("Inserta el divisor: ");
        int divisor = leer.nextInt();
        return dividendo % divisor;
    }

    /**
     * Metodo para calcular el valor absoluto de un número
     * Entrada: double a
     * Salida: double (el valor absoluto de a)
     * Fórmula:
     * Si a ≥ 0, entonces |a| = a
     * Si a < 0, entonces |a| = -a
     */
    public double calcularValorAbsoluto() {
        System.out.println("Inserta el valor: ");
        double a = leer.nextDouble();
        if (a >= 0) {
            return a;
        } else {
            return -a;
        }
    }
}
