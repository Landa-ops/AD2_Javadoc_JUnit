package org.unir.javabeans;

import java.util.Scanner;

/**
 * Clase que realiza operaciones de resta para números reales y enteros.
 * Creación en la clase de un menu con diferentes opciones
 *
 * @author Samantha Mohedano Barrena
 *
 * @version 0.1
 */

public class Resta_SamanthaMohedano {

    private double acum= 0;

    public Resta_SamanthaMohedano() {super();}

    Validate valida = new Validate();

    /**
     * Muestra un menú para elegir qué operación de resta realizar.
     */

    public void menuResta() {
        Scanner sc = new Scanner(System.in);
        boolean salida = false;
        int opcion = 0;
        do{
            System.out.println("Selecciona una opción");
            System.out.println("1.Resta dos reales");
            System.out.println("2.Resta dos enteros");
            System.out.println("3.Resta tres reales");
            System.out.println("4.Resta acumulada");
            System.out.println("5. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println( "La resta de tus dos números reales es : " +
                            restaDosReales(valida.validateIsDouble(), valida.validateIsDouble()));
                    break;
                case 2:
                    System.out.println( "La resta de tus dos números enteros es : " +
                            restaDosEnteros(valida.validateIsInteger(), valida.validateIsInteger()));
                    break;
                case 3:
                    System.out.println( "La resta de tus tres números reales es : " +
                            restaTresReales(valida.validateIsDouble(), valida.validateIsDouble(),
                                    valida.validateIsDouble()));
                    break;
                case 4:
                    System.out.println( "El valor acumulado después de la resta es: " +
                            restaValorAcumulado(valida.validateIsDouble()));
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal");
                    salida = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        }while(!salida);


    }
    /**
     * Con este metodo se realiza la resta de dos números reales.
     * Muestra/lanza un mensaje si se introducen valores nulos.
     *
     * @param a El primer número real
     * @param b El segundo número real
     * @return El resultado de la resta
     * @throws IllegalArgumentException
     */

    public double restaDosReales(Double a, Double b) {
        if (a == null || b == null) {
            System.out.println("No se permiten valores nulos");
            throw new IllegalArgumentException("El valor de los números no puede ser null");
        }
        return a-b;
    }


    /**
     * Con este metodo se realiza la resta de dos números enteros.
     * Muestra/lanza un mensaje si se introducen valores nulos.
     *
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return El resultado de la resta.
     * @throws IllegalArgumentException
     */

    public int restaDosEnteros(Integer a, Integer b) {
        if (a == null || b == null) {
            System.out.println("No se permiten valores nulos");
            throw new IllegalArgumentException("El valor de los números no puede ser null");
        }
        return a-b;
    }


    /**
     * Con este metodo se realiza la resta de tres números reales.
     * Muestra/lanza un mensaje si se introducen valores nulos.
     *
     * @param a El primer número real.
     * @param b El segundo número real.
     * @param c El tercer número real.
     * @return El resultado de la resta.
     * @throws IllegalArgumentException
     */

    public double restaTresReales(Double a, Double b, Double c) {
        if (a == null || b == null || c == null) {
            System.out.println("No se permiten valores nulos");
            throw new IllegalArgumentException("El valor de los números no puede ser null");
        }
        return a-b-c;
    }

    /**
     * Con este metodo se realiza una resta con valor acumulado.
     * Muestra/lanza un mensaje si se introducen valores nulos o = 0
     *
     * @param num El número al restar del valor acumulado.
     * @return El valor acumulado después de la resta.
     * @throws IllegalArgumentException
     */

    public double restaValorAcumulado(Double num) {
        if (num == null) {
            System.out.println("No se permiten valores nulos");
            throw new IllegalArgumentException("El valor de los números no puede ser null");
        }

        if (num == 0) {
            System.out.println("No se permite un valor igual a 0");
            throw new IllegalArgumentException("El valor de los números no puede ser 0");
        }

        acum -= num;
        return acum;
    }

}
