import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.unir.javabeans.DivisionCesarAAlcazarRomero;
// Esto es una mierda
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDivision {

    private DivisionCesarAAlcazarRomero division;

    @BeforeEach
    void setUp() {division = new DivisionCesarAAlcazarRomero();}

    @Test
    void testDivisionReales() {
       assertEquals(4.5, division.divisionReales(9, 2), "Debe dar 4,5");
        System.out.println("Debe dar 4,5: " + division.divisionReales(9, 2));
        assertEquals(Double.NaN, division.divisionReales(5.0, 0.0), 0.0001);
    }

    @Test
    void testDivisionEnteros() {
        DivisionCesarAAlcazarRomero division = new DivisionCesarAAlcazarRomero();
        assertEquals(10, division.divisionEnteros(20, 2), 0.0001);
        System.out.println("Debe dar 10: " + division.divisionEnteros(20, 2));
        assertEquals(Double.NaN, division.divisionEnteros(5, 0), 0.0001);
    }

    @Test
    void testInversoReal() {
        DivisionCesarAAlcazarRomero division = new DivisionCesarAAlcazarRomero();
        assertEquals(0.25, division.inversoReal(4), 0.0001);
        System.out.println("Debe dar 0.25: " + division.inversoReal(4));
        assertEquals(Double.NaN, division.inversoReal(0), 0.0001);
    }

    @Test
    void testRaiz(){
        DivisionCesarAAlcazarRomero division = new DivisionCesarAAlcazarRomero();
        assertEquals(15.0, division.raiz(225.0), 0.0001);
        System.out.println("Debe dar 15: " + division.raiz(225.0));
        assertEquals(Double.NaN, division.raiz(-144), 0.0001);
    }
}
