import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.unir.javabeans.MultiplicacionArantzaAlcazar;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Clase de pruebas unitarias para la clase Multiplicacion.
 * Se utilizan pruebas con JUnit para validar el correcto funcionamiento de los métodos.
 */
class TestMultiplicacionArantzaAlcazar {

    MultiplicacionArantzaAlcazar calc = new MultiplicacionArantzaAlcazar();

    @BeforeEach
    void SetUp(){
        calc = new MultiplicacionArantzaAlcazar();
    }

    @Test
    void testMultiDosReales() {
        assertEquals(6.0, calc.multiDosReales(2.0, 3.0), 0.001);
        assertEquals(0.0, calc.multiDosReales(0.0, 5.0), 0.001);
        assertThrows(IllegalArgumentException.class, () -> calc.multiDosReales(-1.0, 2.0));
    }

    @Test
    void testMultiDosEnteros() {
        assertEquals(15, calc.multiDosEnteros(3, 5));
        assertEquals(0, calc.multiDosEnteros(0, 10));
        assertThrows(IllegalArgumentException.class, () -> calc.multiDosEnteros(-3, 2));
    }

    @Test
    void testMultiTresReales() {
        assertEquals(24.0, calc.multiTresReales(2.0, 3.0, 4.0), 0.001);
        assertEquals(0.0, calc.multiTresReales(0.0, 2.0, 5.0), 0.001);
        assertThrows(IllegalArgumentException.class, () -> calc.multiTresReales(2.0, -3.0, 4.0));
    }

    @Test
    void testPotencia() {
        assertEquals(8.0, calc.potencia(2.0, 3), 0.001);
        assertEquals(1.0, calc.potencia(5.0, 0), 0.001);
        assertThrows(IllegalArgumentException.class, () -> calc.potencia(-2.0, -3));
    }
}
