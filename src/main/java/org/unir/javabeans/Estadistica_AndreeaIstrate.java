package org.unir.javabeans;

import java.util.Scanner;

/**
 * Clase que proporciona métodos para calcular medidas estadísticas como la media,
 * la varianza y la desviación estándar a partir de una lista de números.
 *
 * <p>Ejemplo de uso:</p>
 * <pre>{@code
 * Estadistica estadistica = new Estadistica();
 * suma.sumaDosNumerosReales(1.3, 3.4);
 * }</pre>
 * @author Andreea Istrate
 * @version 0.1
 */
public class Estadistica_AndreeaIstrate {
    public Estadistica_AndreeaIstrate() {
    }

    /**
     * Muestra un menú para elegir qué opción de estadística realizar
     */
    public void menuEstadistica() {
        Scanner sc = new Scanner(System.in);
        boolean salida = false;
        int opcion= 0;
        do {
            System.out.println(" Selecciona una opción");
            System.out.println("1. Media Aritmética");
            System.out.println("2. Varianza");
            System.out.println("3. Desviación Estandar");
            System.out.println("4. Salir");

            opcion = sc.nextInt();
            sc.nextLine();
            double[] vector = ingresarDatos(sc);
            switch (opcion) {
                case 1:

                    System.out.println("La media aritmetica es: " + mediaAritmetica(vector));
                    break;
                case 2:

                    System.out.println("La varianza es: " + varianza( vector));
                    break;
                case 3:
                    System.out.println("La desviación estándar es: " + desviacionEstandar(vector));
                    break;
                case 4:
                    System.out.println("Salir");
                    salida = true;
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }while(!salida);
    }

    /**
     * Calcula la media aritmética de una lista de números.
     *
     * @param sc un conjunto de valores numéricos (double)
     * @return la media aritmética de los valores
     * @throws IllegalArgumentException
     */
    public double[] ingresarDatos(Scanner sc) {
        System.out.println("Ingrese la cantidad de números:");
        int n = sc.nextInt();
        if (n <= 0) {
            throw new IllegalArgumentException("Debe ingresar al menos un número.");
        }

        double[] vector = new double[n];
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            vector[i] = sc.nextDouble();
        }
        return vector;
    }

    public double mediaAritmetica(double[] vector) {
        if(vector.length == 0){
            throw new IllegalArgumentException("No se puede calcular la media aritmetica");
        }
        double suma = 0.0;
        for (double v : vector) {
            suma += v;
        }
        return suma / vector.length;
    }

    /**
     * Calcula la varianza de una lista de números.
     *
     * @param vector un conjunto de valores numéricos (double)
     * @return la varianza de los valores
     * @throws IllegalArgumentException
     */
    public double varianza(double[] vector) {
        if(vector.length == 0){
            throw new IllegalArgumentException("No se puede calcular la varianza");
        }
        double varianza = 0.0;
        double media = mediaAritmetica(vector);
        double suma = 0.0;
        for (double v : vector) {
            suma += Math.pow(v - media, 2);
        }
        return suma / vector.length;
    }

    /**
     * Calcula la desviación estándar de una lista de números.
     *
     * @param vector un arreglo de valores numéricos (double)
     * @return la desviación estándar de los valores
     * @throws IllegalArgumentException
     */
    public double desviacionEstandar(double[] vector) {
        return Math.sqrt(varianza(vector));
    }

}


