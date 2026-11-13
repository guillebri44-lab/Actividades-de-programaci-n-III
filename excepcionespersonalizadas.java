import java.util.Scanner;

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}

public class excepcionespersonalizadas {

    private static final String TITULAR = "Juan";
    private static final double SALDO_INICIAL = 500.0;

    public static double retirarDinero(double saldo, double cantidad)
            throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException(
                "Error: Saldo insuficiente para realizar la operación."
            );
        }

        return saldo - cantidad;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldoActual = SALDO_INICIAL;

        System.out.println("Titular: " + TITULAR);
        System.out.printf("Saldo inicial: %.0f euros%n", saldoActual);
        System.out.print("Cantidad que desea retirar: ");
        double cantidad = scanner.nextDouble();

        try {
            saldoActual = retirarDinero(saldoActual, cantidad);
            System.out.println("Retirada realizada correctamente.");
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("Saldo actual: %.0f euros%n", saldoActual);
        scanner.close();
    }
}
