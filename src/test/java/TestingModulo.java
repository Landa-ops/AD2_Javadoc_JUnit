import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.unir.javabeans.Modulo_EvaLopez;

public class TestingModulo {

 private Modulo_EvaLopez modulo;
 private int resultado;

    @BeforeEach
    public void setUp(){
        modulo = new Modulo_EvaLopez();
    }

    @Test
    //test 1 calcular módulos
    public void testCalcularModulo(){
        int dividendo = 3;
        int divisor = 2;
        int resultado = modulo.calcularModulo();
    }

    //test 2 calcular módulos
    @Test
    //test 2 calcular valores absolutos.
    public void testCalcularValorAbsoluto(){
        double a = 65.5;
        double resultado = modulo.calcularValorAbsoluto();
    }


}
