package conversormoneda;

public class Conversor {

    public double convertirMoneda(double cantidad, double tasaConversion) {
        return cantidad * tasaConversion;
    }

    public double calcularCotizacion(double cantidadDestino, double cantidadOrigen) {
        if (cantidadOrigen == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return cantidadDestino / cantidadOrigen;
    }

    public double aumentarSaldo(double saldoActual, double nuevoSaldo) {
        return saldoActual + nuevoSaldo;
    }

    public double extraerFisico(double saldoActual, double cantidadARetirar) {
        double restante = saldoActual - cantidadARetirar;
        if (restante < 0) {
            throw new IllegalArgumentException("Fondos insuficientes");
        }
        return restante;
    }
}
