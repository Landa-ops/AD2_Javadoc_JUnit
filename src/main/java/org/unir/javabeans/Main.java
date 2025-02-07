package org.unir.javabeans;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salida = false;
        int opcion = 0;

        do {
            System.out.println("Selecciona una opción");
            System.out.println("========= MENU ==========");
            System.out.println("1.SUMA");
            System.out.println("2.RESTA");
            System.out.println("3.PRODUCTO");
            System.out.println("4.COCIENTE");
            System.out.println("5.MODULO");
            System.out.println("6.ESTADISTICA");
            System.out.println("7.CONVERSION");
            System.out.println("8.      ");
            System.out.println("9.SALIR");
            System.out.println("=========================");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:


                case 2:
                    Resta_SamanthaMohedano resta= new Resta_SamanthaMohedano();
                    resta.menuResta();
                    break;
                case 3:

                case 4:

                case 5:
                    Modulo_EvaLopez modulo = new Modulo_EvaLopez();
                    modulo.menuModulo();
                    break;
                case 6:

                case 7:

                case 8:

                case 9:
                    System.out.println("¡Adiós!");
                    salida = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, introduce un número entre 1 y 9.");
            }
        }while(!salida);

        sc.close();
    }
}