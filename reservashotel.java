import java.util.Scanner;

public class reservashotel {

    public static void validarReserva(
            String nombre, int habitacion, int noches, double precioPorNoche)
            throws IllegalArgumentException {

        if (nombre.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "El nombre del cliente no puede estar vacío."
            );
        }

        if (habitacion <= 0) {
            throw new IllegalArgumentException(
                "El número de habitación debe ser mayor que cero."
            );
        }

        if (noches <= 0) {
            throw new IllegalArgumentException(
                "El número de noches debe ser mayor que cero."
            );
        }

        if (precioPorNoche <= 0) {
            throw new IllegalArgumentException(
                "El precio por noche debe ser superior a cero."
            );
        }
    }

    public static double calcularPrecio(int noches, double precioPorNoche) {
        return noches * precioPorNoche;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("===== SISTEMA DE RESERVAS DE HOTEL =====");

            System.out.print("Nombre del cliente: ");
            String nombre = scanner.nextLine();

            System.out.print("Número de habitación: ");
            int habitacion = scanner.nextInt();

            System.out.print("Número de noches: ");
            int noches = scanner.nextInt();

            System.out.print("Precio por noche: ");
            double precioPorNoche = scanner.nextDouble();

            try {
                validarReserva(nombre, habitacion, noches, precioPorNoche);

                double precioTotal = calcularPrecio(noches, precioPorNoche);

                System.out.println("\nRESERVA REALIZADA CORRECTAMENTE");
                System.out.println("Cliente: " + nombre);
                System.out.println("Habitación: " + habitacion);
                System.out.println("Noches: " + noches);
                System.out.println("Precio por noche: " + precioPorNoche + " euros");
                System.out.println("Precio total: " + precioTotal + " euros");
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }
}