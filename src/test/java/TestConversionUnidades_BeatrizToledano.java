import org.unir.javabeans.ConversionUnidades_BeatrizToledano;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestConversionUnidades_BeatrizToledano {
    private ConversionUnidades_BeatrizToledano conv;

    @BeforeEach
    void setUp() {
        conv = new ConversionUnidades_BeatrizToledano();
    }

    // Testeo para convertir de Celsius a Fahrenheit
    @Test
    void celsiusAFahrenheit() {
        double num1 = 15;
        System.out.println(conv.celsiusAFahrenheit(num1) + "º Fahrenheit");
    }

    // Testeo para convertir de Fahrenheit a Celsius
    @Test
    void fahrenheitACelsius() {
        double num2 = 60;
        System.out.println(conv.fahrenheitACelsius(num2) + "º Celsius");
    }

    // Testeo para convertir de grados a radianes
    @Test
    void gradosARadianes() {
        double num3 = 90;
        System.out.println(conv.gradosARadianes(num3) + " Radianes");
    }

    // Testeo para convertir de radianes a grados
    @Test
    void radianesAGrados() {
        double num4 = 120;
        System.out.println(conv.radianesAGrados(num4) + " Grados");
    }
}