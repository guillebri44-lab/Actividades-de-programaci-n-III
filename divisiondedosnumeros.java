import java.util.Scanner;

public class divisiondedosnumeros {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce el primer número entero: ");
            int primero = scanner.nextInt();

            System.out.print("Introduce el segundo número entero: ");
            int segundo = scanner.nextInt();

            if (segundo == 0) {
                System.out.println("Error: No se puede dividir entre cero.");
                return;
            }

            System.out.println("Resultado: " + (primero / segundo));
        }
    }
}