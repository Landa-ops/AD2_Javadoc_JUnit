package org.unir.javabeans;
import java.util.Objects;
import java.util.Scanner;

public class Suma_JonLandaluce {

    /**
     * Clase que hace operaciones de suma en una calculadora.
     *
     * <p>
     * Ejemplo de uso:
     * </p>
     *
     * <pre>{@code
     * Suma suma = new Suma();
     * suma.sumaDosNumerosReales(1.3, 3.4);
     * }</pre>
     *
     * @author Jon Landaluce
     * @version 0.1
     */

    private Double num1;
    private Double num2;
    private Double num3;
    private Integer num4;
    private Integer num5;
    private static Double acumulator = 0.0;

    public Suma_JonLandaluce() {
        super();
    }

    public Suma_JonLandaluce(Double num1, Double num2, Double num3, Integer num4, Integer num5) {
        super();
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Double getNum3() {
        return num3;
    }

    public void setNum3(Double num3) {
        this.num3 = num3;
    }

    public Integer getNum4() {
        return num4;
    }

    public void setNum4(Integer num4) {
        this.num4 = num4;
    }

    public Integer getNum5() {
        return num5;
    }

    public void setNum5(Integer num5) {
        this.num5 = num5;
    }

    public static Double getAcumulator() {
        return acumulator;
    }

    public static void setAcumulator(Double acumulator) {
        Suma_JonLandaluce.acumulator = acumulator;
    }

    @Override
    public String toString() {
        return "Suma [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4 + ", num5=" + num5 + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(num1, num2, num3, num4, num5);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Suma_JonLandaluce other = (Suma_JonLandaluce) obj;
        return Objects.equals(num1, other.num1) && Objects.equals(num2, other.num2) && Objects.equals(num3, other.num3)
                && Objects.equals(num4, other.num4) && Objects.equals(num5, other.num5);
    }


    /**
     * Muestra un menú para elegir qué operación de resta realizar.
     */
    public void menuSuma() {

        Validate valida = new Validate();

        Scanner sc = new Scanner(System.in);
        boolean salida = false;
        int opcion = 0;
        do{
            System.out.println("Selecciona una opción");
            System.out.println("1.Suma dos reales");
            System.out.println("2.Suma dos enteros");
            System.out.println("3.Suma tres reales");
            System.out.println("4.Suma acumulada");
            System.out.println("5.Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println( "La suma de tus dos números reales es : " +
                            sumaDosNumerosReales(valida.validateIsDouble(), valida.validateIsDouble()));
                    break;
                case 2:
                    System.out.println( "La suma de tus dos números enteros es : " +
                            sumaDosNumerosEnteros(valida.validateIsInteger(), valida.validateIsInteger()));
                    break;
                case 3:
                    System.out.println( "La suma de tus tres números reales es : " +
                            sumaTresNumerosReales(valida.validateIsDouble(), valida.validateIsDouble(),
                                    valida.validateIsDouble()));
                    break;
                case 4:
                    System.out.println( "El valor acumulado después de la resta es : " +
                            sumaValorAcumulado(valida.validateIsDouble()));
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


    /*
     * Suma dos números reales.
     *
     * Este metodo realiza la suma de dos números reales, pero imprime un mensaje de
     * error si alguno de los números es menor o igual a cero.
     *
     * @param num1 El primer número real a sumar.
     *
     * @param num2 El segundo número real a sumar.
     *
     * @return La suma de los dos números reales.
     */
    public double sumaDosNumerosReales(Double num1, Double num2) {

        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Los números no pueden ser nulos");
        }

        if (num1 <= 0 || num2 <= 0) {
            throw new IllegalArgumentException("Los números no pueden ser negativos");
        }

        return num1 + num2;
    }

    /**
     * Suma dos números enteros.
     *
     * Este metodo realiza la suma de dos números enteros, pero imprime un mensaje
     * de error si alguno de los números es menor o igual a cero.
     *
     * @param num3 El primer número entero a sumar.
     *
     * @param num4 El segundo número entero a sumar.
     *
     * @return La suma de los dos números enteros.
     */
    public Integer sumaDosNumerosEnteros(Integer num3, Integer num4) {

        if (num3 == null || num4 == null) {
            throw new IllegalArgumentException("Los números no pueden ser nulos");
        }

        if (num3 <= 0 || num4 <= 0) {
            throw new IllegalArgumentException("Los números no pueden ser negativos");
        }

        return num3 + num4;
    }

    /**
     * Suma tres números reales.
     *
     * Este metodo realiza la suma acumulativa de tres números reales, pero imprime
     * un mensaje de error si alguno de los números es menor o igual a cero.
     *
     * @param num1 El primer número real a sumar.
     *
     * @param num2 El segundo número real a sumar.
     *
     * @param num3 El tercer número real a sumar.
     *
     * @return La suma de los tres números reales.
     */
    public double sumaTresNumerosReales(Double num1, Double num2, Double num3) {

        if (num1 == null || num2 == null || num3 == null) {
            throw new IllegalArgumentException("Los números no pueden ser nulos");
        }

        if (num1 <= 0 || num2 <= 0 || num3 <= 0) {
            throw new IllegalArgumentException("Los números no pueden ser negativos");
        }

        return num1 + num2 + num3;
    }

    public double sumaValorAcumulado(Double num1) {

        if (num1 == null) {
            throw new IllegalArgumentException("Los números no pueden ser nulos");
        }

        if (num1 <= 0) {
            throw new IllegalArgumentException("Los números no pueden ser negativos");
        }

        acumulator += num1;

        return acumulator;
    }


}
