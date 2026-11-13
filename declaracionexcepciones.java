import java.util.Scanner;

public class declaracionexcepciones {

    public static double calcularRaiz(double numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException(
                "Error: No se puede calcular la raíz cuadrada de un número negativo."
            );
        }

        return Math.sqrt(numero);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce un número: ");
            double numero = scanner.nextDouble();

            double raiz = calcularRaiz(numero);
            System.out.println("La raíz cuadrada es: " + raiz);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


















