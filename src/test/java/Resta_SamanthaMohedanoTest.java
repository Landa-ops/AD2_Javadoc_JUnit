import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.unir.javabeans.Resta_SamanthaMohedano;

import static org.junit.jupiter.api.Assertions.*;

class Resta_SamanthaMohedanoTest {

    private Resta_SamanthaMohedano resta;

    @BeforeEach
    void setUp() {
        resta = new Resta_SamanthaMohedano();
    }


    // Test para la resta de dos números reales
    @Test
    void restaDosReales() {
        Double a = 10.5;
        Double b = 5.5;
        double expected = 5.0;

        double result = resta.restaDosReales(a,b);

        assertEquals(expected, result, "La resta de los dos números reales no es correcta");
    }


    // Test para valores nulos - Dos Reales (esperamos que se lance IllegalArgumentException)
    @Test
    void testRestaDosRealesNull() {
        Double a = null;
        Double b = 3.7;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            resta.restaDosReales(a, b);
        });

        assertEquals("El valor de los números no puede ser null", exception.getMessage());
    }



    // Test para la resta de dos números enteros
    @Test
    void restaDosEnteros() {
        Integer a = 9;
        Integer b = 3;
        int expected = 6;

        int result = resta.restaDosEnteros(a, b);

        assertEquals(expected, result, "La resta de los dos números enteros no es correcta");
    }



    // Test para valores nulos - Dos Enteros (esperamos que se lance IllegalArgumentException)
    @Test
    void testRestaDosEnterosNull() {
        Integer a = 8;
        Integer b = null;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            resta.restaDosEnteros(a, b);
        });

        assertEquals("El valor de los números no puede ser null", exception.getMessage());
    }


    // Test para la resta de tres números reales
    @Test
    void restaTresReales() {
        Double a = 10.5;
        Double b = 5.5;
        Double c = 2.5;
        double expected = 2.5;

        double result = resta.restaTresReales(a, b, c);

        assertEquals(expected, result, "La resta de tres números reales no es correcta");
    }


    // Test para valores nulos - Tres Reales (esperamos que se lance IllegalArgumentException)
    @Test
    void testRestaTresRealesNull() {
        Double a = 2.5;
        Double b = null;
        Double c = 3.7;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            resta.restaTresReales(a, b, c);
        });

        assertEquals("El valor de los números no puede ser null", exception.getMessage());
    }



    // Test para la resta con valor acumulado
    @Test
    void restaValorAcumulado() {
        Double num = 5.0;
        double expected = -5.0;
        double result = resta.restaValorAcumulado(5.0);

        assertEquals(expected, result, "La resta con valor acumulado no es correcta");
    }

    // Test para valores nulos - Valor Acumulado (esperamos que se lance IllegalArgumentException)
    @Test
    void testRestaValorAcumuladoNull() {
        Double num = null;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            resta.restaValorAcumulado(num);
        });

        assertEquals("El valor de los números no puede ser null", exception.getMessage());
    }


    // Test para el valor cero - Valor Acumulado (esperamos que se lance IllegalArgumentException)
    @Test
    void testRestaValorAcumuladoCero() {
        Double num = 0.0;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            resta.restaValorAcumulado(num);
        });

        assertEquals("El valor de los números no puede ser 0", exception.getMessage());
    }
}