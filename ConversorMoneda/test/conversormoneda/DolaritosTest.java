package conversormoneda;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class DolaritosTest {

    private double cantidad;
    private double cotizacion;
    private double resultadoEsperado;

    private Conversor conversor = new Conversor();

    // Constructor que recibe los parámetros para cada ejecución de la prueba
    public DolaritosTest(double cantidad, double cotizacion, double resultadoEsperado) {
        this.cantidad = cantidad;
        this.cotizacion = cotizacion;
        this.resultadoEsperado = resultadoEsperado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][] {
                { 180000, 1500, 120 },
                { 120000, 0, Double.NaN },
                { 100000, -900, 111.11 },
        });
    }

    @Test
    public void testCotizarCero() {
        double resultadoObtenido = conversor.calcularCotizacion(cantidad, cotizacion);

        // Manejar el caso de división por cero
        if (Double.isNaN(resultadoEsperado)) {
            assertTrue(Double.isNaN(resultadoObtenido));
        } else {
            assertEquals(resultadoEsperado, resultadoObtenido, 0.02);
        }
    }
}