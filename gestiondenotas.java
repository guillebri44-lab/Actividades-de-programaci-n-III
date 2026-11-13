import java.util.Scanner;

public class gestiondenotas {

    public static void validarNota(double nota) throws IllegalArgumentException {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException(
                "Error: La nota debe estar comprendida entre 0 y 10."
            );
        }

        System.out.println("Nota introducida correctamente: " + nota);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Introduce una nota: ");
                double nota = scanner.nextDouble();

                try {
                    validarNota(nota);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
