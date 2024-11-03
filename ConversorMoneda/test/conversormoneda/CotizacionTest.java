package conversormoneda;
import org.junit.Test;

public class CotizacionTest {

    @Test(expected = ArithmeticException.class)
    public void testCotizarCero() {
        Conversor conversor = new Conversor();
        // Intentamos calcular una cotización con una cotización de 0, si ponemos mayor a 0 deberia fallar
        conversor.calcularCotizacion(100, 0);
    }
}