package AD2_Javadoc_JUnit.src.main.java.org.unir.javabeans;

import java.util.Scanner;

/*
    Clase que permite realizar conversiones de Celsius a Fahrenheit y grados a radianes, o viceversa de ambos casos

    @autor Beatriz Toledano Villar
    @version 1.0
 */

public class ConversionUnidades_BeatrizToledano {
    // Introducimos las variables privadas de los objetos con los que vamos a trabajar para la conversión de unidades
    private double celsius;
    private double fahrenheit;
    private double grados;
    private double radianes;


    // Añadimos el constructor con nada
    public ConversionUnidades_BeatrizToledano() {
        super();
    }

    // Añadimos el toString (Override)
    @Override
    public String toString() {
        return "ConversionUnidades_BeatrizToledano{" +
                "celsius=" + celsius +
                ", fahrenheit=" + fahrenheit +
                ", grados=" + grados +
                ", radianes=" + radianes +
                '}';
    }

    // Metodo de conversion de celsius a fahrenheit
    public double celsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Metodo de conversion de fahrenheit a celsius
    public double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    //Metodo de conversion de grados a radianes
    public double gradosARadianes(double grados) {
        return grados * Math.PI / 180;
    }

    //Metodo de conversion de radianes a grados
    public double radianesAGrados(double radianes) {
        return radianes * 180 / Math.PI;
    }

    /*
        Este es el menu que da opcion al usuario para elegir la operacion de conversion a realizar y una vez
        escogida la opcion, el usuario puede insertar los numeros que quiera para convertir.
     */

    public void menuConversion(){
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0;
        /*
        Realizamos un do-while para crear un bucle en que el usuario pueda volver al menu cada vez que realiza una operacion
         */
        do{
            System.out.println("Indica un valor del 1 al 4, en base a la conversión que quieres realizar. Marca 5 para salir.");
            System.out.println("1 - De Celsius a Fahrenheit");
            System.out.println("2 - De Fahrenheit a Celsius");
            System.out.println("3 - De grados a radianes");
            System.out.println("4 - De radianes a grados");
            System.out.println("5 - Salir");

            /* Esta es una excepcion creada para cuando el usuario registra un valor que no sea numerico, tanto en el
            menu como en cada operacion, ya que estos valores siempre deben ser numericos
            */
            try{
                opcion = entrada.nextInt();
            } catch (Exception e){
                System.out.println("ERROR: " + e);
                salir=true;
            }


            switch (opcion) {
                case 1:
                    System.out.println("Dame un numero");
                    double num1 = entrada.nextDouble();
                    System.out.println(celsiusAFahrenheit(num1) + "º Fahrenheit");
                    break;
                case 2:
                    System.out.println("Dame un numero");
                    double num2 = entrada.nextDouble();
                    System.out.println(fahrenheitACelsius(num2) + "º Celsius");
                    break;
                case 3:
                    System.out.println("Dame un numero");
                    double num3 = entrada.nextDouble();
                    System.out.println(gradosARadianes(num3) + "radianes");
                    break;
                case 4:
                    System.out.println("Dame un numero");
                    double num4 = entrada.nextDouble();
                    System.out.println(radianesAGrados(num4) + "grados");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
        } while(!salir);
    }
}
