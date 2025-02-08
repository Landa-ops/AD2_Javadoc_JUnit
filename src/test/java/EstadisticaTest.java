import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.unir.javabeans.Estadistica_AndreeaIstrate;

class EstadisticaTest {
private Estadistica_AndreeaIstrate estadistica;
    @BeforeEach
    void setUp() {
        estadistica = new Estadistica_AndreeaIstrate();
    }

    @Test
    void mediaAritmetica() {
        double[] datos = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println("Media: " + estadistica.mediaAritmetica(datos));

    }

    @Test
    void varianza() {
        double[] datos = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println("Varianza: " + estadistica.varianza(datos));

    }

    @Test
    void desviacionEstandar() {
        double[] datos = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println("Desviación Estándar: " + estadistica.desviacionEstandar(datos));
    }
}