package org.unir.javabeans;

import java.util.Scanner;

public class Validate {

    public Double validateIsDouble() {
        Scanner sc = new Scanner(System.in);
        Double num = null;
        boolean valido = false;

        while (!valido) {
            System.out.print("Introduzca un numero real: ");
            if (sc.hasNextDouble()) {
                num = sc.nextDouble();
                valido = true;
            } else {
                System.out.println("Entrada invalida, introduzca un numero real: ");
                sc.next();
            }
        }
        return num;
    }

    public Integer validateIsInteger() {
        Scanner sc = new Scanner(System.in);
        Integer num = null;
        boolean valido = false;

        while (!valido) {
            System.out.print("Introduzca un numero entero: ");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                valido = true;
            } else {
                System.out.println("Entrada invalida, introduzca un numero entero: ");
                sc.next();
            }
        }
        return num;
    }

}
