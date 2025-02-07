import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.unir.javabeans.Suma_JonLandaluce;

import static org.junit.jupiter.api.Assertions.*;

public class TestsSumaCalculadora {

    private Suma_JonLandaluce suma;

    @BeforeEach
    public void setUp() throws Exception {
        suma = new Suma_JonLandaluce();
    }

    @Test
    public void testSumaDosNumerosRealesConValoresPositivos() {
        try {
            double resultado = suma.sumaDosNumerosReales(3.5, 2.7);
            assertEquals(6.2, resultado, 0.0001);
        } catch (IllegalArgumentException e) {
            System.out.println("No debería lanzar una excepción con números positivos.");
        }
    }

    @Test
    public void testSumaDosNumerosRealesConNumerosNegativos() {
        try {
            suma.sumaDosNumerosReales(-1.0, -5.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Debe lanzar una excepción con números negativos.");
        }
    }

    @Test
    public void testSumaDosNumerosRealesConNulos() {
        try {
            suma.sumaDosNumerosReales(null, null);
        } catch (IllegalArgumentException e) {
            System.out.println("Debe lanzar una excepción con valores nulos.");
        }
    }

    @Test
    public void testSumaDosNumerosEnterosConValoresPositivos() {
        try {
            double resultado = suma.sumaDosNumerosEnteros(13, 20);
            assertEquals(33, resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("No debería lanzar una excepción con números positivos.");
        }
    }

    @Test
    public void testSumaDosNumerosEnterosConNumerosNegativos() {
        try {
            suma.sumaDosNumerosEnteros(-5, -7);
        } catch (IllegalArgumentException e) {
            System.out.println("Debe lanzar una excepción con números negativos.");
        }
    }

    @Test
    public void testSumaDosNumerosEnterosConNulos() {
        try {
            suma.sumaDosNumerosEnteros(null, null);
        } catch (IllegalArgumentException e) {
            System.out.println("Debe lanzar una excepción con valores nulos.");
        }
    }

    @Test
    public void testSumaTresNumerosEnterosConValoresPositivos() {
        try {
            double resultado = suma.sumaTresNumerosReales(13.0, 20.1, 6.2);
            assertEquals(39.3, resultado, 0.0001);
        } catch (IllegalArgumentException e) {
            System.out.println("No debería lanzar una excepción con números positivos.");
        }
    }

    @Test
    public void testSumaTresNumerosEnterosConNumerosNegativos() {
        try {
            suma.sumaTresNumerosReales(-5.3, -7.1, -2.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Debe lanzar una excepción con números negativos.");
        }
    }

    @Test
    public void testSumaTresNumerosenterosConNulos() {
        try {
            suma.sumaTresNumerosReales(null, null, null);
        } catch (IllegalArgumentException e) {
            System.out.println("Debe lanzar una excepción con valores nulos.");
        }
    }

    @Test
    public void testSumaAcumuladorConPositivo() {
        try {
            double resultado = suma.sumaValorAcumulado(5.0);
            assertEquals(5.0, resultado, 0.0001);
        } catch (IllegalArgumentException e) {
            System.out.println("No debería lanzar una excepción con números positivos.");
        }
    }

    @Test
    public void testSumaAcumuladorConNegativo() {
        try {
            suma.sumaValorAcumulado(-8.3);
        } catch (IllegalArgumentException e) {
            System.out.println("Debe lanzar una excepción con números negativos.");
        }
    }

    @Test
    public void testSumaAcumuladorConNulo() {
        try {
            suma.sumaValorAcumulado(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Debe lanzar una excepción con valores nulos.");
        }
    }






}
