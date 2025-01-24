package org.unir.javabeans;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Suma suma = new Suma();
        Scanner sc = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("========= MENU ==========");
            System.out.println("1. Suma Dos Numeros Reales ");
            System.out.println("2. Suma Dos Numeros Enteros ");
            System.out.println("3. Suma Tres Numeros Reales ");
            System.out.println("4. Suma Con Valor Acumulado");
            System.out.println("5. Exit");
            System.out.println("---------------------------------------");
            System.out.println("+++ Seleccione que quiere sumar +++");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();

                if (opcion == 5) {
                    System.out.println("Saliendo del programa. Hasta luego!");
                    break;
                }

                switch (opcion) {
                    case 1:
                        System.out.println("Suma de dos numeros reales: " + suma.sumaDosNumerosReales(suma.validateIsDouble(), suma.validateIsDouble()));
                        break;
                    case 2:
                        System.out.println("Suma de dos numeros enteros: " + suma.sumaDosNumerosEnteros(suma.validateIsInteger(), suma.validateIsInteger()));
                        break;
                    case 3:
                        System.out.println("Suma de tres numeros reales: " + suma.sumaTresNumerosReales(suma.validateIsDouble(), suma.validateIsDouble(), suma.validateIsDouble()));
                        break;
                    case 4:
                        System.out.println("Sumatorio acumulativo numeros reales o enteros: " + suma.sumaValorAcumulado(suma.validateIsDouble()));
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, introduce un número entre 1 y 5.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, introduce un número entre 1 y 5.");
                sc.next();
            }
        }

        sc.close();
    }
}