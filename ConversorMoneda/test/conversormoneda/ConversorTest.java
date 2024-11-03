package conversormoneda;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConversorTest {

    private static Conversor conversor;

    @BeforeClass
    public static void iniciarClase() {
        System.out.println("Bienvenido a las pruebas de Conversor de moneda");
        conversor = new Conversor();
    }

    @Before
    public void iniciarMetodo() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @After
    public void finalizarMetodo() {
        System.out.println("Prueba finalizada");
    }

    @AfterClass
    public static void finalizarClase() {
        System.out.println("La operación ha finalizado");
    }

    @Test
    public void testConvertirMoneda() {
        assertEquals(1200, conversor.convertirMoneda(1000, 1.2), 0.001);
    }

    @Test
    public void testCalcularCotizacion() {
        assertEquals(0.9, conversor.calcularCotizacion(1620, 1800), 0.001);
    }

    @Test
    public void testAumentarSaldo() {
        assertEquals(1000, conversor.aumentarSaldo(500, 500), 0.001);
    }

    @Test
    public void testExtraerFisico() {
        assertEquals(2000, conversor.extraerFisico(2100, 100), 0.001); // probar combinaciones de distintos valores para que falle
    }
}